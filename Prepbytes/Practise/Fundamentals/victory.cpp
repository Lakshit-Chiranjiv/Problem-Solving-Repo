//Victory - Prepbytes

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main()
{
    ll t,l,r,a;
    cin>>t;
    vector<ll> ans;
    ans.reserve(t);

    while(t--)
    {
        cin>>l>>r;
        if(l==r)
        a=l;
        else
        a=1;
        ans.push_back(a);
    }

    for(ll x:ans)
    cout<<x<<endl;

    return 0;
}