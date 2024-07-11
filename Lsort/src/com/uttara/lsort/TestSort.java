package com.uttara.lsort;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL ll1 = new SLL(null);
		ll1.append(10);
		ll1.append(30);
		ll1.append(50);
		ll1.append(70);
		ll1.traverse();
		
		System.out.println("getMiddle : "+ll1.getMiddle(ll1.getHead()).getData());
		
		SLL ll2 = new SLL(null);
		ll2.append(20);
		ll2.append(40);
		ll2.append(60);
		ll2.append(80);
		ll2.traverse();
		
		ll1.merge(ll1, ll2);
		ll1.traverse();
		
		SLL lls = new SLL(null);
		lls.append(90);
		lls.append(20);
		lls.append(80);
		lls.append(70);
		lls.append(10);
		lls.append(50);
		lls.append(30);
		lls.append(80);
		lls.append(50);
		lls.append(40);
		lls.traverse();
		lls.sortl();
		lls.traverse();
		
	}

}
