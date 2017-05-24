import java.io.*;
import java.util.Scanner;
class fileInput{
public static void main(String[] args) throws IOException
	{
		
		  FileInputStream in=null;
		  FileOutputStream out=null;
		  
		  in=new FileInputStream("input.txt");
		  out=new FileOutputStream("output.txt");
		  
		  String str="";
		  int c;
		  
		  while((c=in.read())!=-1)
		  {
			  str+=c;
		  }
		  System.out.println(str);
		  Scanner scan= new Scanner(str);
		  
			int n=scan.nextInt();
			System.out.println(n+"");
			int arr[] = new int[n];
		
			for(int i=0;i<n;i++)
			{
				arr[i]=scan.nextInt();
				System.out.printf(arr[i]+" ");
			}
		  
	}

}