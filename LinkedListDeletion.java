package com.sinha.aniket.linkedlist;

public class LinkedListDeletion {
		Node head;
		static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
				next=null;
			}
		}
		
		public void removeFirst(){
			if(head==null){
				return;
			}
			Node temp=head;
			temp=head.next;
			head=temp;
		}
		
		public void removeAtIndex(int index){
			if(head==null){
				return;
			}
			Node temp=head;
			Node previous=null;
			while(temp!=null && temp.data!=index){
				previous=temp;
				temp=temp.next;
				previous.next=temp.next;	
			}			
		}
		
		public void removeLast(){
			if(head==null){
				return;
			}
			Node temp=head;
			while(temp.next.next!=null){
				temp=temp.next;
			}
			temp.next=null;
		}
		
		public void displayList(){
			
			Node temp = head;
			
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
		public static void main(String args[]){
			LinkedListDeletion l =new LinkedListDeletion();
			Node n1=new Node(10);
			Node n2=new Node(20);
			Node n3=new Node(30);
			Node n4=new Node(40);
			Node n5=new Node(50);
			l.head=n1;
			n1.next=n2;
			n2.next=n3;
			n3.next=n4;
			n4.next=n5;
			
			l.displayList();
			l.removeFirst();
			System.out.println("After Remove First");
			l.displayList();
			
			l.removeLast();
			System.out.println("After Remove Last");
			l.displayList();
			
			l.removeAtIndex(30);
			System.out.println("After Removing 30");
			l.displayList();
		}

}
