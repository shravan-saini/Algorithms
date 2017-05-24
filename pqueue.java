class pqueue	{
	
	private int size;
	private int arr[];
	private int f;
	private int nitem;
	
	pqueue(int length)
	{
		size=length;
		arr=new int[length];
		f=-1;
		nitem=0;
	}
	
	void insert(int x)
	{
		if(f==-1)
			arr[++f]=x;
		
			
		
		else
		{
			int in=nitem-1;
			while(in>=f && x<=arr[in])
			{
				arr[in+1]=arr[in];
				in--;
			}
			arr[in+1]=x;
		}
		nitem++;
	}
	
	void remove()
	{
		if(f==-1)
		{
			System.out.println("queue is empty");
			return;
		}
		int temp=arr[f];
		f++;
		System.out.println("removed item :"+temp);
	}
	
	void display()
	{
		for(int i=f;i<nitem;i++)
			System.out.printf(arr[i]+" ");
		
		System.out.println("");
	}


}