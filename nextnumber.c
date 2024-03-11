/*Qsn :

Given a positive integer in the array format, perform plus 1 and return the array. 

Example: arr [1,2,3] 
output: [1,2,4]

sample 2: 
given: [1,9,9]
output: [2,0,0]*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr[]={9};
    int size=sizeof(arr)/sizeof(arr[0]);
    int num=0,j=0;
    for(int i=0;i<size;i++)//TC=O(n)
    {
        num=num*10+arr[i];    // conversion of array into single number happens here 
    }                         //making single number to multiple of tens and adding the next number as the place increses it will go 100,1000... 
    int num2=num+1;            // adding +1 to that number so that we get the next number.
    int digit=0;
    int temp=num2;
    while(temp!=0)//TC=O(log(num2))           // counting the number of digitis in the number.
    {
        temp/=10;
        digit++;
    }
    int arr2[digit];
    for(int i=digit-1;i>=0;i--)//TC=O(n) // storing the number from the back location.
    {
        arr2[i]=num2%10;
        num2/=10;
    }
    for(int k=0;k<digit;k++)//TC=O(n)   // printing the array in reverse formate because when pushed number it got pushed in reverse formate.
    {
        printf("%d ",arr2[k]);
    }
    return 0;
}
//TIMECOMPLEXITY=O(n)