//implementation of queue


public class Queue
{
	private QueLinkList q;
	public Queue()
	{
		q=new QueLinkList();
	}
	void queue(int data)
	{
		q.insertAtLast(data);
	}
	void Dequeue()
	{
		q.deleteFirst();
	}
	void DisplayQueue()
	{
		System.out.println("front--> rear :");
		q.DisplayLinkList();
	}
}
