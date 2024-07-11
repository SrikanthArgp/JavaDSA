package com.srikanth.linkedlist;

public class LinkedListUtilityMain {
	
	public static void main(String[] args) {
		
		LinkedList linkedListOne = new LinkedList();
		linkedListOne.append(4);
		linkedListOne.append(8);
		linkedListOne.append(17);
		linkedListOne.append(23);
		linkedListOne.append(47);
		linkedListOne.append(69);
		linkedListOne.append(74);
		System.out.println("First LL : ");
		linkedListOne.traverse();
		
		
		LinkedList linkedListtwo = new LinkedList();
		linkedListtwo.append(5);
		linkedListtwo.append(7);
		linkedListtwo.append(18);
		linkedListtwo.append(22);
		linkedListtwo.append(45);
		linkedListtwo.append(72);
		linkedListtwo.append(89);
		linkedListtwo.append(92);
		System.out.println("Second LL : ");
		linkedListtwo.traverse();
		
		
		LinkedList mergedListOne = LinkedListUtility.mergeSortListIteration(linkedListOne, linkedListtwo);
		System.out.println("Merged list (Iterative): ");
		mergedListOne.traverse();
		
		LinkedList linkedListThree = new LinkedList();
		linkedListThree.append(4);
		linkedListThree.append(8);
		linkedListThree.append(17);
		linkedListThree.append(23);
		linkedListThree.append(47);
		linkedListThree.append(69);
		linkedListThree.append(74);
		System.out.println("Third LL : ");
		linkedListThree.traverse();
		
		
		LinkedList linkedListFour = new LinkedList();
		linkedListFour.append(5);
		linkedListFour.append(7);
		linkedListFour.append(18);
		linkedListFour.append(22);
		linkedListFour.append(45);
		linkedListFour.append(72);
		linkedListFour.append(89);
		linkedListFour.append(92);
		System.out.println("Fourth LL : " );
		linkedListFour.traverse();
		
		
		LinkedList mergedListTwo = LinkedListUtility.mergeSortedListsRecursive(linkedListThree, linkedListFour);
		System.out.println("Merged List (Recursive) : " );
		mergedListTwo.traverse();
		
		LinkedList linkedListFive = new LinkedList();
		linkedListFive.append(4);
		linkedListFive.append(8);
		linkedListFive.append(9);
		linkedListFive.append(5);
		System.out.println("Fifth LL : " );
		linkedListFive.traverse();
		
		LinkedList linkedListSix = new LinkedList();
		//linkedListSix.insert(7);
		linkedListSix.append(8);
		linkedListSix.append(2);
		linkedListSix.append(6);
		System.out.println("Sixth LL : " );
		linkedListSix.traverse();
		
		LinkedList sumList = LinkedListUtility.addLists(linkedListFive, linkedListSix);
		System.out.println("Reverse Sum List : ");
		sumList.traverse();
		
		LinkedList forwardSumList = LinkedListUtility.addListsForward(linkedListFive, linkedListSix);
		System.out.println("Forward Sum List : ");
		forwardSumList.traverse();
		
		LinkedList linkedListSeven = new LinkedList();
		linkedListSeven.append(50);
		linkedListSeven.append(32);
		linkedListSeven.append(85);
		linkedListSeven.append(27);
		linkedListSeven.append(56);
		linkedListSeven.append(98);
		linkedListSeven.append(12);
		linkedListSeven.append(18);
		linkedListSeven.append(5);
		linkedListSeven.append(2);
		System.out.println("List Before Partition : ");
		linkedListSeven.traverse();
		System.out.println("List After Partition : ");
		LinkedList partitionedList = LinkedListUtility.partition(linkedListSeven, 32);
		partitionedList.traverse();
		
		LinkedList linkedListPalindrome = new LinkedList();
		linkedListPalindrome.append(2);
		linkedListPalindrome.append(4);
		linkedListPalindrome.append(6);
		linkedListPalindrome.append(8);
		linkedListPalindrome.append(10);
		linkedListPalindrome.append(6);
		linkedListPalindrome.append(4);
		linkedListPalindrome.append(2);
		System.out.println(" Palindrome List : ");
		linkedListPalindrome.traverse();
		
		System.out.println("Is Palindrome : " +LinkedListUtility.isPalindrome(linkedListPalindrome));
		
		LinkedList palindromeList = new LinkedList();
		createPalindromeList(palindromeList, 5);
		//System.out.println(" Palindrome List : ");
		//palindromeList.traverse();
		
		LinkedList pList = new LinkedList();
		createPalindromeList(pList, 10);
		System.out.println(" Palindrome List : ");
		pList.traverse();
		System.out.println(" Is Palindrome : " +LinkedListUtility.isPalindrome(pList));
		
		System.out.println("");
		
	}
	
	public static void createPalindromeList(LinkedList list, int data) {
		if(data==0) {
			list.append(5);
			return;
		}
		else {
			
			data--;
			list.append(data);
			createPalindromeList(list, data);
			list.append(data);
		}
	}

	
}
