import java.util.*;

public class recMulti {

		static int multi(int x,int y)
		{
			if(y==1)
				return x;
			
			int result=multi(x+x,y/2);
			if(y%2==1)
				result+=x;
			return result;
				
		}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter value of x and y to multiply :");
		int x	=scan.nextInt();
		int y= scan.nextInt();
		int result;
		if(x<=y)
			 result=multi(y,x);
		else
			result=multi(x,y);
		
		System.out.println("x*y = "+result);
	}
}