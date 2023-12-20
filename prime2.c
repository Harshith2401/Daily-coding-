#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
int main()
{
    int arr[]={6,8,9,17,2};
    int size=sizeof(arr)/sizeof(arr[0]);
    bool result[size];
    int j=0,factorial;
    bool flag;
    if(size<=0)
    {
        printf("empty array");
        return 0;
    }

    for(int i=0;i<size;i++)
    {
        if(arr[i]<=1)
        {
            printf("invalid");
            
        }
        if(arr[i]==2)
        {
            result[j]=true;
            continue;
        }
        else
        {
            factorial=0;
            flag = true;
            for(int k=2;k<arr[i];k++ )
            {
                if(arr[i]%k==0)
                {
                    flag=false;
                    break;
                }

            }
            if(flag)
            {
                result[j]= true;
            }
            else
            {
                result[j]=false;
            }
            j++;
        }
    }

    for(int l=0;l<size;l++)
    {
        printf("%s ",result[l] ?"true":"false");
    }
    return 0;
}
