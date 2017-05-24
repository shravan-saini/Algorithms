//implementation of simple Graph 

import java.util.Scanner;

//stack for DFS
class stack
{
	int st[];
	int top;
	private final int max=20;
	
	stack()
	{
		st=new int[max];
		top=-1;
		
	}
	void push(int d)
	{
		st[++top]=d;
	}
	void pop()
	{
		top--;
	}
	int peek()
	{
		return st[top];
	}
	boolean isEmpty()
	{
		return top==-1;
	}
}

class queue
{
	private int arr[];
	private int front;
	private int rear;
	final int maxsize=20;
	queue()
	{
		arr = new int[maxsize];
		front=0;
		rear=-1;
	}
	void insert(int d)
	{
		if(rear==maxsize-1)
			rear=-1;
		if(front==-1)
			front=0;
		arr[++rear]=d;
			
	}
	int remove()
	{
		int temp=arr[front++];
		if(front==maxsize)
			front=-1;
		return temp;
	}
	void flush()
	{
		front=0;
		rear=-1;
	}
	int peek()
	{
		return arr[front];
	}
	boolean isEmpty()
	{
		return (rear+1-front==maxsize || rear+1 == front);
	}
}

class vertex
{
	char label;
	boolean isVisited;
	vertex(char lab)
	{
		label=lab;
		isVisited=false;
	}
}

class Graph
{
	private int adjMat[][];
	private vertex vertexList[];
	private stack Stack ;
	private int nverts;
	private final int maxSize=20;
	private queue q;
	
	Graph()
	{
		adjMat=new int[maxSize][maxSize];
		vertexList=new vertex[20];
		Stack = new stack();
		nverts=0;
		q=new queue();
		for(int i=0;i<maxSize;i++)
		for(int j=0;j<maxSize;j++)
			adjMat[i][j]=0;
	}
	
	void addVertex(char v)
	{
		vertexList[nverts++]= new vertex(v);
	}
	void addEdge(int start,int end)
	{
		adjMat[start][end]=1;
		adjMat[end][start]=1;
	}
	void displayVertex(int v)
	{
		System.out.print(vertexList[v].label+"");
	}
	int getUnVisitedVertex(int v)
	{
		for(int i=0;i<maxSize;i++)
		{
			if(adjMat[v][i]==1 && vertexList[i].isVisited==false)
				return i;
			
		}
		return -1;
	}
	void DFS()
	{
		vertexList[0].isVisited=true;
		displayVertex(0);
		Stack.push(0);
		
		while(!Stack.isEmpty())
		{
			int v=getUnVisitedVertex(Stack.peek());
			if(v==-1)
				Stack.pop();
			else
			{
				vertexList[v].isVisited=true;
				displayVertex(v);
				Stack.push(v);
			}
		}
		
		for(int i=0;i<nverts;i++)
			vertexList[i].isVisited=false;
	}
	
	void addEdge(char start,char end)
	{
		int st=-1,ed=-1;
		for(int i=0;i<maxSize;i++)
		{
			if(vertexList[i].label==start)
				st=i;
			if(vertexList[i].label==end)
				ed=i;
			if(st!=-1 && ed!=-1)
				break;
		}
		
		adjMat[st][ed]=1;
		adjMat[ed][st]=1;
	}
	
	void BFS()
	{
		vertexList[0].isVisited = true;
		q.insert(0);
		displayVertex(0);
		
		int v2;
		while(!q.isEmpty())
		{
			int v1=q.remove();
			
			while((v2=getUnVisitedVertex(v1))!=-1)
			{
				vertexList[v2].isVisited=true;
				displayVertex(v2);
				q.insert(v2);
				
			}
		}
		for(int k=0;k<nverts;k++)
			vertexList[k].isVisited=false;
		q.flush();
	}
}

class graphApp
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Graph G = new Graph();
		int ch=-1;
		char vert1,vert2;
		while(ch<5)
		{
			System.out.println("\n\n1. Insert a vertex");
			System.out.println("2. Add a edge");
			System.out.println("3. Perform DFS");
			System.out.println("4. Perform BFS");
			System.out.println("5. Exit");
			 ch=scan.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("\n Enter vertex Label :");
				vert1=(scan.next()).charAt(0);
				G.addVertex(vert1);
				break;
				case 2:
				System.out.println("\n Enter two vertices to connect :");
				vert1=(scan.next()).charAt(0);
				vert2=(scan.next()).charAt(0);
				G.addEdge(vert1,vert2);
				break;
				case 3:
				System.out.println("Visited :");
				G.DFS();
				break;
				case 4:
				System.out.print("Visited :");
				G.BFS();
				
			}
		}
	}
}
