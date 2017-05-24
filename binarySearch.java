import java.util.*;
class binarySearch	{
	public static void main(String[] args)
	{
		int n=10;
		int flag=0;
		Scanner scan = new Scanner(System.in);
		int arr[]={20,30,40,50,60,66,68,69,80,90};
		int left=0,r=n-1;
		int num=scan.nextInt();
		while(true)
		{
			int m=(r+left)/2;
			if(arr[m]==num)
			{
				System.out.println("Found");
				flag=1;
				break;
			}
			else if(num<arr[m])
			{
				r=m;
				if(left==r)
					break;
			}
			else 
			{
				left=m+1;
				if(left>r )
				{
					flag=0;
					break;
				}
			}
			
			
		}
		if(flag==0)
			System.out.println("not found");
	}
}