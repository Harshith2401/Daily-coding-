/*Question: 

Given an array of marks secured by students in an exam. 

Find 
1) No. of the students passed
2) No. of students failed
3) Pass %
4) Fail %
5) Mean of marks
6) Median of marks


If we award x bonus marks to students, pass % will be 100. Find x. 

Make all standard assumptions like passing score etc..*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int marks[]={100,50,64,89,76,14,28};
    int size=sizeof(marks)/sizeof(marks[0]);
    // empty array condition
    if(size==0)
    {
        printf("empty array");
        return 0;
    }
    int pass_score=40;
    float pass=0,fail=0,sum=0;
    // sorting the array for median
    for(int i=0;i<size-1;i++)
    {
        for(int j=0;j<size-i-1;j++)
        {
            if(marks[j] > marks[j+1])
            {
                int temp=marks[j];
                marks[j]=marks[j+1];
                marks[j+1]=temp;
            }
        }
    }
    // calculating pass,fail,totalmarks(for mean)
    for(int i=0;i<size;i++)
    {
        sum=sum+marks[i];
        if(marks[i]<pass_score)
        {
            fail++;
        }
        else
        {
            pass++;
        }
    }
    // finding the median
    int m;
    if(size % 2 == 0)
    {
        m=(marks[(size/2)-1]+ marks[size / 2]) / 2;
    }
    else
    {
        m=marks[size/2];
    }
    // printing the stastics
    printf("Number of students passed :%.0f\n",pass);
    printf("number of students failed:%.0f\n",fail);
    printf("the pass percentage is %.2f\n",(pass/size)*100);
    printf("the fail percentage is %.2f\n",(fail/size)*100);
    printf("the median is %d\n",m);
    printf("the mean is %.1f\n",(sum/size));
    // printing the bonus mark.
    if(marks[0]<pass_score)
    {
        printf("the minimum bonus mark to make all pass is %d",40-marks[0]);/* the minimum bonus mark is passmark-the minimum marks.
        the lowest   element in that place.*/
    }
    else
    {
        printf("no need of bonus all students are passed");
    }
    return 0;
}