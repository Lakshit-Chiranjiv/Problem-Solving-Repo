//prepbytes

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main()
{
    ll t,n,s,d;
    string nm;
    cin>>t;
    vector<ll> ans;
    ans.reserve(t);
    ll arr[10]={0,9,90,900,9000,90000,900000,9000000,90000000,900000000};
    ll arr2[10]={0,9,99,999,9999,99999,999999,9999999,99999999,999999999};
    while(t--)
    {
        s=0;
        cin>>n;
        nm=to_string(n);
        d=nm.length();
        for(ll i=1;i<d;i++)
        {
            s=s+(arr[i]*i);
        }
        s=s+(d*(n-arr2[d-1]));
        ans.push_back(s);
    }

    for(ll x:ans)
    {
        cout<<x<<endl;
    }
    return 0;
}