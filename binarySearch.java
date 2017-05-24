import java.util.Scanner;
class binarySearch	{
	static boolean RecSearch(int[] arr,int le,int r,int search)
	{
		int m=(le+r)/2;
		if(le>r)
			return false;
		if(search==arr[m])
			return true;
		else
		{
			if(search>arr[m])
				return RecSearch(arr,m+1,r,search);
			else
				return RecSearch(arr,le,m-1,search);
		}
		
	}
	public static void main(String[] args)
	{
		int n=10;
		Scanner scan = new Scanner(System.in);
		int arr[]={20,30,40,50,60,66,68,69,80,90};
		int left=0,r=n-1;
		System.out.println("Enter a number to search- ");
		int num=scan.nextInt();
		if(RecSearch(arr,left,r,num)==true)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}