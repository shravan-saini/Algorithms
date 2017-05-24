import java.util.Scanner;
class quickSort {
		int arr[];
		void insertArray(int[] arr)
		{
			for(int i=0;i<arr.length;i++)
			this.arr[i]=arr[i];
			
			System.out.println("array after insertArray");
			displayArray();
		
		}
		quickSort(int n)
		{
			arr=new int[n];
		}
		
		int partition(int left,int right,int pivot)
		{
			int leftptr=left;
			int rightptr=right-1;
			while(true)
			{
				while(arr[++leftptr]<pivot)
					;
				while(arr[--rightptr]>pivot)
					;
				if(leftptr>=rightptr)
					break;
				else
					swap(leftptr,rightptr);
			}
			
			swap(leftptr,right-1);
			return leftptr;
			
		}
		void displayArray()
		{
			for(int i=0;i<arr.length;i++)
				System.out.printf(arr[i]+" ");
			System.out.println();
		}
		void swap(int left,int right)
		{
			int temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
		}
		
		void manualSort(int left,int right)
		{
			int size=right-left+1;
			if(size<=1)
				return;
			else if(size==2)
			{
				if(arr[left]>arr[right])
					swap(left,right);
				return;
			}
			else
			{
				if(arr[left]>arr[right-1])
					swap(left,right-1);
				if(arr[left]>arr[right])
					swap(left,right);
				if(arr[right-1]>arr[right])
					swap(right-1,right);
					
			}
		}
		
		int medianOf3(int left,int right)
		{
			int center=(left+right)/2;
			if(arr[left]>arr[center])
				swap(left,center);
			if(arr[left]>arr[right])
				swap(left,right);
			if(arr[center]>arr[right])
				swap(center,right);
			
			swap(center,right-1);
			return arr[right-1];
		}
		
		void recQuickSort(int left,int right)
		{
			if(right-left+1<=3)
				manualSort(left,right);
			else
			{
				int pivot=medianOf3(left,right);
				int partk=partition(left,right,pivot);
				recQuickSort(left,partk-1);
				recQuickSort(partk+1,right);
			}
		}
}

public class quicksortApp3	{
	public static void main(String[] args)
	{
		int n=16;
		quickSort qs=new quickSort(n);
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		
		System.out.println("Enter array to quicksort");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		
		qs.insertArray(arr);
		qs.recQuickSort(0,arr.length-1);
		System.out.println("array after quicksort:");
		qs.displayArray();
	}
}