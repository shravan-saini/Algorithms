class Dequeue
{
	DoublyLinkList dls;
	Dequeue()
	{
		dls=new DoublyLinkList();
	}
	void QueueFirst(int data)
	{
		dls.insertAtFirst(data);
	}
	void QueueLast(int data)
	{
		dls.insertAtLast(data);
	}
	void DequeueFirst()
	{
		doublyLink temp=dls.deleteFirst();
		if(temp==null)
			System.out.println("List is empty");
		else
			System.out.println("Daleted data is "+temp.data);
	}
	void DequeueLast()
	{
		doublyLink temp=dls.deleteLast();
		if(temp==null)
			System.out.println("List is empty");
		else
			System.out.println("Daleted data is "+temp.data);
	}
	void display()
	{
		dls.DisplayList();
	}
}