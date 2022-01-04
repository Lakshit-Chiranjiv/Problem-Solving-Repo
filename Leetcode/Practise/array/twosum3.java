//two sum
import java.util.*;
class twosum3  
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n,target;
		n=in.nextInt();
		int nums[]=new int[n];
		int ans[]=new int[2];
		for(int i=0;i<n;i++)
		{
			nums[i]=in.nextInt();
		}	
		target=in.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                ans[0]=i;
                ans[1]=map.get(complement);
            }
        }
        for(int x:ans)
        {
        	System.out.print(x+" ");
        }
	}
}