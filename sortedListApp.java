import java.util.Scanner;
public class sortedListApp	{
public static void main(String[] args)
{
	Scanner scan= new Scanner(System.in);
	int ch=1;
	QueueLink qLink;
	sortedLinkList sLink = new sortedLinkList();
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
			System.out.println("Enter data >");
			sLink.insert(scan.nextInt());
			break;
			case 2:
			qLink=sLink.deleteFirst();
			if(qLink==null)
				System.out.println("List is Empty");
			else
				System.out.println("The deleted data is :"+qLink.data);
			break;
			case 3:
			System.out.printf("Content of List is :");
			sLink.displayLinkList();
			break;
		}
	}
}
}