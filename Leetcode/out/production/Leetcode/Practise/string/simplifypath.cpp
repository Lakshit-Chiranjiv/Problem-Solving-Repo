#include <bits/stdc++.h>
using namespace std;

string simplifyPath(string s)
{
    int n=s.size();
    if(s=="/")
        return s;
    string x="",wrd="",pth="";
    stack<string> st;
    int w,y,z=0;
    for(int i=0;i<n;i++)
    {
        if(i<(n-1) && s.at(i)=='/' && s.at(i+1)=='/')
        {
            x=x+"/";
            i++;
        }    
        else if(i<(n-1) && s.at(i)=='.' && s.at(i+1)=='/')
        {
            x=x+"";
            i++;
        }
        else if(i==(n-1) && s.at(i)=='/')
            x=x+"";
        else if(i<(n-2) && s.at(i)=='.' && s.at(i+1)=='.' && s.at(i+2)=='/')
        {
            x=x+"../";
            i=i+2;
        }
        else
            x=x+s.at(i);
    }
    cout<<x<<endl;
    w=y=z;
    for(int i=1;i<x.size();i++)
    {
        if(x.at(i)=='/')
        {
            w=y;
            y=z;
        }
        if(i<(x.size()-2) && x.at(i)=='.' && x.at(i+1)=='.' && x.at(i+2)=='/')
        {
            pth=pth.substr(0,w+1);
            i+=2;
            z+=1;
        }
        else
            pth=pth+x.at(i);
        z++;
    }
    pth="/"+pth;
    int p=pth.size();
    if(pth.at(p-1)=='/')
        pth=pth.substr(0,p-1);
    return pth;
}

int main()
{
    string s,ans;
    cin>>s;
    ans=simplifyPath(s);
    cout<<ans<<endl;
    return 0;
}