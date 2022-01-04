//remove duplicates from sorted array

#include <bits/stdc++.h>
using namespace std;

int removeDuplicates(vector<int>& nums)
{
    if(nums.size()==0)
        return 0;
    
    vector<int>::iterator it;
    it = nums.begin();
    it++;
    int k=1;
    for(int i=1;i<nums.size();i++)
    {
        if(nums[i-1]!=nums[i])
        {
            k++;
            it++;
        }
        else
        {
            nums.erase(it);
            i--;
        }
    }   

    return k;
}

int main()
{
    int n;
    cin>>n;
    vector<int> nums;
    nums.reserve(n);
    int ans,tmp;
    for(int i=0;i<n;i++)
    {
        cin>>tmp;
        nums.push_back(tmp);
    }

    ans=removeDuplicates(nums);
    cout<<ans;
    return 0;
}