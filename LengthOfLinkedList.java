package com.sinha.aniket.linkedlist;

public class LengthOfLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	private void displayListandCountOccurence(){
		Node temp=head;
		int count= 0;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
			count++;
		}
		System.out.println("No of Node in Linked List "+count);
	}

	public static void main(String[] args) {
		LengthOfLinkedList l=new LengthOfLinkedList();
		l.head= new Node(44);
		Node n2=new Node(55);
		Node n3= new Node(565);
		Node n4= new Node(45);
		Node n5=new Node(66);
		
		l.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		l.displayListandCountOccurence();
		
	}

}
