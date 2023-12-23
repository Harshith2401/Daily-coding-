#include <stdio.h>
#include <stdlib.h>
int main()
{
  int k=6;
  int arr[]={1,2,3,4,5};
  int size=sizeof(arr)/sizeof(arr[0]);
  for(int i=0;i<=size-1;i++)
    {
      for(int j=1;j<size;j++)
        {
            if(j<i)
            {
                continue;
            }
        
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