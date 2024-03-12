#include<stdio.h>
#include<stdlib.h>
int main()
{
    int num=1000;
    int flag[num + 1];

    // initializing the array to 1
    for(int i=0;i<=num;i++)//TC=O(n)
    {
        flag[i]=1;
    }

    // SIEVE OF ERATOSTHENES.
    for(int i=2;i*i<=num;i++)//TC=O(sqrt(n))
    {
        if(flag[i] == 1)
        {
            for(int j=i*i;j<=num;j+=i)//TC=O(logn)
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
    //TIMECOMPLIXIXTY=O(sqrt(m)*logn)
}
