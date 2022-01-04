//reverse a number - prepbytes
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main()
{
    ll n,r=0,d;
    cin>>n;
    for(ll i=n;i>0;i=i/10)
    {
        d=i%10;
        r=r*10+d;
    }
    cout<<r;
    return 0;
}