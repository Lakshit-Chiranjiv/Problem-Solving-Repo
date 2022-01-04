#include <bits/stdc++.h>
using namespace std;

bool wordPattern(string pattern, string s)
{
    string arr[26]={""};
    int ps=pattern.size();
    s=s+" ";
    int nn=0;
    int ss=s.size();
    string wrd="";
    int ch;
    vector<string> vec;
    vec.reserve(ss);
    for(int i=0;i<ss;i++)
    {
        if(s.at(i)!=' ')
        {
            wrd=wrd+s.at(i);
        }
        else
        {
            vec.push_back(wrd);
            wrd="";
        }
    }
    if(vec.size()!=ps)
        return false;
    for(int i=0;i<ps;i++)
    {
        ch=(int)pattern.at(i);
        if(arr[ch-97]=="")
        {
            arr[ch-97]=vec[i];
        }
        else
        {
            if(arr[ch-97]!=vec[i])
                return false;
        }
    }

    for(int i=0;i<26;i++)
    {
        if(arr[i]!="")
            nn++;
    }

    set<char> stx;

    for(char x:pattern)
    {
        stx.insert(x);
    }

    set<string> st(begin(arr),end(arr));
    if(st.size()-stx.size()!=1)
        return false;
    

    return true;
}

int main()
{
    string pattern,s;
    cin>>pattern;
    cin.get();
    getline(cin,s);
    bool ans;
    ans=wordPattern(pattern,s);
    if(ans)
        cout<<"true"<<endl;
    else
        cout<<"false"<<endl;
    return 0;
}