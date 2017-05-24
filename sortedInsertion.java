import java.util.*;
public class sortedInsertion	{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		sortedLinkList sl=new sortedLinkList();
		System.out.println("Enter 5 ints to sort.");
		for(int i=0;i<5;i++)
		{
				arr[i]=scan.nextInt();
				sl.insert(arr[i]);
		}
		int j=0;
		while(!sl.isEmpty())
		{
			arr[j]=sl.deleteFirst();
			j++;
		}
		System.out.println("Sorted Arrray is-");
		for(int i=0;i<5;i++)
		{
			System.out.printf(arr[i]+" ");
		}
		
	}
}