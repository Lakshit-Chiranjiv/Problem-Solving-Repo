//Two sum
#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

int main()
{
    vector<ll> ans;
    ans.reserve(2);
    ll n;
    cin>>n;
    vector<ll> nums;
    nums.reserve(n);
    ll target,tmp;
    for(ll i=0;i<n;i++)
    {
        cin>>tmp;
        nums.push_back(tmp);
    }
    cin>>target;
    ll flag=1;
    for(ll i=0;i<n;i++)
    {
        for(ll j=0;j<n;j++)
        {
            if(i==j)
                continue;
            if(nums[i]+nums[j]==target)
            {
                ans.push_back(i);
                ans.push_back(j);
                flag=0;
                break;
            }
        }
        if(flag==0)
            break;
    }
    for(ll x:ans)
    {
        cout<<x<<" ";
    }
    return 0;
}