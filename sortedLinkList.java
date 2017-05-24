public class sortedLinkList
{
	QueueLink first;
	sortedLinkList()
	{
		first=null;
	}
	void insert(int data)
	{
		QueueLink newLink = new QueueLink(data);
		QueueLink pre=null,cur=first;
		while(cur!=null && newLink.data>cur.data)
		{
			pre=cur;
			cur=cur.next;
		}
		if(pre==null)
			first=newLink;
		else
			pre.next=newLink;
		newLink.next=cur;
	}
	int deleteFirst()
	{
		QueueLink temp=first;
		if(first==null)
			return temp.data;
		else
			first=first.next;
		return temp.data;
	}
	
	void displayLinkList()
	{
		QueueLink cur=first;
		while(cur!=null)
		{
			cur.DisplayLink();
			cur=cur.next;
		}
	}
	boolean isEmpty()
	{
		return first==null;
	}
}