#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
int main()
{
    int num=100;

    //if the given number is 1.
    if(num==1)
    {
        printf("one is neither prime or composite");
        return 0;
    }

    // loop for checking the numbers untill num.
    for(int i=num;i>1;i--)
    {
        // declaring that number is a prime.
        bool flag=true;
        for(int j=2;j<i;j++)
        {
            // factor check other than 1 and itself.
            if(i%j==0)
            {
                flag=false;
                break;
            }
        }
        // the latest value of p will decide if its prime or not.
        if(flag)
        {
            printf("%d ",i);
        }
    }
    return 0;
}