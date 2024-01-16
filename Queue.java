package dataStructures;

import java.util.HashSet;

import numbers.Generator;

public class Queue 
{
	static Object [] queue;
	static final int FrontPointer=0; static int Rearpointer=0;

	public void queueImplementation(int size)
	{
		queue =new Object[size];
		System.out.println("Queue had been created");
	}

	public void enqueue(Object data)
	{
		if(Rearpointer==queue.length)
			System.out.println("Queue is full"); //rear points more than last element index(confused) can throw exception if accessed
		else {
			queue[Rearpointer]=data;
			Rearpointer++;
			System.out.println("Enqueing done");
		}
	}

	public void dequeue()
	{
		if(!isEmpty())
		{
			System.out.print(queue[FrontPointer]);
			System.out.println(" Dequeued");
			queue=shift(queue);
			//System.out.println("rp:"+Rearpointer);
			Rearpointer--;
			queue[Rearpointer]=0;
		}

		else  System.out.println("Queue is Empty");
	}

	public void display()
	{
		int i=0;
		if(!isEmpty())
		{
			System.out.print("[");
			for(Object element:queue)
			{
				System.out.print(i<queue.length-1? element+", " : element);
				i++;
			}
			System.out.println("]");
		}
		else System.out.print("queue is empty");
	}

	public boolean isEmpty()
	{
		return Rearpointer==FrontPointer;
	}

	public Object[] shift(Object[] a)
	{
		for(int i=FrontPointer;i<Rearpointer-1;i++) //one less than rear pointer bcoz of a[i+1]
		{
			a[i]=a[i+1];
		}
		return a;
	}

	public static void main(String[] args) 
	{
		Queue q=new Queue();
		HashSet<Integer> hs= Generator.random(1,5);
		System.out.println(hs);
		q.queueImplementation(5);
		//Object a[] = q.queueImplementation(7);//[] a=Generator.random(1,7); 
		for(Object element:hs)
		{
			q.enqueue(element);
		}
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.display();
		System.out.println(q.isEmpty());
	}

}
