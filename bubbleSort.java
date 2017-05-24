import java.util.Scanner;

public class bubbleSort	{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in); 
		int[] arr = new int[5];
		int n=5;
		System.out.println("Enter 5 ints ....");
		for(int i=0;i<5;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
		System.out.println("Sorted array is...");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}