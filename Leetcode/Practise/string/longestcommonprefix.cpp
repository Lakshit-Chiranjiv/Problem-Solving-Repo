//Longest common prefix

#include <bits/stdc++.h>
using namespace std;

string longestCommonPrefix(vector<string>& strs)
{
    string ans="",chl,sml=strs[0],insub;
    int smi=0,hor,kb;
    for(int i=1;i<strs.size();i++)
    {
        if(strs[i].size()<sml.size())
        {
            smi=i;
            sml=strs[i];
        }
    }
    kb=sml.size();
    
    while(kb>0)
    {
        chl=sml.substr(0,kb);
        hor=1;
        for(int i=0;i<strs.size();i++)
        {
            if(i==smi)
                continue;
            insub=strs[i].substr(0,kb);
            if(insub!=chl)
                hor=0;
        }
        if(hor==1)
        {
            ans=chl;
            break;
        }
        kb--;
    }

    return ans;
}

int main()
{
    int n;
    cin>>n;
    vector<string> strs;
    strs.reserve(n);
    string tmp,ans;
    for(int i=0;i<n;i++)
    {
        cin>>tmp;
        strs.push_back(tmp);
    }

    ans=longestCommonPrefix(strs);

    cout<<ans<<endl;

    return 0;

}