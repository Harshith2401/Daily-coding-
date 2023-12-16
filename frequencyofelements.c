#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr[]={1,1,1,2,3,3,-1,-1};
    int size=sizeof(arr)/sizeof(arr[0]);
    int output[size][2];
    int row=0;
    int INT_MAX;
    if(size<=0)
    {
        printf("empty array");
    }
    else
    {
        for(int i=0;i<size;i++)         // outer loop where it is pointed to elements in array
        {
            int frequency=1;            // making frequency 1 inside loop cause every time it checks the new elements it should come to 1.
            if(arr[i]!=INT_MAX)              // any element is INT_MAX that means it is alredy checked 
            {
                for(int j=i+1;j<size;j++) // inner loop where it is pointed to next of elements of i.
                {
                    if(arr[i]==arr[j])    // if i pointed elements is eaual to j pointed elements.
                    {
                        frequency++;      // frequency will be incresed.
                        arr[j]=INT_MAX;        // and after incresing frequency that elements is made as INT_MAX so that next time if it comes to check it should not be considered.
                    }
                }
                output[row][0]=arr[i];   //storing the elements in 2d array as it has two colomuns here the elements checked is stored.
                output[row][1]=frequency; // here the frequency is stored.
                row++;                    // row is increased.
            }
        }
        for(int k=0;k<row;k++)
        {
            printf("%d %d\n",output[k][0],output[k][1]);  // printing of stored elements.
        }
    }
    return 0;
}

