import java.util.Scanner;
class partition 
{
	int partition(int[] arr,int left,int right)
	{
		
		int i=left,j=right;
		int leftptr=i-1,rightptr=j+1-1;
		int partk=arr[j];	//partition key
		while(true)
		{
			while(leftptr<j && arr[++leftptr]<partk)
				;
			
			while(rightptr>i && arr[--rightptr]>partk)
				;
			if(leftptr>=rightptr)
				break;
			else
			{
				swap(arr,leftptr,rightptr);
			}
			

		}
		if(leftptr>=rightptr)
		{
			swap(arr,leftptr,right);
			return leftptr;
		}
		else
		{
			swap(arr,leftptr+1,right);
			return leftptr+1;
		}
	}
	void swap(int[] arr,int leftptr,int rightptr)
	{
		int temp=arr[rightptr];
		arr[rightptr]=arr[leftptr];
		arr[leftptr]=temp;
	}
}


public class partitionApp	{
	public static void main(String[] args)
	{
		partition p=new partition();
		int n=10;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		
		System.out.println("Enter array to partition:");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		
		int partk=p.partition(arr,0,arr.length-1);
		System.out.println("array after partition:");
		for(int i=0;i<n;i++)
			System.out.printf(arr[i]+" ");
		
		System.out.println("partk "+partk);
	}
}