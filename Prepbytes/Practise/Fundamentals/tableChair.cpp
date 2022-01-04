//Table Chair - Prepbytes

#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

int main()
{
    ll t,m,r1,r2,r3,tc;
    cin>>t;
    vector<ll> ans;
    ans.reserve(t);

    while(t--)
    {
        cin>>m>>r1>>r2>>r3;
        if(m%4==0)
        {
            ans.push_back(0);
            continue;
        }
        ll rm=m%4;
        ll rq=4-rm;
        if(rq==1)
        {
            ans.push_back(min(r1,min((r2+r3),(r3*3))));
            continue;
        }
        else if(rq==2)
        {
            ans.push_back(min((2*r1),min(r2,(2*r3))));
            continue;
        }
        else
        {
            ans.push_back(min((3*r1),min((r2+r1),r3)));
            continue;
        }
    }

    for(ll x:ans)
    cout<<x<<endl;

    return 0;

}