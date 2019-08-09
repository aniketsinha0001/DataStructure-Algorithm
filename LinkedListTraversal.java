package com.sinha.aniket.linkedlist;

public class LinkedListTraversal {
			Node head;
			
			static class Node{
				int data;
				Node next;
				
				Node(int data){
					this.data=data;	
					next=null;
				}
			}	
			
			public void traverseLinkedList(){
				Node temp = head;
				while(temp!=null){
					System.out.println(temp.data);
					temp=temp.next;
				}
			}
			
			public static void main(String args[]){
				
				LinkedListTraversal list=new LinkedListTraversal();
				
				list.head=new Node(10);
				
				Node n2=new Node(20);
				
				Node n3=new Node(15);
				
				Node n4=new Node(45);
				
				Node n5=new Node(455);

				
				list.head.next=n2;
				n2.next=n3;
				n3.next=n4;
				n4.next=n5;
				
				list.traverseLinkedList();
			}
}
