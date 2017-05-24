import java.util.*;
public class StackApp	{
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		Scanner scan = new Scanner(System.in);
		int ch=1;
		while(ch<4)
		{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("Enter your choice >");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter Data ");
					stack.push(scan.nextInt());
				break;
				case 2:
				System.out.println("Poped data : "+stack.pop());
				break;
				case 3:
				stack.DisplayStack();
				break;
			}
			
		}
	}
}