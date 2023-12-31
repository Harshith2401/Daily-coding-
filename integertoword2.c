#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num=999;
    if(num==0)
    {
        printf("zero");
        return 0;
    }
    if(num<0)
    {
        printf("invalid input");
        return 0;
    }
    char *units[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    char *teens[]={"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    char *tens[]={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

    // crores.
    int crore=num/10000000;
    if(crore>0)
    {
        printf("%s crore",units[crore]);
        num%=10000000; // updating the number
    }

    //lakhs
    int lakh=num/1000000;
    if(lakh>0)
    {
        printf("%s lakh ",units[lakh]);
        num%=1000000;
    }

    //thousands
    int thousand=num/1000;
    if(thousand>0)
    {
        printf("%s thousand ",units[thousand]);
        num%=1000;
    }
    
    //hundreds
    int hundred=num/100;
    if(hundred>0)
    {
        printf("%s hundred ",units[hundred]);
        num%=100;
    }

    // tens and units
    if (num > 0)
    {
        if (num >= 11 && num <= 19)
        {
            printf("%s ", teens[num - 10]); // Fix the index here
        }
        else
        {
            int ten = num / 10;
            int unit = num % 10;
            if (ten > 0)
            {
                printf("%s ", tens[ten]);
            }
            if (unit > 0)
            {
                printf("%s", units[unit]);
            }
        }
    }

    return 0;
}


    