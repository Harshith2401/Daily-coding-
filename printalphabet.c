#include<stdio.h>
#include<stdlib.h>
int main()
{
    char arr[]={"hello,how are you?"};
    int i=0;
    while(arr[i]!='\0')
    {
        if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z'))
        {
            printf("%c",arr[i]);
        }
        i++;
    }
}