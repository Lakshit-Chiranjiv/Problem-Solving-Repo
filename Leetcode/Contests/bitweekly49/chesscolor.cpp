//5705. Determine Color of a Chessboard Square

#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;

int main()
{
	string coordinates;
	cin>>coordinates;
	char x=coordinates[0];
	int z=(int)coordinates[1];
	string t="true";
	string f="false";
	if(x=='a' || x=='c' || x=='e' || x=='g')
	{
		if(z%2==0)
			cout<<t;
		else
			cout<<f;
	}
	else
	{
		if(z%2==0)
			cout<<f;
		else
			cout<<t;
	}
	return 0;
}