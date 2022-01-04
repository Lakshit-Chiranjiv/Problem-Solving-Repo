//prepbytes

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t,n;
    cin>>t;
    vector<int> ans;
    while(t--)
    {
        cin>>n;
        if(n%10==0)
        {
            ans.push_back(0);
            continue;
        }
        if(n%10==5)
        {
            ans.push_back(1);
            continue;
        }
        ans.push_back(-1);
    }

    for(int x:ans)
    {
        cout<<x<<endl;
    }
    return 0;
}