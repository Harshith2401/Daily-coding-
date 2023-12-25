#include<stdio.h>
#include<stdlib.h>
int main()
{
    char arr[]={'a','b','c','b','a'};
    int size=sizeof(arr)/sizeof(arr[0]);
    char s='@';
    if(size<=0)
    {
        return 0;
    }
    for(int i=0,j=j+1;i<size||j<size;i++)
    {
        int frequency=1;
        if(arr[i]!='@')
        {
            if(arr[i]==arr[j])
                {
                    frequency++;
                    arr[j]='@';
                }
             printf("the frequency of %c is %d\n",arr[i],frequency);
        }
    }
    return 0;
}