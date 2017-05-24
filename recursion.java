public class recc	
{
	static float rec(int n, float d)
	{
		float result;
		if(n==0)
			return 1/d;
		result=(n+1)/((rec(n-1,d)+1));
		return result;
	}
	public static void main(String[] args)
	{
		int n=1,d=3;
		float result;
		result=rec(n,d);
		System.out.println(result+"");
		
		
	}
}