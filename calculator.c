#include<stdio.h>
#include<stdlib.h>
int main()
{
    float num1,num2;
    float c;
    char option;
    printf("enter num1 :");
    scanf("%f",&num1);
    printf("enter num2 :");
    scanf("%f",&num2);
    printf("enter arithmatic operator:");
    scanf(" %c",&option);
    switch(option)
    {
        case '+':
        c=num1+num2;
        printf("%.2f",c);
        break;

        case '-':
        c=num1-num2;
        printf("%.2f",c);
        break;

        case '/':
        if(num2==0&&num1!=0)
        {
            printf("undifine");
            return 0;
        }
        if(num1==0&&num2==0)
        {
            printf("0.00");
            return 0;
        }
        c=num1/num2;
        printf("%.2f",c);
        break;

        case '*':
        c=num1*num2;
        printf("%.2f",c);
        break;
        
        default:
        printf("enter valid option");
    }
    return 0;

}