//boxes and toys - prepbytes

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main()
{
    ll n,t,c,ans=0;
    cin>>n;
    while(n--)
    {
        cin>>t>>c;
        if(c-t>=2)
        ans++;
    }
    cout<<ans;
    return 0;
}