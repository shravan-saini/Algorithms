import java.util.Scanner;
class shellSort
{
		
	void sshort(int[] arr)
	{
		int h=1;
		while(h<arr.length/3)
			h=h*3+1;
		int inner,outer;
		while(h>0)
		{
			outer=h;
			
			for(outer=h;outer<arr.length;outer++)
			{
				int temp=arr[outer];
				inner=outer;
				while(inner>h-1 && arr[inner-h]>=temp)
				{
					arr[inner]=arr[inner-h];
					inner=inner-h;
				}
				arr[inner]=temp;
			}
			h=(h-1)/3;
		}
		
	}
}

public class shellSortApp	{
	public static void main(String[] args)
	{
		shellSort ss=new shellSort();
		int arr[] = new int[10];
		int n=10;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array to sort:");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		ss.sshort(arr);
		for(int i=0;i<n;i++)
			System.out.printf(arr[i]+" ");
	}
}