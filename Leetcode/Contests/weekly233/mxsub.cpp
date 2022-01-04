#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
vector<int> nums{10,20,30,5,10,50};
vector<int> v;
int a=nums[0],b=nums[1];
int s=a;
for(int i=0;i<nums.size()-1;i++)
{
    if(a<=b)
    {
        s+=b;
        a=b;
        if(i!=nums.size()-2)
            b=nums[i+2];
    }
    else
    {
        v.push_back(s);
        a=b;
        if(i!=nums.size()-2)
            b=nums[i+2];
        s=a;
    }
}   
sort(v.begin(), v.end(), greater<int>());
int x=v[0];
if(x!=s)
    v.push_back(s);
sort(v.begin(), v.end(), greater<int>());
int y=v[0];
if(y!=x)
    x=y;
cout<<"ANS : "<<x;
return 0;
}