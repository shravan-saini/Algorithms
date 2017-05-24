//implementation of Doubly link list

class DoublyLinkList
{
	doublyLink first,last;
	DoublyLinkList()
	{
		first=null;
		last=null;
	}
	void insertAtFirst(int data)
	{
		doublyLink ne= new doublyLink(data);
		if(first==null)
			last=ne;
		else
		{
			ne.next=first;
		}
		ne.pre=null;
		first=ne;
			
	}
	void insertAtLast(int data)
	{
		doublyLink ne = new doublyLink(data);
		if(first==null)
			first=ne;
		else
		{
			last.next=ne;
			
		}
		last=ne;
		ne.next=null;
		ne.pre=last;
	}
	doublyLink deleteFirst()
	{
		doublyLink temp=first;
		if(first==null)
			return temp;
		
		first=first.next;
		if(first==null)
			last=null;
		else	
			first.pre=null;
		return temp;
	}
	doublyLink deleteLast()
	{
		doublyLink temp=last;
		if(first==null)
			return temp;
		last=last.pre;
		
		if(last==null)
			first=null;
		else
			last.next=null;
		return temp;
	}
	void DisplayList()
	{
		doublyLink temp=first;
		System.out.println("Content of List- ");
		while(temp!=null)
		{
			temp.DisplayLink();
			temp=temp.next;
		}
		
	}
}
