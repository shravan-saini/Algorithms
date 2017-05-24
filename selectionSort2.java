import java.util.Scanner;
public class selectionSort2{
	public static void main(String[] args)
	{
		int n=5;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter"+ n +"ints -");
		int arr[]=new int[5];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		for(int i=0;i<n-1;i++)
		{
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[index]=temp;
		}
		for(int x=0;x<n;x++)
			System.out.printf(arr[x]+" ");
		
	}
}