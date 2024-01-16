package dataStructures;

import dataStructures.BinarySearchTree.Node;

public class BinarySearchTree //hetero.
{
	static Node root;//root is dynamic pointer checks current node is root or leaf it does not mean parent
	static class Node
	{
		int data;
		Node leftAdd; //child linkage and parent detection
		Node rightAdd;
		Node(int data)
		{
			this.data=data;
		}
	}

	static void insert(Node root,int data)
	{
		if(data<root.data)
		{
			if(root.leftAdd==null)
			{
				root.leftAdd=new Node(data);
				System.out.println(data+" had been added towards left of "+root.data);
			}
			else
			{
				insert(root.leftAdd,data);
			}
		}
		else if(data>root.data) // don't use else it will allow duplicates but bst does not allow duplicate
		{
			if(root.rightAdd==null)
			{
				root.rightAdd=new Node(data);
				System.out.println(data+" had been added to right of "+root.data);
			}
			else
			{
				insert(root.rightAdd,data);
			}
		}

	}
	
	public static void inOrderTraversal(Node root)
	{
		if(root!=null)
			System.out.println(root.data
					);
	}

	public static void main(String[] args) {
		Node root=new Node(50);
		insert(root,10);
		insert(root,20);
		insert(root,40);
		insert(root,3);
		insert(root,40);
		
		
		
	}

}




























