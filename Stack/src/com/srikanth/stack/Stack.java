package com.srikanth.stack;

public class Stack {
	
	private StackNode top = null;
	private int size;
	
	public void push(int data ) {
		StackNode newNode = new StackNode(data);
		if(isEmpty()) {
			top = newNode;
			size++;
			return;
		}
		else {
			newNode.setNext(top);
			top = newNode;
			size++;
		}
	}
	
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			StackNode temp = top;
			top = top.getNext();
			temp.setNext(null);
			size--;
			return temp.getData();
		}
				
	}

	
	public int getSize() {
		return size;
	}
	
	public int peek() {
		if(!isEmpty())
			return top.getData();
		else
			return -1;
	}
	
	public boolean isEmpty() {
		return(null == top);
	}
	
	/*public void traverse() {
		System.out.println("Traversing Stack");
		StackNode temp = top;
		while(null != temp) {
			System.out.print(" " +temp.getData());
			temp = temp.getNext();	
		}
		System.out.println();
	}*/

}
