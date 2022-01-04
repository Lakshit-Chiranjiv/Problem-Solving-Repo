#include <bits/stdc++.h>
using namespace std;

string reverseVowels(string s)
{
    int n=s.size();
    string ans="";
    vector<char> vowels;
    vowels.reserve(n);
    for(char x:s)
    {
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
        {
            vowels.push_back(x);
        }
    }
    reverse(vowels.begin(),vowels.end());
    int z=0;
    for(char x:s)
    {
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
        {
            ans=ans+vowels[z++];
        }
        else
        {
            ans=ans+x;
        }
    }

    return ans;
}

int main()
{
    string s,rev;
    cin>>s;
    rev=reverseVowels(s);
    cout<<rev<<endl;
    return 0;
}