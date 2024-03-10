/*Question:
Given an array of characters (only small a to z) print the frequency of each character present in the array.
Example :
A = [ a, b, c, b, a]
Output: 
Freq of a is 2
Freq of b is 2
Freq of c is 1*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    char arr[]={'a','b','c','a','c'};
    int frequency[26]={0};                  //creted a extra array of 26 size and each is initialised by0
    int size=sizeof(arr)/sizeof(arr[0]);
    for( int i=0;i<size;i++)//TC=O(n)
    {
        frequency[arr[i]-'a']++;            //this is to locate the array of frequency and increse the frequency a is used as ascci values.
    }
    for(int i=0;i<26;i++)//TC=O(n)
    {
        if(frequency[i]>0)
        {
            printf("%c:%d\n",i+'a',frequency[i]);
        }
    }
    return 0;
}
//TIME COMPLEXITY=O(n)+O(n)=O(2n)=O(n)