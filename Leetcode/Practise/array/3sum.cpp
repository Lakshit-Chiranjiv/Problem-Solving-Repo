//3 sum
//this solution gives tle
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,t;
    cin>>n;
    vector<int> nums;
    nums.reserve(n);
    vector<vector<int>> ans;
    ans.reserve(1000);
    vector<int> v;
    for(int i=0;i<n;i++)
    {
        cin>>t;
        nums.push_back(t);
    }

    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(nums[i]+nums[j]+nums[k]==0)
                {
                    v.push_back(nums[i]);
                    v.push_back(nums[j]);
                    v.push_back(nums[k]);
                    sort(v.begin(),v.end());
                    ans.push_back(v);
                    v.clear();
                }
            }
        }
    }

    set<vector<int>> s(ans.begin(),ans.end());
    vector<vector<int>> vv(s.begin(),s.end());
    for(auto x:vv)
    {
        for(auto y:x)
        {
            cout<<y<<" ";
        }
        cout<<endl;
    }
    return 0;
}