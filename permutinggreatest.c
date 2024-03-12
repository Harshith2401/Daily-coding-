/*If u want you can save this soln for this question.. just for archives..

Qn: 
Given a number, interchange the digits and form maximum number.*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num=01000400,digit=0,originalnum;
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
    // sorting the array in descending order
    for(int i=0;i<digit-1;i++)
    {
        for(int j=0;j<digit-i-1;j++)
        {
            if(arr[j] <arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    //conversion of array into singke number.
    int num1=0;
     for(int i=0;i<digit;i++)   
    {
        num1=num1*10+arr[i];
    } 
    printf("%d",num1);
    return 0;                     
}
//TIMECOMPLIXIXTY=O(n)*O(n)=O(n^2).