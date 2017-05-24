import java.util.*;
public class dLinkApp	{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int ch=1;
		dLink dLink;
		dLinkList dList= new dLinkList();
	while(ch<7)
	{
		System.out.println("\n1.Insert at first");
		System.out.println("2.Insert After");
		System.out.println("3.Delete First");
		System.out.println("4.Delete Last");
		System.out.println("5.Delete a Specific data");
		System.out.println("6.Display");
		System.out.println("7.Exit");
		System.out.println("Enter your choice >");
		ch=scan.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter data >");
			dList.insertAtFirst(scan.nextInt());
			break;
			case 2:
			System.out.println("Enter the data after which u want ot enter new data and new data-");
			dList.insertAfter(scan.nextInt(),scan.nextInt());
			break;
			case 3:
			dLink=dList.deleteFirst();
			if(dLink==null)
				System.out.println("List is Empty");
			else
				System.out.println("The deleted data is :"+dLink.data);
			break;
			case 4:
			dLink=dList.deleteLast();
			if(dLink==null)
				System.out.println("List is Empty");
			else
				System.out.println("The deleted data is :"+dLink.data);
			break;
			case 5: 
			System.out.println("Enter data to delete-");
			if(!dList.delete(scan.nextInt()))
				System.out.println("data not found");
			else
				System.out.println("Data is deleted.");
			break;
			case 6:
			System.out.printf("Content of List is :");
			dList.DisplayList();
			break;
		}
	}
	}
}