#include<stdio.h>
#include<stdlib.h>
void permutation(int arr[],int start,int end);
void swap(int arr[],int i,int j);
void printing_array(int arr[],int digit);
int main()
{
    int num=12211,digit=0;
    int originalnum=num;
    do
    {
        originalnum/=10;
        digit++;
    } while (originalnum!=0);
    
    int arr[digit];
    originalnum=num;

    // keeping the given number in the array
    for(int i=digit-1;i>=0;i--)
    {
        arr[i]=num%10;
        num/=10;
    }

    // permuting.
    permutation(arr,0,digit);
    return 0;
}
// function to print the array
void printing_array(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        printf("%d",arr[i]);
    }
    printf("\n");
}
// fintion to swap the digits
void swap(int arr[],int i,int j)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

// funtion to eliminte the cases where there are same digits in number.
int shouldswap(int arr[],int start,int curr)
{
    for(int i=start;i<curr;i++)
    {
        if(arr[i]==arr[curr])
        {
            return 0;//if it is true it gives 0
        }
    }
    return 1;// if it is false it gives 1 and it is true in if condition.
}

// funtion for permutation.
void permutation(int arr[],int start,int end)
{
   if(start==end)//when start==end no need of swaping so seperated it.
   {
    printing_array(arr,end);
   }
   else
   {
        for(int i=start;i<end;i++)
        {
            if(shouldswap(arr,start,i))// it will eliminate all duplicates
            {
                swap(arr,start,i);
                permutation(arr,start+1,end);// +1 is used for recursion purpose.
                swap(arr,start,i);
            }
        }
   }
}



