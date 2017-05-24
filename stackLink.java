public class stackLink
{
	int data;
	stackLink next;
	
	public stackLink(int data)
	{
		this.data=data;
		this.next=null;
	}
	public void displayLink()
	{
		System.out.println(data+" ");
	}
}