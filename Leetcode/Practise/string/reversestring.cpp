#include <bits/stdc++.h>
using namespace std;

void reverseString(vector<char>& s)
{
    reverse(s.begin(),s.end());
    cout<<"[";
    for(int i=0;i<s.size();i++)
    {
        if(i<(s.size()-1))
            cout<<"\""<<s[i]<<"\",";
        else
            cout<<"\""<<s[i]<<"\"]";
    }
}

int main()
{
    vector<char> v;
    int n;
    cin>>n;
    v.reserve(n);
    char tmp;
    for(int i=0;i<n;i++)
    {
        cin>>tmp;
        v.push_back(tmp);
    }
    reverseString(v);
    return 0;
}