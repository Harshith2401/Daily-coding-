#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
int main()
{
    int arr[]={6,8,9,17};
    int size=sizeof(arr)/sizeof(arr[0]);
    bool result[size];
    int j=0,factorial;
    if(size<=0)
    {
        printf("empty array");
    }
    else
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]<=1)
            {
                printf("invalid");
            }
            else
            {
                factorial=0;
                for(int k=1;k<=arr[i];k++ )
                {
                    if(arr[i]%k==0)
                    {
                        factorial++;
                    }
                }
                if(factorial>2)
                {
                    result[j]= false;
                }
                else
                {
                    result[j]=true;
                }
                j++;
            }
        }
    }
    for(int l=0;l<size;l++)
    {
        printf("%s ",result[l] ?"true":"false");
    }
    return 0;
}