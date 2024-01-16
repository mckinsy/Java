package dataStructures;

public class LinkedList //heterogeneous
{
	Node head; //a pointer which has no value but points starting point of linked list
	class Node 
	{
		Node next;
		Object data;
		Node(Object data)
		{
			this.data=data;
			this.next=null;
		}
		//Node(){};
		class Tattu{class Fattu {};};
	}

	public void insertFront(Object data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			System.out.println("inserted front->"+data+"\t");//"@->"+head);
			return;
			//newNode.next=null;// no need by default it is
		}
		newNode.next=head;
		head=newNode;
		System.out.println("inserted front->"+data+"\t");//"@->"+head);
	}

	public void display()
	{
		System.out.println("\n\n**********LKDL Data**********\n");
		Node temp=head;
		if(head==null)
			System.out.println("Linked List is Empty");

		else
		{
			//System.out.print(head.data+" ");
			while(temp.next!=null)
			{
				System.out.print(temp.data+" ");//System.out.println(head.next.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data);
		}
	}
	
	public void insertRear(Object data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			System.out.println("inserted rear->"+data+"\t");
			return;
		}
		Node temp=head;//initialization initiation
		for(;temp.next!=null;)// creative think diff.
			temp=temp.next;//re-initialization or updation
		temp.next=newNode ; // assigned
		System.out.println("inserted rear->"+data+"\t");//"@->"+head);
	}
	
	public void delete()
	{
		if(head==null)
			System.out.println("empty");
		else
		{
			Node temp=head;//how to get address means how to get two pointer approach in form of object address
			while(temp.next.next==null)
				temp=temp.next;
			
			
		}
			
	}
	
	
	
	
	
	//		else if(newNode2.NodeAddress==null)
	//		{
	//			//newNode2.NodeAddress=head;
	//			Object temp=newNode.NodeAddress;
	//			while(temp!=null)
	//			{
	//				System.out.println(temp.data);
	//				temp=
	////				System.out.println(temp.data+" ");
	////				temp=temp.next;
	//			}
	//			System.out.println();
	//		}
	//		System.out.println(head==null?"LInked List is Empty":Node);
	//
	//	public void delete() //delete from last
	//	{
	//		//case empty and case one node case sequence of nodes
	//		if(head.nodeAddress==null)
	//		{
	//			System.out.println("empty");
	//		}
	//		else if(head.next==null)
	//			head=null;
	//		else
	//		{
	//			Node temp=head;
	//			while(temp.next.next!=null)
	//			{
	//				temp=temp.next;
	//			}
	//			System.out.println(temp.next+"deleted");
	//			temp.next=null;
	//		}
	//	}
	//
	//	public void deleteCustomNode(LinkedList Address)
	//	{
	//		if(Address!=null)
	//
	//	}
	//
	//	public void deleteFromFirst()
	//	{
	//		if not empty then head=head.next;
	//	}
	//
	//	public void insertFront()
	//	{
	//		if head is not null then n.next=head and head=n; else empty;
	//	}

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
//		ll.insertFront(10);
//		//System.out.println("java");
//		ll.insertFront("hello");
//		ll.insertFront("world");
//		ll.insertFront(78);
//		ll.insertFront("order1");
//		ll.insertFront("order2");
		ll.insertRear(10);
		ll.insertRear(20);
		ll.insertRear(30);
		ll.display();
		//		static LinkedList head=new LinkedList(10);
		//		LinkedList Node1=new LinkedList(52);
		//		LinkedList Node2=new LinkedList(61);
		//		head.NodeAddress=Node1;
		//		Node1.NodeAddress=Node2;
		//		Node2.NodeAddress=Node2;


	}

}
