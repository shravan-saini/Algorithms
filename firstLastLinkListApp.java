import java.util.*;
public class firstLastLinkListApp	{
	public static void main(String[] args)
{
	Scanner scan= new Scanner(System.in);
		firstLastLinkList mylist= new firstLastLinkList();
		int ch=1;
		int age;
		while(ch<5)
		{
			System.out.println("Select your choice : ");
			System.out.println("1. Insert at firts Position");
			System.out.println("2. Insert at last Position");
			System.out.println("3. Delete first link");
			System.out.println("4. Display all");
			System.out.println("5. Exit");
			ch= scan.nextInt();
			switch(ch)
			{
				case 1:
				
				
				System.out.println("Enter age and salary-");
				age=scan.nextInt();
				mylist.insertAtFirst(age);
				break;
				case 2:
				
				System.out.println("Enter age and salary-");
				age=scan.nextInt();
				
				mylist.insertAtLast(age);
				break;
				case 3:
				
				mylist.deleteFirst();
				break;
				case 4:
				mylist.displayAll();
				break;
				
			}
		}

	}
}
