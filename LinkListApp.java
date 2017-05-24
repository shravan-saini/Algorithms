import java.util.*;
public class LinkListApp	{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		LinkList mylist= new LinkList();
		int ch=1;
		while(ch<4)
		{
			System.out.println("Select your choice : ");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			ch= scan.nextInt();
			switch(ch)
			{
				case 1:
				
				int age;
				float sal;
				System.out.println("Enter age and salary-");
				age=scan.nextInt();
				sal=scan.nextFloat();
				mylist.insertFirst(age,sal);
				break;
				case 2:
				
				mylist.deleteFirst();
				break;
				case 3:
				mylist.displayLinkList();
				break;
				
			}
		}
	}
}
