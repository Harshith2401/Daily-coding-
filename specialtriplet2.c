#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main() 
{
    int nums[] ={0,0,0,0};
    int size = sizeof(nums) / sizeof(nums[0]);

   
    int f = INT_MAX, s = INT_MAX;

    if (size < 3) {
        printf("insufficient");
        return 0;
    }

    for (int i = 0; i < size; i++) {
      
        if (nums[i] <= f) {
            f = nums[i];
        }

       
        else if (nums[i] <= s) {
            s = nums[i];
        } else {
            printf("false");
            return 0;
        }
    }
    printf("true");
    return 0;
}