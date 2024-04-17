#include<stdio.h>
#include<stdlib.h>
int main()
{
    char str[]={"abbac"};
    int size=sizeof(str)/sizeof(str[0])-1;
    printf("%d",size);
}