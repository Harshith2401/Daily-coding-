//finding out the size of array
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int arr[]={1,2,6,5,4};
	int size=0,l,a;
	while(arr[size]!='\0')//TC=O(n)
	{
		size++;
	}
	if(size<=0)
	{
		printf("array is empty");
	}
	else
	{
		l=arr[size-1];
		printf("%d",l);
	}
	return 0;
}
//TIMECOMPLEXITY=O(n)