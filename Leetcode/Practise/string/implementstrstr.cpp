#include <bits/stdc++.h>
using namespace std;

int strStr(string haystack, string needle)
{
    int ans=-1;
    if(needle=="")
        return 0;
    if(needle!="" && haystack=="")
        return -1;

    string sub;
    int hs=haystack.size();
    int ns=needle.size();
    for(int i=0;i<(hs-ns+1);i++)
    {
        sub=haystack.substr(i,ns);
        if(sub==needle)
        {
            ans=i;
            break;
        }
    }
    

    return ans;
}

int main()
{
    string haystack,needle;
    cin>>haystack>>needle;
    int ans;
    ans=strStr(haystack,needle);
    cout<<ans<<endl;
    return 0;
}