/*Qsn :

Convert a given integer to word

Input :
123
op: one-two-three.*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num=0,digit=0;

    // making negative integers to positive.
    if(num<0)
    {
        num=num*-1;
    }

    // decleares the pointer array . mainly to store array of strings.
    char *word[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    // test case when the number is 0
    if(num==0)
    {
        printf("%s",word[0]);
    }
    int temp=num;

    // counting the number of digits.
     while(temp!=0)//TC=o(n)
    {
        temp/=10;
        digit++;
    }
    int arr[digit];

    // converting number into array.
    for(int i=digit-1;i>=0;i--)//TC=(n)
    {
        arr[i]=num%10;
        num/=10;
    }

    //important in printf.
    for(int i=0;i<digit;i++)//TC=O(n)
    {
        //here arr[i] gives the digit and at the value of digit in *word[] array the word is stored.
        printf("%s",word[arr[i]]);
        // printing the -
        if(i<digit-1&&digit>1)
        {
            printf("-");
        }
    }
    return 0;
}
//TIMECOMPLEXITY=O(N)+O(N)+O(N)=O(3N)=O(N)