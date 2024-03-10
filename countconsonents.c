/*Qsn: Given a string, write a program to count the number of consonants( count duplicates too) in it. Both small and capital letters will be there.

Consonants: other than vowels a,e,i,o,u

Eg: " I am Batman" 
m+B+t+m+n ---> 5 
Output : 5*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    char arr[]={"!@#$%^&* a"};
    int size=sizeof(arr)/sizeof(arr[0]);
    if(size==0)
    {
        return 0;
    }
    int count=0;
    for(int i=0;i<size;i++)//TC=o(n)
    {
        // excuiting only if string charecter is upper or lower case .
        if((arr[i]>='A'&& arr[i]<='Z')||(arr[i]>='a' && arr[i]<='z'))
        {
            // checking if it is vowel or not.
            if(!((arr[i]=='A')||(arr[i]=='a')||(arr[i]=='E')||(arr[i]=='e')||(arr[i]=='I')||(arr[i]=='i')||(arr[i]=='O')||(arr[i]=='o')||(arr[i]=='U')||(arr[i]=='u')))
            {
                count++;
            }
        }
        
    }
    printf("%d",count);
    return 0;
}
//time complixity ==O(n)