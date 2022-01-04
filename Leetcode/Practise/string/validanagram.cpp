#include <bits/stdc++.h>
using namespace std;

bool isAnagram(string s, string t)
{
    int arr[27]={0};
    int asc;
    for(int i=0;i<s.size();i++)
    {
        asc=(int)s.at(i);
        arr[asc-96]++;
    }
    for(int i=0;i<t.size();i++)
    {
        asc=(int)t.at(i);
        arr[asc-96]--;
    }
    for(int i=0;i<27;i++)
    {
        if(arr[i]!=0)
            return false;
    }
    return true;
}

int main()
{
    string s,t;
    cin>>s>>t;
    bool ans;
    ans=isAnagram(s,t);
    if(ans)
        cout<<"true"<<endl;
    else
        cout<<"false"<<endl;
    return 0;
}