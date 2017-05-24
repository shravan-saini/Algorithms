import java.util.*;

public class raisePower {

		static int powers(int x,int y)
		{
			if(y==1)
				return x;
		 
			
			int result=powers(x*x,y/2);
			if(y%2==1)
				result=result*x;
			return result;
				
		}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter value of x and y");
		int x	=scan.nextInt();
		int y= scan.nextInt();
		int result=powers(x,y);
		System.out.println("x^y = "+result);
        
  }
}