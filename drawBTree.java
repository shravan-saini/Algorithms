import java.util.Scanner;
public class drawBTree	{
	static char[] arr;
	static void CreateArray(int size)
	{
		arr=new char[size];
		for(int i=0;i<size;i++)
		{
			arr[i]='-';
		}
	}
	static void drawBTree(int left,int right)
	{
		
		if(left>right)
			return;
		else if(left==right)
			arr[left]='X';
		else
		{
			int mid=(left+right)/2 +1;
			arr[mid]='X';
			
			char arr2[] = new char[arr.length];
			arr2[mid]='X';
			drawBTree(left,mid-1);
			for(int i=left;i<=mid-1;i++)
			{
				arr2[i]=arr[i];
			}
			drawBTree(mid+1,right);
			for(int i=mid+1;i<=right;i++)
			{
				arr2[i]=arr[i];
			}
			
		}
	}
	static void display(char[] arr2)
	{
		for(int i=0;i<arr.length;i++)
			System.out.printf(arr2[i]+"");
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
		CreateArray(n);
		drawBTree(0,n-1);
	}
}