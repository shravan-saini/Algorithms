class useQueue	{
	public  static void main(String[] args)
	{
		queue q = new queue(5);
		
		q.insert(2);
		q.insert(5);
		q.insert(67);
		q.insert(56);
		q.insert(78);
		q.insert(79);
		
		q.remove();
		q.display();
		q.remove();
		q.display();
		
		q.insert(9);
		q.insert(11);
		q.insert(12);
		q.display();
		q.remove();
		q.insert(23);
		q.display();
		
	}
}