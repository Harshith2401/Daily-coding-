/*Qsn:
Given an integer, you have a chance to swap any of its digits. Return the maximum number that can be formed by atmost one swap. 
Eg : given integer : 123
you can swap:
1 and 2
result = 213
you can swap 1 and 3
result: 321
you can swap 2 and 3 
result will be 132 
Max of these combinations is 321 .. so you should return 321.*/
// Online C compiler to run C program online
#include <stdio.h>
int main()
{
    int num=98345,digit=0,originalnum,x=0;

    // if the number is single digit number.
    if(num<=9)
    {
        printf("%d",num);
        return 0;
    }
    originalnum=num;

    // counting the number of digitis in the number.
     while(originalnum!=0) 
    {
        originalnum/=10;
        digit++;
    }
    int arr[digit];
    originalnum=num;

    // keeping the given number in the array
    for(int i=digit-1;i>=0;i--)
    {
        arr[i]=num%10;
        num/=10;
    }

    // finding out the maximum of array
    int max = 0;
    for(int i=1;i<digit;i++) 
    {
        if(arr[i]>arr[max]) 
        {
            max=i;
        }
    }

    //if maximum of array in their respective positions like descending order.test case
    for(int i=0;i<digit;i++)
    {
        // checking if the max lies in the positin it should lie.
        if(i==max)
        {
            // if yes finding out the next max value by leaving the sorted part.
            max=i+1;
            x++;
            for(int j=max+1;j<digit;j++)
            {
                if(arr[j]>arr[max])
                {
                    max=j;
                }
            }
        }
        else
        {
            break;
        }
    }

    // swaping the numbers.
    int temp=arr[x];
    arr[x]=arr[max];
    arr[max]=temp;

    //conversion of array into singke number.
    int num1=0;
    for(int i=0;i<digit;i++)   
    {
        num1=num1*10+arr[i];
    } 
    printf("%d",num1);
    return 0;
}