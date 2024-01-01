#include <stdio.h>
#include<stdlib.h>
int main()
{
    int num=19;
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

    char *units[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    char *teens[] = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    char *tens[] = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    // crores
    int crore=num / 10000000;
    if (crore>0)
    {
        if(crore>=1000000)
        {
            printf("%s crore", units[crore]);
            crore%=1000000; // updation of number.
        }
        if (num>0)
        {
            printf(" ");
        }
    
        if (crore>=11 && crore<=19) // checking the crore if it  is in teens and doing the process.
        {
            printf("%s",teens[crore-10]); 
        }
        else
        {
            int ten=crore/10;
            int unit=crore%10;
            if (ten>0)
            {
                printf("%s",tens[ten]);
                if (unit>0)
                {
                    printf(" ");
                }
            }
            if (unit>0)
            {
                printf("%s",units[unit]);
            }
        }
        printf(" crore");
        num%=10000000;
        if(num>0)
        {
            printf(" ");
        }
    }
    // lakhs
    int lakh=num/100000;
    if (lakh>0)
    {
        if(lakh>=1000)
        {
            printf("%s lakh", units[lakh]);
            lakh%=1000;
        }
        if(num>0)
        {
            printf(" ");
        }
    
        if (lakh>=11&&lakh<=19)
        {
            printf("%s",teens[lakh-10]);
        }
        else
        {
            int ten=lakh/10;
            int unit=lakh%10;
            if (ten>0)
            {
                printf("%s", tens[ten]);
                if (unit>0)
                {
                    printf(" ");
                }
            }
            if (unit>0)
            {
                printf("%s", units[unit]);
            }
        }

        printf(" lakhs");
        num%=100000;
        if (num>0)
        {
            printf(" ");
        }
    }

    // thousands
    int thousand=num/1000;
    if (thousand>0)
    {
        if (thousand>=100)
        {
            printf("%s hundred", units[thousand/100]);
            thousand%=100;
            if (thousand>0)
            {
                printf(" ");
            }
        }

        if (thousand>=11&&thousand<=19)
        {
            printf("%s", teens[thousand-10]);
        }
        else
        {
            int ten = thousand/10;
            int unit = thousand%10;
            if (ten>0)
            {
                printf("%s", tens[ten]);
                if (unit>0)
                {
                    printf(" ");
                }
            }
            if (unit>0)
            {
                printf("%s", units[unit]);
            }
        }

        printf(" thousand");
        num%=1000;
        if (num>0)
        {
            printf(" ");
        }
    }

    // remaining hundreds, tens, and units
    int hundred=num/100;
    if(hundred>0)
    {
        printf("%s hundred",units[hundred]);
        num%=100;
        if(num>0)
        {
            printf(" ");
        }
    }

    if(num>0)
    {
        if (num>=11&&num<=19)
        {
            printf("%s",teens[num-10]);
        }
        else
        {
            int ten=num/10;
            int unit=num%10;
            if (ten>0)
            {
                printf("%s",tens[ten]);
                if (unit>0)
                {
                    printf(" ");
                }
            }
            if (unit>0)
            {
                printf("%s", units[unit]);
            }
        }
    }
    return 0;
}
