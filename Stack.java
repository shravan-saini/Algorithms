public class Stack
{
	public stackLinkList stackList;
	public Stack()
	{
		stackList= new stackLinkList();
	}
	void push(int data)
	{
		stackList.insertAtFirst(data);
	}
	int pop()
	{
		return stackList.deleteFirst();
	}
	void DisplayStack()
	{
		stackList.displayAll();
	}
}