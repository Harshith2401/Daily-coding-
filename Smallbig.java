/*3 Write a program in java that stores 20 integers entered by a user in an array, and 
then computes the following using appropriate methods:
(i) Smallest and Biggest elements 
(ii) nth biggest and nth smallest element
(iii) Position of smallest and biggest element */
import java.util.Scanner;
import java.util.Arrays;
class Smallbig
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int nums[]=new int[size];
        int nums1[]=new int[size];
        System.out.println("enter the elements of the array");
        //TIME COMPLEXCITY=O(n)
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
            nums1[i]=nums[i];
        }
        //Sort nums1 using Quick Sort
        quickSort(nums1, 0, size - 1);
        System.out.println("PRINTING THE SMALLEST AND BIGGEST ELEMENT");
        System.out.println("The smallest element is:"+nums1[0]);
        System.out.println("The biggest element is"+nums1[size-1]);
        System.out.println();
        System.out.println("PRINTING THE NTH SMALLEST AND BIGGEST");
        //nth smallest elements
        int j=1;
        for(int i =0;i<size;i++)//O(n)
        {
            //handeling the duplicates
            if (i==0||nums1[i]!=nums1[i - 1])
            {
                System.out.println(j+"th smallest element is:"+nums1[i]);
                j++;
            }
        }
        System.out.println();
        //nth biggest elements
        j=1;
        for(int i=size-1;i>=0;i--)//O(n)
        {
            //handeling the duplicates
            if (i==size-1||nums1[i]!=nums1[i + 1])
            {
                System.out.println(j+"th biggest element is:"+nums1[i]);
                j++;
            }
        }
        int biggest=nums[size-1];
        int smallest=nums[0];
        System.out.println();
        System.out.println("PRINTING THE POSITIONS OF SMALLEST AND BIGGEST ELEMENTS");
        //binary searsch find the postion of the smallestv element.
        int index = binarySearch(nums, smallest);
        if(index!=-1)
        {
            System.out.println("The smallest element is found at"+index+"th postion");
        }
        else
        {
            System.out.println("the element is not found");
        }
        //binary searsch find the postion of the biggest element.
        index = binarySearch(nums, biggest);
        if(index!=-1)
        {
            System.out.println("The biggest element is found at"+index+"th postion");
        }
        else
        {
            System.out.println("the element is not found");
        }
    }
    //Method to partition the array and return the pivot index
    public static int partition(int[] array,int low,int high) 
    {
        int pivot=array[high];//Choosing the rightmost element as pivot
        int i=low-1;//Index of smaller element
        for(int j=low;j<high;j++) 
        {
            //If the current element is smaller than the pivot
            if(array[j]<pivot) 
            {
                i++;
                //Swap array[i] and array[j]
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        //Swap array[i + 1] with the pivot (array[high])
        int temp=array[i + 1];
        array[i+1]=array[high];
        array[high]=temp;
        return i+1;//Return the pivot index
    }
    //TIMECOMPLEXICITY OF QUICK SORT IS ==O(n log n)
    //QuickSort algorithm
    public static void quickSort(int[] array,int low,int high) 
    {
        if (low<high) 
        {
            //Find the pivot index
            int pivotIndex=partition(array,low,high);
            //Recursively sort the left and right subarrays
            quickSort(array,low,pivotIndex-1);
            quickSort(array,pivotIndex+1,high);
        }
    }
    //TIME COMPLEXCITY OF BINARY SEARCH IS=O(log n)
    public static int binarySearch(int[] array,int target) 
    {
        int low=0;
        int high=array.length- 1;
        while (low<=high) 
        {
            int mid=low+(high-low)/2;
            //Check if target is present at mid
            if(array[mid]==target) 
            {
                return mid; // Target found
            }
            //If target is smaller, ignore right half
            if(array[mid]>target) 
            {
                high=mid-1;
            } 
            else 
            {
                //If target is greater, ignore left half
                low=mid+1;
            }
        }
        //Target element not found
        return -1;
    }

}
//TIME COMPLEXICITY =O(n log n)+O(n)