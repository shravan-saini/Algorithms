public class firstLastLinkList 
{
	private firstLastLink first;
	private firstLastLink last;
	
	firstLastLinkList()
	{
		first=null;
		last=null;
	}
	public void insertAtFirst(int x)
	{
		firstLastLink newLink=new firstLastLink(x);
		newLink.age=x;
		if(first==null)
			last=newLink;
		newLink.next=first;
		first=newLink;
		
	}
	public void insertAtLast(int x)
	{
		
		firstLastLink newLink=new firstLastLink(x);
		
		last.next=newLink;
		if(first==null)
			first=newLink;
		last=newLink;
	}
	public void deleteFirst()
	{
		firstLastLink temp;
		temp=first;
		if(first==null)
		{
			System.out.println("Link list is empty");
			
		}
		else
		{
			first=first.next;
			System.out.println("Deleted key - ");
			temp.DisplayLink();
		}
		if(first==null)
		{
			last=null;
		}
	}
	public void displayAll()
	{
		firstLastLink cur=first;
		System.out.println("The data in the link is -");
		while(cur!=null)
		{
			cur.DisplayLink();
			cur=cur.next;
		}
	}
}