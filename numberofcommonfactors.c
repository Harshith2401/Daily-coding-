#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num1=0,num2=10,count=0;

    // if one of the number is 0
    if(num1==0||num2==0)
    {
        int greater=num1>num2?num1:num2; //;// compact way to write if else(ternaray operator)
        for(int i=1;i<=greater;i++)
        {
            if(greater%i==0)
            {
                count++;
            }
        }
        printf("%d",count);
        return 0;
    }

    int smaller=num1<num2?num1:num2;// compact way to write if else(ternaray operator)
    for( int i=1;i<=smaller;i++)
    {
        if(num1%i==0&&num2%i==0)
        {
            count++;
        }
    }
    printf("%d",count);
    return 0;
}
