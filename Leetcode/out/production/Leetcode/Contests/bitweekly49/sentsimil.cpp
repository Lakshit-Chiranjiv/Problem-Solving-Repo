//5706. Sentence Similarity III

#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;

int main()
{
	string sentence1,sentence2,ls,ss;
	getline(cin,sentence1);
	getline(cin,sentence2);
	int l1,l2;
	l1=sentence1.size();
	l2=sentence2.size();
	if(l1==l2)
	{
		size_t fnd=sentence1.find(sentence2);
		if (fnd != string::npos)
			cout<<true;
		else
			cout<<false;
	}
	else
	{
        if(l1<l2)
        {
        	ls=sentence2;
        	ss=sentence1;
        }
        else
        {
        	ls=sentence1;
        	ss=sentence2;
        }


        	size_t fnd=ls.find(ss);
		    if (fnd == string::npos)
			    cout<<false;
			else
			{
				string r="";
				int frst=0;
				for(int i=0;i<ls.size();i++)
				{
					if(ls[i]!=' ')
						frst++;
					else
						break;
				}
				ls=ls+" ";
				int i=(int)fnd;
				while(ls[i]!=' ')
				{
                     i++;
				}
				if(i!=frst || i!=ls.size())
					cout<<false;
				else
					cout<<true;
			}
	}
return 0;
}