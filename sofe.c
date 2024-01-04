#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

int main()
{
    int num=200,k=2;
    int flag[num + 1];

    // initializing the array to 1
    for(int i=0;i<=num;i++)
    {
        flag[i]=1;
    }

    // SIEVE OF ERATOSTHENES.
    for(int i=2;i*i<=num;i++)
    {
        if(flag[i] == 1)
        {
            for(int j=i*i;j<=num;j+=i)
            {
                flag[j]=0;
            }
        }
    }

    // printing the elements which are primes.
    for(int i=2;i<=num;i++)
    {
        if(flag[i]==1)
        {
            printf("%d ", i);
        }
    }
    return 0;
}
