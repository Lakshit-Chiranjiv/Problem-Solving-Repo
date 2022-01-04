import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{

		Scanner in=new Scanner(System.in);

		int t;
		long elm;
		t=in.nextInt();
		ArrayList<Integer> ans=new ArrayList<>();
		while((t--)>0)
		{
			int tr=1;
		    HashMap<Long,Integer> elem=new HashMap<>();
		    for(int i=0;i<12;i++)
		    {
		    	elm=in.nextLong();
		    	if(elem.containsKey(elm))
		    		elem.put(elm, elem.get(elm) + 1);
		    	else
		    		elem.put(elm,1);
		    }

		    for(Map.Entry melm: elem.entrySet())
		    {
		    	int val=((int)melm.getValue());
		    	if(val%4!=0)
		    	{
		    		tr=0;
		    		break;
		    	}
		    }

		    ans.add(tr);
		}

		for(int x:ans)
		{
			if(x==1)
			    System.out.println("yes");
			else
				System.out.println("no");
		}
		
	}
}