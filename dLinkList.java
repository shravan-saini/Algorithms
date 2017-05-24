public class dLinkList
{
	dLink first;
	dLink last;
	dLinkList()
	{
		first=null;
		last=null;
	}
	void insertAtFirst(int data)
	{
		dLink nLink = new dLink(data);
		if(first==null)
			last=nLink;
		else
		{	nLink.next=first;
			first.pre=nLink;
			
		}
		first=nLink;
		first.pre=null;
		
	}
	void insertAfter(int data1,int data2)
	{
		dLink temp=first;
		if(first==null )
		{
			System.out.println(data1+" not found in List");
		}
		else
		{
			while(temp!=null && temp.data!=data1)
			{
				temp=temp.next;	
			}
			if(temp==null)
				System.out.println(data1+" not found in List");
			else
			{
					
				dLink nLink = new dLink(data2);
				if(temp==last)
					last=nLink;
				else
					temp.next.pre=nLink;
				nLink.pre=temp;
				nLink.next=temp.next;
				temp.next=nLink;
			}
				
		}
	}
	dLink deleteFirst()
	{
		dLink del=first;
		if(first==null)
			return del;
		
		first=first.next;
		
		if(first==null)
		{
			last=null;
			return del;
		}
		else
			first.pre=null;
		
		if(first.next==null)
			last=first;
		
		return del;
	}
	dLink deleteLast()
	{
		dLink del=last;
		if(first==null)
			return del;
		if(first.next==null)
			first=null;
		else
			last.pre.next=null;
		last= last.pre;
		
		return del;
	}
	boolean delete(int data)
	{
		dLink temp=first;
		while(temp.data!=data)
		{
			temp=temp.next;
		}
		if(temp==null)
			return false;
		else
		{
			temp.pre.next=temp.next;
			temp.next.pre=temp.pre;
			return true;
		}
		
	}
	
	void DisplayList()
	{
		dLink temp=first;
		while(temp!=null)
		{
			temp.DisplayLink();
			temp=temp.next;
		}
	}
}