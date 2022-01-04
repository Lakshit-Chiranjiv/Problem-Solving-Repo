//Perfect Number and Divisors - Prepbytes

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main()
{
    ll t,n,s,m;
    cin>>t;
    vector<ll> ans;
    ans.reserve(t);

    while(t--)
    {
        m=0;
        cin>>n;
        vector<ll> fac;
        fac.reserve(n);
        for(ll i=1;i<n;i++)
        {
            if(n%i==0)
            fac.push_back(i);
        }
        s=accumulate(fac.begin(),fac.end(),0);

        if(s==n)
        m=1;

        ans.push_back(m);
    }

    for(ll x:ans)
    {
        if(x==1)
        cout<<"true"<<endl;
        else
        cout<<"false"<<endl;
    }

    return 0;

}