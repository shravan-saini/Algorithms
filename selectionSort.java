import java.util.Scanner;

public class selectionSort	{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		
		int n;
		System.out.println("Enter no. of elements to sort...");
		n=scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter" +n +"elements to sort...");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		int min;
		for(int i=0;i<n-1;i++)
		{
			min=arr[i];
			int pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[pos]=temp;
		}
		
		System.out.println("The sorted array is ...");
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}