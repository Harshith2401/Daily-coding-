#include<iostream>
#include<stack>
using namespace std;
int main()
{
    stack<int> s({1,2,3,4,5});
    if(s.empty())
    {
        cout<<"stack is empty";
    }
    else
    {
        cout<<s.top() <<endl;
    }
    return 0;
}