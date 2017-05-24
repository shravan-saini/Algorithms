import java.util.Scanner;
class quicksort
{
	partition p;
	quicksort()
	{
		p=new partition();
	}
	void quicksort(int[] arr,int left,int right)
	{
		
		if(left>=right)
			return;
		else
		{
			int partk=p.partition(arr,left,right);
			if(right-left+1>2)
				displayArray(arr);
			quicksort(arr,left,partk-1);
			quicksort(arr,partk+1,right);
			
			
		}
	}
	void displayArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.printf(arr[i]+" ");
		System.out.println();
	}
	
}

public class quicksortApp	{
	public static void main(String args[])
	{
		int n=7;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		
		System.out.println("Enter array to quicksort");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		quicksort qs=new quicksort();
		qs.quicksort(arr,0,arr.length-1);
		System.out.println("array after quicksort:");
		qs.displayArray(arr);
	}
}