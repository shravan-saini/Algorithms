import java.io.*;
import java.util.*;

public class Solution1 {
    
    static void partition(int[] arr,int left,int right)
    {
        int leftptr=left-1;
        int rightptr=right;
        
        int index=0;
        
        if(right-left+1<=1)
            return;
        else
        { 
            int pivot=arr[right];
            int[] arr2 = new int[right-left+1];
            int partk;
            while(leftptr<right)
            {
                if(arr[++leftptr]<pivot)
                    arr2[index++]=arr[leftptr];
            }	
            partk=left+index;
            arr2[index++]=arr[right];
            leftptr=left;
            while(leftptr<right)
            {
                if(arr[++leftptr]>pivot)
                    arr2[index++]=arr[leftptr];
            }	
            index=0;
            for(int i=left;i<=right;i++)
                arr[i]=arr2[index++];
			display(arr,0,arr.length-1);
            partition(arr,left,partk-1);
            /* if(arr.length-1-0+1 >=2)
            display(arr,0,arr.length-1);
            */
            partition(arr,partk+1,right);
            /* if(arr.length-1-0+1 >=2)
            display(arr,0,arr.length-1);
                
            */
        }
     
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
	
    

		
    
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
        
        partition(arr,0,n-1);
        if(n-1-0+1 >=2)
            display(arr,0,n-1);
		
		
    }
}