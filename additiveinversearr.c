//create an array to the given array so tha when we add the result should be 0.
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a1[]={1,2,3,4};
	int a2[]={};
	int i,size,j;
	size=sizeof(a1)/sizeof(a1[0]);
	if(size<0)
	{
		printf("empty array");
	}
	else
	{
		for(i=0,j=0;i,j<size;i++,j++)// TC=O(n)
		{
			a2[j]=a1[i]*-1;
		}
		for(j=0;j<size;j++)//TC=O(n)
		{
			printf("%d ",a2[j]);
		}
	}
		return 0;
}
// time complexity= n+n=2n =O(n)
