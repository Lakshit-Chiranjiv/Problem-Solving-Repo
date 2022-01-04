//topper - prepbytes

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main()
{
    ll t,a,b,c,cc,n;
    cin>>t;
    vector<vector<ll>> ans;
    vector<ll> tmp;
    ans.reserve(t);
    while(t--)
    {
        cin>>a>>b>>c>>n;
        cc=c;
        tmp.reserve(n);
        tmp.push_back(a);
        tmp.push_back(b);
        tmp.push_back(c);
        for(int z=0;z<(n-3);z++)
        {
            tmp.push_back(a+b+c);
            c=a+b+c;
            a=b;
            b=cc;
            cc=c;
        }
        ans.push_back(tmp);
        tmp.clear();
    }
    for(ll w=0;w<ans.size();w++)
    {
        for(ll d=0;d<ans[w].size();d++)
        {
            cout<<ans[w][d]<<" ";
        }
        cout<<endl;
    }

    return 0;
}