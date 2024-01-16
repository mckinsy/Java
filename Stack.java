package dataStructures;

import arrays.Beautify;

public class Stack 
{
	Object[] stack; private int top=-1;private boolean shred=false;

	public void create(int size)
	{
		stack=new Object[size];
		System.out.println("stack had been created");
	}

	public boolean isEmpty()
	{
		return top==-1;
	}

	public boolean isFull()
	{
		return top<stack.length;
	}

	public void push(Object data)
	{
		if(top<stack.length-1)
		{
			++top; //coz top starts from -1
			stack[top]=data;
			System.out.println("Push Successful");
		}
		else System.out.println("stack overflow....");
	}

	public void pop()
	{
		if(top>-1)
		{
			System.out.println(stack[top]+" popped");
			top--;
		}
		else System.out.println("Stack is Empty");
	}

	public void clear()
	{
		top=-1;
		System.out.println("Stack cleared");
	}

	public void display()
	{
		new Beautify().display(top,stack);
	}

	public void recovery()
	{
		System.out.println("Welcome to Recovery Wizard!\n\nRecovery is not possible if stack is shredded\n");
		if(!shred)
		{
			top=stack.length-1;
			display();
			System.out.println("Congratulations! Recovery Successful");
		}
		else System.out.println("OOppss... we have found that you have been shredded the stack");
	}

	public void shred()
	{
		while(top>-1)
		{
			stack[top]=0;
			top--;
		}
		System.out.println("shredding completed...");
		shred=true;
	}

	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.create(7);
		System.out.println();
		s.isEmpty();
		System.out.println();
		s.isFull();
		System.out.println();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		s.push(6);
//		s.push(7);
//		s.push(8);
		System.out.println();
		s.display();
		System.out.println();
		s.isEmpty();
		System.out.println();
		s.isFull();
		s.pop();
		s.pop();
		s.pop();
		System.out.println();
		System.out.println();
		s.display();
		System.out.println();
		s.isEmpty();
		s.recovery();
		System.out.println();
		s.clear();
		System.out.println();
		s.display();
		System.out.println();
		s.recovery();
		System.out.println();
		s.shred();
		System.out.println();
		s.recovery();





		//int a[] = {1,2,3,4,5,6,7};
		//new ArrayDisplay().display(new char[2], new int[2],new int[3]);
	}

}
