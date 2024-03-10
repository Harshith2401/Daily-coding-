//for the given k value print the index where it sum of number in array
#include <stdio.h>
#include <stdlib.h>
int main()
{
  int k=6;
  int arr[]={1,2,3,4,5};
  int size=sizeof(arr)/sizeof(arr[0]);
  //TC=O(n^2)
  for(int i=0;i<=size-1;i++)//TC=O(n)
    {
      for(int j=i+1;j<size;j++)//TC=O(n)
        {
          if(j<=i)
          {
            continue;
          }
          if(arr[i]+arr[j]==k)
          {
            printf("%d %d\n",i,j);
          }
        }
    }
  return 0;
}
//TIMECOMPLEXITY=O(n^2)