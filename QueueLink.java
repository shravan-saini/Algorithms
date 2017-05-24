public class QueueLink
{
	int data;
	QueueLink next;
	public QueueLink(int data)
	{
		this.data=data;
	}
	public void DisplayLink()
	{
		System.out.printf(data+" ");
	}
}