package dataStructures;

public class LinkedLst 
{
	static Node head;

	static class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;
		}
	}

	static void insertFront(Object data)
	{
		if(head==null)
		{
			Node newNode = new Node(data);
			head=newNode;
			System.out.println("success");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println("success");
	}

	static void insertRear(Node node, Object data) // recursive approach we can use while loop also
	{
		if(head==null)
		{
			Node newNode = new Node(data);
			head=newNode;
			System.out.println("success");
			return;
		}

		if(node.next==null) 
		{
			Node newNode = new Node(data);
			node.next = newNode;
			System.out.println("success");
			return;
		}
		
		insertRear(node.next,data);
	}
	
	static void display()
	{
		Node temp = head;
		
		if(temp==null) { System.out.println("Linked List is Empty"); return;}
		
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data+" "); //residual end element similar as string problem which remains at last w/o traversing
	}
	
	static Node recursiveReverse(Node head1)
	{
		//Node currNode = null,prevNode = null;
		
		if(head1==null | head1.next==null)  return head1;
		
		Node newNode = recursiveReverse(head1.next);
		
		newNode.next.next = head1;
		newNode.next = null;
		
		return newNode;
		
	}
	
	public static void main(String[] args)
	{
		insertFront("This");
		insertFront("is");
		insertFront("a");
		insertRear(head, "linked");
		insertRear(head, "list");
		display();
		System.out.println();
		recursiveReverse(head);
		display();
	}
}
