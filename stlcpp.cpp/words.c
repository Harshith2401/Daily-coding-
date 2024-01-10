#include<stdio.h>
#include<stdlib.h>
int main ()
{
    char *words[]={"leet","code","course"};
    int size=sizeof(words)/sizeof(words[0]);
    if(size<=0)
    {
        printf("emptu array");
        return 0;
    }
    char s='e';
    for(int i=0;i<size;i++)
    {
        for(int j=0;words[i][j]!='\0';j++)
        {
            if(words[i][j]==s)
            {
                printf("%d ",i);
                break;
            }

        }
        
    }
    return 0;
}