// break the arrays into two and find the addition and subtraction.
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr[]={1,2,3,4};
    int sum1=0,dif1=0,dif2=0,sum2=0;
    int size=sizeof(arr)/sizeof(arr[0]);
    if(size<=0||size<=1)											//8.for empty array case and if they give one element it is not possible to the question.
    {
        printf("empty array or not suficeint elements");
    }
    else
    {
        if(size%2==0)												//14.here if the size of array is even or odd is checked .	
        {
            for(int i=0;i<size;i++)
            {
                if(i%2==0)											//18.here the addition and differnce is made for index number 0,2,4,6,8....
                {
                    sum1=sum1+arr[i];
                    dif1=dif1-arr[i];
                }
                else												//23. here the remainig elemenets sum and difference ie 1,3,5,7,....
                {
                    sum2=sum2+arr[i];
                    dif2=dif2-arr[i];
                }
            }
        }
        else														//30.now this for odd size array
        {   
            for(int i=0;i<size-1;i++)
            {
                if(i%2==0)											//34.adiition and subtraction for even index
                {
                    sum1=sum1+arr[i];
                    dif1=dif1-arr[i];
                }
                else												//39.addition and subtraction for odd index
                {
                    sum2=sum2+arr[i];
                    dif2=dif2-arr[i];
                }
            }
            sum1=sum1+arr[size-1];									//45-48. adding and subtracting the last element as it is odd size array.
            sum2=sum2+arr[size-1];
            dif1=(dif1-arr[size-1]);
            dif2=(dif2-arr[size-1]);
        }
        int addarray[]={sum1,sum2};
        int subarray[]={dif1,dif2};
        for(int a=0;a<2;a++)
        {
            printf("%d ",addarray[a]);
        }
        for(int d=0;d<2;d++)
        {
            printf("%d ",subarray[d]);
        }
    }
    return 0;
}
    
 