package com.sinha.aniket.linkedlist;

import java.util.Stack;

public class CircularLinkedListTraversal {
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
			if(temp==head){
				break;
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		CircularLinkedListTraversal cll=new CircularLinkedListTraversal();
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		
		cll.head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;
		
		cll.displayList();
	}

}
