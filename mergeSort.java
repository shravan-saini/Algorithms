import java.util.Scanner;
class mergeSort	{
	static void Merge(int[] arr,int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;
		int L[] = new int[n1+1];
		int R[] = new int[n2+1];
		for(int i=0;i<n1;i++)
			L[i]=arr[p+i];
		for(int i=0;i<n2;i++)
			R[i]=arr[q+1+i];
		int i=0,j=0;
		L[n1]= 1000000000;
		R[n2]=1000000000;
		for(int k=p;k<r-1;k++)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
		}
		
		
	}
	static void MergeSort(int[] arr,int p,int r)
	{
		if(p<r)
		{
			int q=(p+r)/2;
			MergeSort(arr,p,q);
			MergeSort(arr,q+1,r);
			Merge(arr,p,q,r);
		}
	}
	public static void main(String[] arg)
	{
		int n=5,p=0;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		MergeSort(arr,p,n);
	
	}
}