// string palindrome using array.
#include<stdio.h>
#include<stdlib.h>
int main()
{
	char arr[]={"abccba"};
	int i,j,size,p=0;
	size=sizeof(arr)-1;
	for(i=0,j=size-1;i<j;i++,j--)
	{
		if(arr[i]==arr[j])
		{
			p++;
		}
	}
	if(p==size/2)
	{
		printf("palindrom");
	}
	else
	{
		printf("not palindrome");
	}
	return 0;
}