//implementation of Simple link list


public class LinkList
{
	public Link first;
	
	LinkList()
	{
		first=null;
	}
	

	public void insertFirst(int x,float y)
	{
		Link newlink = new Link(x,y);
		newlink.next=first;
		first=newlink;
	}
	public void deleteFirst()
	{
		if(first==null)
			System.out.println("Link list is empty");
		else
		{
			Link temp;
			temp=first;
			first=first.next;
			System.out.println("Deleted first link-");
			temp.DisplayLink();
			
		}
			
		
	}
	
	public void displayLinkList()
	{
		Link current=first;
		while(current!=null)
		{
			current.DisplayLink();
			current=current.next;
		}
	}
}
