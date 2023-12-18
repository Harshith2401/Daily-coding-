// finding the factors of given number and storing array
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num=12,fact,j=0;
    int arr[num];
    if(num<0)
    {
        printf("invalid number");
    }
    else if(num=0)
    {
        printf("infinite factors");
    }
    else
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                arr[j]=i;
                j++;
            }
        }
        int size=j;
        for( int k=0;k<j;k++)
        {
            printf("%d ",arr[k]);
        }
    }
    return 0;
}