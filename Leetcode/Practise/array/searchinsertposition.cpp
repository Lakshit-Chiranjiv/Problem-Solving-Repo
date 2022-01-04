#include <bits/stdc++.h>
using namespace std;

int searchInsert(vector<int>&nums,int target)
{
    int n=nums.size();
    if(target<=nums[0])
        return 0;
    if(target>nums[n-1])
        return n;
    if(target==nums[n-1])
        return n-1;
    if(n==1)
    {
        return 0;
    }
    int l=0,r=n-1,mid,pm=-1,ans=-1;
    while(l<=r)
    {
        mid=(l+r)/2;
        pm=mid;
        if(nums[l]==target)
        {
            if(l>0 && nums[l-1]!=target)
            {
                ans=l;
                break;
            }
        }
        if(nums[r]==target)
        {
            if(r>0 && nums[r-1]!=target)
            {
                ans=r;
                break;
            }
        }
        if(nums[mid]==target)
        {
            if(mid>0 && nums[mid-1]!=target)
            {
                ans=mid;
                break;
            }
        }
        else if(nums[mid]>target)
        {
            r=mid;
            if(r-l==1 && target>nums[l] && target<nums[r] && l<=r)
            {
                ans=(l+1);
                break;
            }
        }
        else if(nums[mid]<target)
        {
            l=mid;
            if(r-l==1 && target>nums[l] && target<nums[r] && l<=r)
            {
                ans=(l+1);
                break;
            }
        }
    }

    return ans;
}

int main()
{
    int n,target,tmp,ans;
    cin>>n;
    vector<int> nums;
    nums.reserve(n);
    for(int i=0;i<n;i++)
    {
        cin>>tmp;
        nums.push_back(tmp);
    }
    cin>>target;
    ans=searchInsert(nums,target);
    cout<<ans;
    return 0;
}