#include <stdio.h>
#include<stdlib.h>
int main()
{
  int arr1[]={1,5,3,2,9};
  int arr2[]={1,7,0,4,2};
  int size1=sizeof(arr1)/sizeof(arr1[0]);
  int size2=sizeof(arr2)/sizeof(arr2[0]);
  int arr3[]={};
  int k=0;
  if(size1<=0||size2<=0)
  {
    printf("null");
    return 0;
  }
  for (int i=0;i<size1;i++)
    {
      for(int j=0;j<size2;j++)
        {
          if(arr1[i]==arr2[j])
          {
            arr3[k]=arr1[i];
            k++;
            break;
          }
        }
    }
  for(int l=0;l<k;l++)
    {
      printf("%d ",arr3[l]);
    }
  return 0;
}
