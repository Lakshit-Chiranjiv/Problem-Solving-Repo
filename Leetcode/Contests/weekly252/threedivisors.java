package weekly252;
import java.util.*;
class threedivisors
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n;
		n=in.nextInt();
		int f=2;int y=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				f++;

			if(f>3)
			{
				y=0;
				break;
			}

		}
		if(y==0)
		{
			System.out.println("false");
		}
		if(f==3)
			System.out.println("true");
		else if(f<3)
			System.out.println("false");
		in.close();
	}
}