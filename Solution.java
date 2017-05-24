import java.io.*;
import java.util.*;

public class Solution {
    
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
		partk=left+index;
        arr2[index++]=arr[left];
		leftptr=left;
		while(leftptr<right)
		{
			if(arr[++leftptr]>pivot)
				arr2[index++]=arr[leftptr];
		}	
        index=0;
        for(int i=left;i<=right;i++)
            arr[i]=arr2[index++];
        
        return partk;
     
    }
    static void swap(int[] arr,int leftptr,int rightptr)
    {
        int temp=arr[leftptr];
        arr[leftptr]=arr[rightptr];
        arr[rightptr]=temp;
    }
    static void display(int[] arr,int left,int right)
    {
        for(int i=left;i<=right;i++)
				System.out.printf(arr[i]+" ");
        System.out.println("");
    }
	
    static void quicksort(int[] arr,int left,int right)
    {
        if(right-left+1<=1)
            return;
        else
        {
            int partk=partition(arr,left,right);
			
			quicksort(arr,left,partk-1);
            quicksort(arr,partk+1,right);
            if(partk-1-left+1>=2)
			{
               
				display(arr,left,partk-1);
            }
			if(right-partk-1+1>=2)
			{	
                
				display(arr,partk+1,right);
			}
			
        }
		
    }
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
        
        quicksort(arr,0,n-1);
        display(arr,0,n-1);
		
		
    }
}