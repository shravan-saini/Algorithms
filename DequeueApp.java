import java.util.*;
class DequeueApp	{
	public static void main(String[] args)
	{
		Dequeue dq=new Dequeue();
		int choice=1;
		
		Scanner scan = new Scanner(System.in);
		while(choice<6)
		{
			System.out.println("1.Queue First\n2.Queue Last\n3.Dequeue First\n4.Dequeue Last\n5.Display\n6.Exit\nEnter your choice-");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:
				System.out.printf("Enter data- ");
				dq.QueueFirst(scan.nextInt());
				break;
				case 2:
				System.out.printf("Enter data- ");
				dq.QueueLast(scan.nextInt());
				break;
				case 3:
				dq.DequeueFirst();
				break;
				case 4:
				dq.DequeueLast();
				break;
				case 5:
				dq.display();
				break;
			}
		}
	}
}