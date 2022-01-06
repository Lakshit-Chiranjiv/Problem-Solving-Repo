//3 sum closest

#include <bits/stdc++.h>
using namespace std;

int threeSumClosest(vector<int>& nums, int target)
{
    sort(nums.begin(),nums.end());
    int left,right,closestsum,diff;
    diff=abs(target-(nums[0]+nums[1]+nums[2]));
    closestsum=nums[0]+nums[1]+nums[2];
    for(int i=0;i<nums.size()-2;i++)
    {
        left=i+1;
        right=nums.size()-1;
        while(left<right)
        {
            if(abs(target - (nums[left]+nums[right]+nums[i])) < diff)
            {
                diff=abs(target - (nums[left]+nums[right]+nums[i]));
                closestsum=nums[left]+nums[right]+nums[i];
                cout<<closestsum<<"sss"<<diff<<endl;
                right--;
                // left++;
            }
            else if(abs(target - (nums[left]+nums[right]+nums[i]))>=diff)
            {
                left++;
            }
            else if(nums[left]+nums[right]+nums[i] == target)
            {
                return target;
            }
        }
    }
    return closestsum;
}

int main()
{
    int n;
    cin>>n;
    vector<int> nums;
    nums.reserve(n);
    int ans,tmp,target;
    for(int i=0;i<n;i++)
    {
        cin>>tmp;
        nums.push_back(tmp);
    }
    cin>>target;
    ans=threeSumClosest(nums,target);
    cout<<ans<<endl;
    return 0;
}