/*Given a sorted array A of size n and a number k, return the number of unique pairs which have a difference of k.
|arr[i] - arr[j]| = k where i < j
A: [1, 3, 5, 7, 10]
k: 2
Answer: 3*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int size=5;
    int count=0;
    int nums[]={1,3,3,5,7,10};
    int k=2;
    if(size==0)
    {
        printf("empty array");
        return 0;
    }
    for(int i=0;i<size-1;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            if((nums[i]-nums[j])*-1==k)
            {
                count++;
            }
        }
    }
    printf("%d",count);
    return 0;
}
//TIMECOMPLEXICITY=O(n^2)#include <stdio.h>
#include <stdlib.h>

int main() {
    int nums[] = {1, 3, 3, 5, 7, 10};
    int size = sizeof(nums) / sizeof(nums[0]);
    int count = 0;
    int k = 2;

    // Check for an empty array
    if (size == 0) {
        printf("empty array\n");
        return 0;
    }

    // We will use an auxiliary array to mark pairs that have been counted
    int alreadyCounted[size][size];
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            alreadyCounted[i][j] = 0;  // Initialize all entries to 0
        }
    }

    // Iterate over the array to find pairs
    for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            if (abs(nums[i] - nums[j]) == k && !alreadyCounted[nums[i]][nums[j]]) {
                count++;  // Increment the count for unique pairs
                alreadyCounted[nums[i]][nums[j]] = 1;  // Mark this pair as counted
                alreadyCounted[nums[j]][nums[i]] = 1;  // Mark the reverse pair also as counted
            }
        }
    }

    printf("%d\n", count);
    return 0;
}
