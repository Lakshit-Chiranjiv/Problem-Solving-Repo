//Trapping Rain Water

#include <bits/stdc++.h>
using namespace std;

typedef long long ll;


// int main()
// {
//     ll n,t;
//     cin>>n;
//     vector<ll> ht;
//     ht.reserve(n);
//     for(ll i=0;i<n;i++)
//     {
//         cin>>t;
//         ht.push_back(t);
//     }

//     ll lft,rt=1,rgt=-1,tot=0;

//     for(ll i=0;i<n;i++)
//     {
//         if(rt==0)
//         {
//             lft++;
//         }
//         else
//         {
//             if(rgt==-1)
//                 lft=rgt+1;
//             else
//                 lft=rgt;            
//             rt=0;
//         }
//         for(ll j=lft+1;j<n;j++)
//         {         
//             if((ht[j]>=ht[lft] && (j-lft)>1)||((j<(n-1) && ht[j]>ht[j+1] && ht[j]>ht[j-1] && (j-lft)>1)||(j==(n-1) && ht[j]>ht[j-1] && (j-lft)>1)))
//             {
//                 rgt=j;
//                 rt=1;
//                 break;
//             }
//             else if(ht[j]>=ht[lft] && (j-lft)==1)
//             {
//                 rt=0;
//                 break;
//             }
//             rt=0;
//         }
//         if(rt)
//         {
//             ll mn=min(ht[lft],ht[rgt]);
//             ll dif;
//             for(ll j=lft+1;j<rgt;j++)
//             {
//                 dif=mn-ht[j];
//                 if(dif>0)
//                     tot+=dif;
//             }
//         }
//     }
 

//     cout<<tot<<endl;
//     return 0;
// }

int main()
{
    ll n,t;
    cin>>n;
    vector<ll> ht;
    ht.reserve(n);
    for(ll i=0;i<n;i++)
    {
        cin>>t;
        ht.push_back(t);
    }

    vector<ll> left,right;
    left.reserve(n);
    right.reserve(n);
    ll x=ht[0],y=ht[n-1],mn,lmx=ht[0],rmx=ht[n-1],tot=0;
    left.push_back(ht[0]);
    for(ll i=1;i<n;i++)
    {
        lmx=max(lmx,ht[i]);
        left.push_back(lmx);
    }
    right.push_back(ht[n-1]);
    for(ll i=(n-2);i>=0;i--)
    {
        rmx=max(rmx,ht[i]);
        right.push_back(rmx);
    }
    for(ll i=0;i<n;i++)
    {
        mn=min(left[i],right[n-1-i]);
        tot+=mn-ht[i];
    }
    cout<<tot<<endl;
    return 0;
}