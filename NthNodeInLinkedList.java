package com.sinha.aniket.linkedlist;

public class NthNodeInLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	private void displayList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	private void getNthNodeLinkedList(int index){
		int count=0;
		Node temp = head;
		while(temp!=null){
			if(count==index){
				System.out.println("Data at index "+ index+ " is "+temp.data);
			}
			temp=temp.next;
			count++;
		}
	}
	
	public static void main(String[] args) {

		NthNodeInLinkedList s=new NthNodeInLinkedList();
		s.head=new Node(454);
		Node n2=new Node(77);
		Node n3=new Node(99);
		Node n4=new Node(55);
		
		s.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		s.displayList();
		
		s.getNthNodeLinkedList(2);
		
		}
}
