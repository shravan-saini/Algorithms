import java.util.*;
public class QueueApp	{
	public static void main(String[] args)
	{
		Queue queue= new Queue();
		Scanner scan = new Scanner(System.in);
		int ch=1;
		while(ch<4)
		{
			System.out.println("\n1.Queue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter your choice >");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter Data ");
					queue.queue(scan.nextInt());
				break;
				case 2:
				System.out.printf("\nDequeued data : ");
				queue.Dequeue();
				break;
				case 3:
				queue.DisplayQueue();
				break;
			}
			
		}
	}
}