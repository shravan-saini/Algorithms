public class Link
{
	public int age;
	public float salary;
	public Link next;
	
	public Link(int x,float y)
	{
		age=x;
		salary=y;
	}
	public void DisplayLink()
	{
		System.out.println("["+age +","+salary+"] ;");
	}
}
