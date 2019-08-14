package com.sinha.aniket.linkedlist;

public class DeleteEntireLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public void deleteEntireList(){
		head=null;	
	}
	
	public static void main(String[] args) {
		DeleteEntireLinkedList d=new DeleteEntireLinkedList();
		d.head = new Node(10);
		Node n2= new Node(50);
		Node n3= new Node(60);
		Node n4= new Node(45);
		Node n5= new Node(54);
		
		d.head.next = n2;
		n2.next= n3;
		n3.next = n4;
		n4.next = n5;
		
		d.display();
		d.deleteEntireList();
		d.display();
	}

}
