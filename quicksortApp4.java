import java.util.Scanner;
public class quicksortApp4	{
	
	static int partition(int[] arr,int left,int right)
    {
        int leftptr=left;
        int rightptr=right+1;
        int pivot=arr[left];
        int index=0;
        
        int[] arr2 = new int[right-left+1];
        int partk;
        while(leftptr<right)
		{
			if(arr[++leftptr]<pivot)
				arr2[index++]=arr[leftptr];
		}	
		partk=index;
        arr2[index++]=arr[left];
		leftptr=left;
		while(leftptr<right)
		{
			if(arr[++leftptr]>pivot)
				arr2[index++]=arr[leftptr];
		}	
        
        for(int i=0;i<arr.length;i++)
            arr[i]=arr2[i];
        
        return partk;
     
    }
	static void display(int[] arr)             // displays array contents 
	{ 
		System.out.print("A="); 
		for(int j=0; j<arr.length; j++)    // for each element, 
			System.out.print(arr[j] + " ");  // display it 
			System.out.println(""); 
	}

	public static void main(String args[])
	{
		int n=10;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		
		System.out.println("Enter array to quicksort");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		int partk=partition(arr,0,n-1);
		
		System.out.println("array after quicksort:");
		display(arr);
		System.out.println("partk ="+partk);
	}
}