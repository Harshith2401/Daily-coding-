/*It is single elimination tournament.
Let's say 5 teams are playing
R-1... 2 teams will be eliminated ( that means two matches are played) one team will be pushed forward in tournament.

R-2 now we have 3 teams and now one team is eleminated(that means one match is palyed) and one is pushed forward into the tournament.
R-3 .. two teams are left so one match is played to eliminate one team. 

So here four matches are played..
 As it is a single elimination tournament the number of matches played will be equal to the number of teams should be eliminated to declare a winner as the winner is only one team so teams-1 will be matches played*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int matches=5;
    printf("the total matches played is %d",matches-1);
    return 0;
}