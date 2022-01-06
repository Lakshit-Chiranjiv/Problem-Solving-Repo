//Subsets

#include <bits/stdc++.h>
using namespace std;

void printSubset(vector<int> nums,vector<int> op,vector<vector<int>> &ans)
{ 
    //Base case : 
    if(nums.size()==0)
    {
         ans.push_back(op);
             return; 
    } 
    //IP-OP 
    vector<int>op1=op; 
    vector<int>op2=op; 
    op2.push_back(nums[0]); 
    nums.erase(nums.begin()+0); 
    printSubset(nums,op1,ans); 
    printSubset(nums,op2,ans); 
    return; 
} 

vector<vector<int>> subsets(vector<int> & nums) 
{ 
    vector<vector<int>>ans; 
    vector<int>op; 
    printSubset(nums,op,ans); 
    vector<vector<int>> vv;

    set<vector<int>> s(ans.begin(),ans.end());
    vector<vector<int>> anns(s.begin(),s.end()); 
    return anns; 
}

int main()
{
    int n,tmp;
    cin>>n;
    vector<int> vec;
    vec.reserve(n);
    for(int i=0;i<n;i++)
    {
        cin>>tmp;
        vec.push_back(tmp);
    }
    vector<vector<int>> ans;
    ans.reserve(1024);
    ans=subsets(vec);
    for(auto x:ans)
    {
        for(auto y:x)
        {
            cout<<y<<" ";
        }
        cout<<endl;
    }
    return 0;
}