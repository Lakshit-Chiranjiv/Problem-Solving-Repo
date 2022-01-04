// Tricky Function - Prepbytes

import java.util.*;
public class Main
{


	public static long ansval(long n)
	{
		if(n==0 || n==1)
			return n;

		if(n%2==0)
			return ansval(n/2);
		else
			return ansval(n-1) +1;
	}


	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		long t,n;
		t=in.nextLong();
		ArrayList<Long> ans=new ArrayList<>();

		while(t-->0)
		{
			n=in.nextLong();
			long p=ansval(n);
			ans.add(p);
		}

		for(long x:ans)
			System.out.println(x);
		
	}
}