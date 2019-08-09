package com.sinha.aniket.linkedlist;

// creating a Node 
public class LinkedListNodeCreation {
		Node head;  // Creating Head pointer
		
		static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
			}
		}
		
		public static void main(String args[]){
			
		//	Three nodes have been allocated dynamically. 
	      //    We have references to these three blocks as first, second and third 
			
			LinkedListNodeCreation l=new LinkedListNodeCreation();
			l.head=new Node(1);             
			Node n2=new Node(2);	
			Node n3=new Node(3);
			
			l.head.next=n2;	// Link first node with the second node 
		
			n2.next=n3; // Link second node with the third node 
			
		}
}
