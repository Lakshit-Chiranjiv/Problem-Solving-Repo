//container with most water

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,tmp;
    cin>>n;
    vector<int> hts;
    hts.reserve(n);
    int left,right;
    for(int i=0;i<n;i++)
    {
        cin>>tmp;
        hts.push_back(tmp);
    }
    int mxw=0,l=0,r=n-1;
    while(l<r)
    {
        mxw=max(mxw,(min(hts[l],hts[r])*(r-l)));
        if(hts[l]<hts[r])
            l++;
        else
            r--;
    }

    cout<<mxw<<endl;
    return 0;
}