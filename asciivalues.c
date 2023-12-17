// printing the ascci values in the array.
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr[]={'a','b','A','B'};            //here charecters are stored in integer array to store them with their asccii values.
    int size=sizeof(arr)/sizeof(arr[0]);
    int output[size][2];
    int row=0;
    if(size<=0)
    {
        printf("empty array");
    }
    else
    {
        for(int i=0;i<size;i++)
        {
            output[row][0]=arr[i];       // storing the charecter in 2d array 
            output[row][1]=arr[i];       // here also i stored the same charecter casue while printing by chnaging 
                                        //format specifier we can print ascci values.
            row++;
        }
    }
    for(int k=0;k<row;k++)              // printing the 2d array
    {
        printf("%c %d\n",output[k][0],output[k][1]); // here first i used %c to print charecter next %d to print ascci value
                                                       //as i stored in integer array
    }
    return 0;
}