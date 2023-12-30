/*converting integer to binery only positive greater than 0*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num=123,i=0;
    int arr[65]={};
    if(num<=0)
    {
        printf("enetr positive integer");
        return 0;
    }
    while(num>0)
    {
        // here the remainder is stired in array.
        arr[i]=num%2;

        // here the quotient becomes the num of next iteration.
        num=num/2;
        i++;
    }
    for(int j=i-1;j>=0;j--)
    {
        printf("%d",arr[j]);
    }
    return 0;

}