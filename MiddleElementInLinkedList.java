package com.sinha.aniket.linkedlist;

public class MiddleElementInLinkedList {
		Node head;
		
		static class Node{
			int data;
			Node next;
			Node(int data){
				this.data=data;
				next=null;
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
		private void calculateMiddleElement(){
			Node slow = head;
			Node fast = head;
			
			while(fast!=null && fast.next!=null){
				slow=slow.next;
				fast=fast.next.next;			
			}
			System.out.println("Middle Element! "+slow.data);
		
			
		}
		
	public static void main(String[] args) {
		MiddleElementInLinkedList s = new  MiddleElementInLinkedList();
		s.head=new Node(454);
		Node n2=new Node(77);
		Node n3=new Node(99);
		Node n4=new Node(55);
		Node n5=new Node(22);
		Node n6=new Node(11);
		
		
		s.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		
		
		s.displayList();
		s.calculateMiddleElement();
	}

}
