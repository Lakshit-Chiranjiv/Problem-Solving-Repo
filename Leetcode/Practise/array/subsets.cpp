//Subsets

#include <bits/stdc++.h>
using namespace std;

vector<vector<int>> subset(vector<int> v)
{
    vector<vector<int>> ans;
    ans.reserve(1024);
    vector<int> temp;
    temp.reserve(10);
    ans.push_back(temp);  //empty set

    set<int> st(v.begin(),v.end());
    int stsize=st.size();
    int vsize=v.size();

    //subset for each unique element [1],[2],[3]...
    for(int x:st)
    {
        temp.push_back(x);
        sort(temp.begin(),temp.end());
        ans.push_back(temp);
        temp.clear();
    }

    map<int,int> m;
    for(int x:v)
    {
        if(m.find(x)==m.end())
            m.insert(make_pair(x,1));
        else
            m[x]++;
    }
    temp.clear();

    //for repeating subsets [2,2],[2,2,2],[5,5],....
    for(auto i:m)
    {
        int occ=i.second;
        if(occ>1)
        {
            temp.push_back(i.first);
            temp.push_back(i.first);
            for(int j=1;j<occ;j++)
            {
                sort(temp.begin(),temp.end());
                ans.push_back(temp);
                temp.push_back(i.first);
            }
            temp.clear();
        }
    }
    
    //for mixed susbsets [1,2,3],[2,4,5],[6,9],...
    temp.clear();
    vector<int> unelm(st.begin(),st.end());
    for(int i=0;i<stsize;i++)
    {
        temp.clear();
        temp.push_back(unelm[i]);
        for(int j=i+1;j<stsize;j++)
        {
            temp.push_back(unelm[j]);
            sort(temp.begin(),temp.end());
            ans.push_back(temp);
        }
    }

    //for mixed and repeated subsets [1,2,2],[2,4,4,4,5],...
    temp.clear();
    sort(v.begin(),v.end());
    for(auto i=m.begin();i!=m.end();i++)
    {
        // if(i->second>1)
        // {
            for(int k=0;k<i->second;k++)
                temp.push_back(i->first);
        //}
        
        for(int j=i->second;j<vsize;j++)
        {
            temp.push_back(v[j]);
            sort(temp.begin(),temp.end());
            ans.push_back(temp);
        }
        temp.clear();
    }



    return ans;

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
    ans=subset(vec);
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