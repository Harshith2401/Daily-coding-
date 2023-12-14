//merging of two arrays with one for loop

#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr1[]={1,2,3};
    int arr2[]={6,5,4};
    int size1=sizeof(arr1)/sizeof(arr1[0]);
    int size2=sizeof(arr2)/sizeof(arr2[0]);
    int merged[size1+size2];
    int SIZE;
    SIZE=size1+size2;
    int k=size2-1;
    if(SIZE<=0)
    {
        printf("empty array");
    }
    else
    {
        for(int j=0,i=0;j<SIZE;j++)
        {
            if(i<size1)
            {
                merged[j]=arr1[i];
                i++;
            }
            else
            {
                if(k>=0)
                {
                    merged[j]=arr2[k];
                    k--;
                }
            }
            printf("%d ",merged[j]);
        }        
    }
    return 0;
}