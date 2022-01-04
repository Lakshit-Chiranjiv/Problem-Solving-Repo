// Two Sum
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
    ll par[100] = {-1};
    ll nar[100] = {-1};
    ll dif,pdif,pnm;
    for(ll i=0;i<n;i++)
    {
        dif=target-nums[i];
        if(dif<0)
        {
            pdif=abs(dif);
            if(nar[dif]!=(-1))
            {
                ans.push_back(i);
                ans.push_back(nar[dif]);
                break;
            }
        }
        else
        {
            if(par[dif]!=(-1))
            {
                ans.push_back(i);
                ans.push_back(par[dif]);
                break;
            }
        }
        if(nums[i]<0)
        {
            pnm=abs(nums[i]);
            nar[pnm]=i;
        }
        else
        {
            par[nums[i]]=i;
        }
    }

    for(ll x:ans)
    {
        cout<<x<<" ";
    }
    return 0;
}