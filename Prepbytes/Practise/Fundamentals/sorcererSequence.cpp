//Sorcerer Sequence - Prepbytes

#include <bits/stdc++.h>
#include <iostream>
using namespace std;
typedef long long ll;

int main()
{
    ll t,n;
    cin>>t;
    vector<vector<ll>> ans;
    ans.reserve(t);

    while(t--)
    {
        cin>>n;
        vector<ll> oas;
        oas.reserve(1000);
        oas.push_back(n);
        // cout<<8 & 1;
        while(n>1)
        {
            if((n&1)==0)
            {
                n=(ll)pow(n,0.5);
                oas.push_back(n);
            }
            else
            {
                n=(ll)pow(n,1.5);
                oas.push_back(n);
            }
        }
        ans.push_back(oas);
        oas.clear();
    }

    for(ll i=0;i<ans.size();i++)
    {
        for(ll j=0;j<ans[i].size()-1;j++)
        {
            cout<<ans[i][j]<<" ";
        }
        cout<<ans[i][ans[i].size()-1];
        cout<<endl;
    }

    return 0;
}