//Longest Valid Parentheses

#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;

int main()
{
	string s;
	cin>>s;
	int c=0;
	int l=s.size();
    s=s+" ";
	for(int i=0;i<l;i++)
	{
		if(s[i]=='(' && s[i+1]==')')
			c+=2;
	}
	cout<<c<<endl;
	return 0;
}