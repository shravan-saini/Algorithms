
public class PriorityQueue	{
	private sortedLinkList sl;
	PriorityQueue()
	{
		sl=new sortedLinkList();
	}
	void Queue(int data)
	{
		sl.insert(data);
	}
	int Dequeue()
	{
		return sl.deleteFirst();
	}
	void displayPQueue()
	{
		sl.displayLinkList();
	}

}