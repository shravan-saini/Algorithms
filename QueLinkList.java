public class QueLinkList	
{
	private QueueLink first,last;
	public QueLinkList()
	{
		first=null;
		last=null;
	}
	
	void  deleteFirst()
	{
		QueueLink temp=first;
		if(first==null)
		{
			System.out.println("Queue is underflow.");
			
		}
		else
		{
			first=first.next;
			System.out.printf(temp.data+"");
		}
		
	}
	void insertAtLast(int data)
	{
		QueueLink temp=new QueueLink(data);
		if(first==null)
		{
			first=temp;
		}
		else
		{
			last.next=temp;
		}
		last=temp;
	}
	void DisplayLinkList()
	{
		QueueLink cur=first;
		while(cur!=null)
		{
			cur.DisplayLink();
			cur=cur.next;
		}
	}
}