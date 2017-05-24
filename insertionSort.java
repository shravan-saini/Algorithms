import java.util.Scanner;

public class insertionSort	{
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
		
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		
		System.out.println("The sorted array is ...");
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}