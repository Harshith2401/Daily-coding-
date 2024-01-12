#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num=51,m=0;
    while(num>1)
    {
        if(num%2==0)
        {
            num=num/2;
            m=num+m; 
        }
        else
        {
            num=num/2;
            m=num+m;
            num=num+1;
        }
    }
    printf("%d",m);
    return 0;
}