#include <bits/stdc++.h>
using namespace std;

int isVowel(char x)
{
    if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
        return 1;
    else
        return 0;
}

string reverseVowels(string s)
{
    int n=s.size();
    int left=0,right=s.size()-1;
    char temp,x,y;
    while(left < right) 
    {
        if(isVowel(s.at(left)) && isVowel(s.at(right))) 
        {
            temp = s.at(left);
            s.at(left) = s.at(right);
            s.at(right) = temp;
            left++;
            right--;
        }
        else if(!isVowel(s.at(left)) && isVowel(s.at(right))) 
        {
            left++;
        }
        else if(isVowel(s.at(left)) && !isVowel(s.at(right))) 
        {
            right--;
        } 
        else 
        {
            left++;
            right--;
        }
    }

    return s;
}



int main()
{
    string s,rev;
    cin>>s;
    rev=reverseVowels(s);
    cout<<rev<<endl;
    return 0;
}