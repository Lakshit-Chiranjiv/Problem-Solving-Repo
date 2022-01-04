//Fit Square - Prepbytes

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main()
{
    ll t,m,n,a;
    cin>>t;
    vector<ll> ans;
    ans.reserve(t);

    while(t--)
    {
        cin>>m>>n;
        if((m*n)%2==0)
        a=(m*n)/2;
        else
        a=((m*n)-1)/2;
        ans.push_back(a);
    }

    for(ll x:ans)
    cout<<x<<endl;

    return  0;
}