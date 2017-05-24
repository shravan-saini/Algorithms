public class stackLinkList
{
	public stackLink first;
	stackLinkList()
	{
		first=null;
	}
	void insertAtFirst(int data)
	{
		stackLink newLink= new stackLink(data);
		if(first==null)
		{
			first=newLink;
			newLink.next=null;
		}
		else
		{
			newLink.next=first;
			first=newLink;
		}
	}
	int deleteFirst()
	{
		stackLink temp=null;
		if(first==null)
			System.out.println("list is empty");
		else
		{
			temp=first;
			first=first.next;
		}
		return temp.data;
	}
	void displayAll()
	{
		stackLink temp=first;
		while(temp!=null)
		{
			temp.displayLink();
			temp=temp.next;
		}
		
	}
}