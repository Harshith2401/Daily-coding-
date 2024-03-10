/*Question:
Given an array of characters (only small a to z) print the frequency of each character present in the array.
Example :
A = [ a, b, c, b, a]
Output: 
Freq of a is 2
Freq of b is 2
Freq of c is 1*/
#include<stdio.h>
#include<stdlib.h>

int main() {
    char arr[] = {'a', 'b', 'c', 'b', 'a'};
    int size = sizeof(arr) / sizeof(arr[0]);

    if (size <= 0) {
        return 0;
    }
        //TC=O(n)*O(n)=O(n^2)
    for (int i = 0; i < size; i++) {//TC=O(n)
        int frequency = 1;

        if (arr[i] != '@') {
            for (int j = i + 1; j < size; j++) {// TC=O(n)
                if (arr[i] == arr[j]) {
                    frequency++;
                    arr[j] = '@';
                }
            }
            printf("The frequency of %c is %d\n", arr[i], frequency);
        }
    }
    return 0;
}
//TIME COMPLEXITY=O(n^2)
