//3 sum
//fixing one number then applying two pointer approach to sum up to the negative of the fixed number
//like a+b+c=0
//so fix a then apply two pointer from index of a+1 to n-1
//and the sum should be checked for -a
//a+b+c=0  ---> b+c=-a

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
    v.reserve(5);
    for(int i=0;i<n;i++)
    {
        cin>>t;
        nums.push_back(t);
    }
    sort(nums.begin(),nums.end());
    int left,right,curr,curn;

    for(int i=0;i<n;i++)
    {
        curr=i;
        curn=(-1)*nums[curr];
        left=curr+1;
        right=n-1;
        while(left<right)
        {
            if(nums[left]+nums[right]==curn)
            {
                v.push_back(nums[curr]);
                v.push_back(nums[left]);
                v.push_back(nums[right]);
                sort(v.begin(),v.end());
                ans.push_back(v);
                v.clear();
                left++;
                right--;
            }
            else
            {
                if(nums[left]+nums[right]<curn)
                    left++;
                else if(nums[left]+nums[right]>curn)
                    right--;
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