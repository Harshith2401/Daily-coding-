//roman to numbers
#include<stdio.h>
#include<stdlib.h>
int main()
{
    char roman[]="IL";
    int num=0;
    for(int i=0;roman[i]!='\0';i++)//TC=O(n)
    {
        switch(roman[i])//TC=O(1)
        {
            case 'I':
            if(roman[i+1]=='V'||roman[i+1]=='X')
            {
                num-=1;
            }
            else
            {
                num+=1;
            }
            break;

            case 'V':
            num+=5;
            break;

            case 'X':
            if(roman[i+1]=='L'||roman[i+1]=='C')
            {
                num-=10;
            }
            else
            {
                num+=10;
            }
            break;

            case 'L':
            num+=50;
            break;

            case 'C':
            if(roman[i+1]=='D'||roman[i+1]=='M')
            {
                num-=100;
            }
            else
            {
                num+=100;
            }
            break;

            case 'D':
            num+=500;
            break;

            case 'M':
            num+=1000;
            break;
            default :
            printf("invalid");
            return 1;
        }
    }
    printf("%d",num);
    return 0;
}
//TIMECOMPLIXIXTY=O(n)
