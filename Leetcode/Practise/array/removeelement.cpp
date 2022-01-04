//remove element

#include <bits/stdc++.h>
using namespace std;

int removeElement(vector<int>& nums, int val)
{
    if(nums.size()==0)
        return 0;
    
    vector<int>::iterator it;
    it = nums.begin();
    for(int i=0;i<nums.size();i++)
    {
        if(nums[i]==val)
        {
            nums.erase(it);
            i--;
        }
        else
            it++;
    }
    return nums.size();
}

int main()
{
    int n;
    cin>>n;
    vector<int> nums;
    nums.reserve(n);
    int ans,tmp,val;
    for(int i=0;i<n;i++)
    {
        cin>>tmp;
        nums.push_back(tmp);
    }
    cin>>val;
    ans=removeElement(nums,val);
    cout<<ans<<endl;

    for(int x:nums)
    {
        cout<<x<<" ";
    }
    return 0;
}