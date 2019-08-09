package com.sinha.aniket.linkedlist;

public class LinkedListInsertion {
		Node head;
		
		static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
				next=null;
			}
		}
		
		public void addFirst(int data){
			Node insertFront= new Node(data);
			
			insertFront.next=head;
			
			head=insertFront;		
			
		}
		
		public void addAfterNode(int data, Node n){
			
			if(n==null){
				System.out.println("Previous Node Can't be Null");
				return;
			}
			
			Node insertAtNode = new Node(data);
			insertAtNode.next = n.next;
			n.next = insertAtNode;		
			
		}
		
		public void addLast(int data){
			Node last=new Node(data);
			if(head==null){
				last=head;
				last.next=null;
				return;
			}
			else{
				Node temp=head;
				while(temp.next!=null){
					temp=temp.next;	
				}
				temp.next = last;
			}
			
		}
		
		public void displayLinkedList(){
			Node temp = head;
			while(temp!=null){
				
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
		public static void main(String args[]){
			LinkedListInsertion l = new LinkedListInsertion();
			l.head = new Node(1);
			Node n2=new Node(2);
			Node n3=new Node(3);
			Node n4=new Node(4);
			Node n5=new Node(5);
			
			l.head.next=n2;
			n2.next=n3;
			n3.next=n4;
			n4.next=n5;
			l.displayLinkedList();
			
			l.addFirst(9);
			System.out.println("After Adding Element at First!");
			l.displayLinkedList();
			
			l.addLast(8);
			System.out.println("After Adding Elemet at Last!");
			l.displayLinkedList();
			
			l.addAfterNode(88, l.head.next.next);
			System.out.println("After Inserting At particular Node");
			l.displayLinkedList();
		}
	
	
}
