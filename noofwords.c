/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences [i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.
Example 1:
Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation:
The first sentence, "alice and bob love leetcode", has 5 words in total.
The second sentence, "i think so too", has 4 words in total.
The third sentence, "this is great thanks very much", has 6 words in total. Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
Example 2:
Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
Explanation: It is possible that mult sentences contain the same number of words.
In this example, the second and third sentences (underlined) have the same*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    //pointer char array for multiple string decleration.
    char *sen[]={"hello world","iam coding in c","days make a week"};
    int size=sizeof(sen)/sizeof(sen[0]);
    if(size<=0)
    {
        printf("empty string");
        return 0;
    }
    int temp=0,sp;

    //this loop used to iterate number of strings.
    for(int i =0;i<size;i++)//TC=O(n)
    {
        sp=0;//making sp(space) everytime 0for new string

        // in this llop i used 2d array to iterate through the letters of the string.
        for(int j=0;sen[i][j]!='\0';j++)//TC=O(m)
        {
            if(sen[i][j]==' ')
            {
                sp=sp+1;
            }
        }
        if(sp>temp)
        {
            temp=sp;// updating the max space value to temp.
        }
    }

    // +1 i sude cause we calculate spaces here but we need words.
    printf("%d",temp+1);
    return 0;
}
//TIMECOMPLIXIXTY=O(n)*O(m)= O(m*n)