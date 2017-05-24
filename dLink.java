public class dLink
{
	int data;
	dLink next;
	dLink pre;
	dLink(int data)
	{
		this.data = data;
	}
	
	void DisplayLink()
	{
		System.out.printf(data+" ");
	}
}