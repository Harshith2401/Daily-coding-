// opposite of array with extra array 
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a1[]={1,2,3,4};
	int a2[]={};
	int i,size,j;
	size=sizeof(a1)/sizeof(a1[0]);
	for(i=0,j=0;i,j<size;i++,j++)//TC=O(n)
	{
		a2[j]=a1[i]*-1;
	}
	for(j=0;j<size;j++)//TC=O(n)
	{
		printf("%d ",a2[j]);
	}
	return 0;
}
//TIMECOMPLEXITY=O(n)+O(n)=O(2n)= O(n)