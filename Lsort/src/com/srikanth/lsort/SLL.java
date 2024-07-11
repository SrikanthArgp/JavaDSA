package com.srikanth.lsort;


public class SLL {
	
	private Node head;
	private int size;
	
	public SLL(Node n) {
		this.head = n;
	}
	
	
	
	public Node getHead() {
		return head;
	}



	public void setHead(Node head) {
		this.head = head;
	}



	public void append(int data) {
		// Create a new node
		Node newNode = new Node(data);
		// If it is the head node
		if (null == head) {
			head = newNode;
		} 
		else {
			// Traverse till the end
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			// Append new node to last node
			temp.setNext(newNode);
		}
		size++;
	}
	
	public void traverse() {
		Node temp = head;
		// Traverse till the end node by node
		while (null != temp) {
			// display data in each node
			System.out.print(" " + temp.getData());
			temp = temp.getNext();
		}
		System.out.println();	
	}
	
	public  Node getMiddle(Node n) {
		Node slow=n;
		Node fast=n;
		
		while(fast!=null && 
			fast.getNext()!=null && 
			fast.getNext().getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}
	
	
	public void  merge(SLL l1, SLL l2) {
		 head = merge(l1.getHead(), l2.getHead());
		//return this;
	}
	
	
	public void sortl() {
		head = sortll(head);
	}
	
	
	



	private Node sortll(Node head) {
		// TODO Auto-generated method stub
		if(head==null || head.getNext()==null)
			return head;
		else {
			Node mid = getMiddle(head);
			Node splitH = mid.getNext();
			mid.setNext(null);
			
			Node first = sortll(head);
			Node second = sortll(splitH);
			
			return merge(first, second);
		}
	}



	private Node merge(Node nodeA, Node nodeB) {
		// TODO Auto-generated method stub
		Node mergedNode ;
		 Node headNode ;      

		if (nodeA == null) {
		    return nodeB;
		  } 
		  if (nodeB == null) {
		    return nodeA;
		  }     


		if ( nodeA.getData() < nodeB.getData()) {
		    mergedNode = nodeA;
		    nodeA = nodeA.getNext();
		}
		else {
		    mergedNode = nodeB;
		    nodeB = nodeB.getNext();
		}

		headNode = mergedNode; 

		while (nodeA != null && nodeB != null) {           

		    if ( nodeA.getData() < nodeB.getData()) {               
		        mergedNode.setNext(nodeA);
		        nodeA = nodeA.getNext();
		    }
		    else {
		        mergedNode.setNext(nodeB);
		        nodeB = nodeB.getNext();                
		    }       
		    mergedNode = mergedNode.getNext();
		}

		if (nodeA != null) {
		    mergedNode.setNext(nodeA);
		}

		if (nodeB != null) {
		    mergedNode.setNext(nodeB);
		}       
		return headNode;
	}
	
	

}
