#include <bits/stdc++.h>
using namespace std;

int isPalindrome(string s)
{
    string rv=s;
    reverse(rv.begin(),rv.end());
    if(rv==s)
        return 1;
    else
        return 0;
}

string longestPalindrome(string s)
{
    if(s.size()<2)
        return s;
    if(isPalindrome(s))
        return s;
    int n=s.size();
    string sb="";
    int j=(s.size()-1);

    while(j>0)
    {
        for(int i=0;i<=(n-j);i++)
        {
            sb=s.substr(i,j);
            if(isPalindrome(sb))
            {
                return sb;
            }
        }
        j--;
    }
    return sb;
}

int main()
{
    string s,pal;
    cin>>s;
    pal=longestPalindrome(s);
    cout<<pal<<endl;
    return 0;
}


//also possible
    // for(int i=0;i<s.size();i++)
    // {
    //     j=s.size()-i;
    //     while(j>0)
    //     {
    //         sb=s.substr(i,j);
    //         if(isPalindrome(sb) && sb.size()>mxl)
    //         {
    //             mx=sb;
    //             mxl=sb.size();
    //         }
    //         j--;
    //     }
    // }