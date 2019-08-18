package com.sinha.aniket;

public class LinkedListReverse {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}			
	}
	private void displayList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	private Node reverseLinkedList() {
		Node prevNode=null;
		Node currentNode=head;
		Node nextNode=null;
		while(currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=prevNode;
			prevNode=currentNode;
			currentNode=nextNode;		
		}
		head= prevNode;
		return head;
	}

	public static void main(String[] args) {

		LinkedListReverse l=new LinkedListReverse();
		l.head= new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		
		l.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		l.displayList();
		l.reverseLinkedList();
		System.out.println("After LinkedList Reverse!");
		l.displayList();
	}
}
