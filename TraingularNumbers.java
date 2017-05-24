import java.util.Scanner;
class TraingularNumbers	{
	static int getTNumber(int p,int j,int n)
	{
		int result,pre;
		if(j==n+1)
			return 0;
		pre=p+j;
		result=pre+getTNumber(pre,j++,n);	
		return result;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int result=getTNumber(0,1,n);
		System.out.println("nth Number ="+result);
	}
}