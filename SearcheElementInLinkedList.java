package com.sinha.aniket.linkedlist;

public class SearcheElementInLinkedList {
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
	
	private void searchElement(int item){
		int count=0;
		Node temp=head;
		if(head.data==item){
			System.out.println("item Found!"+ item+" "+count);
			return;
		}
		while(temp!=null){
			count++;
			temp=temp.next;
			if(temp.data==item){
				System.out.println("item Found!at index "+count );
			}
			else{
				System.out.println("404!");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {

		SearcheElementInLinkedList s=new SearcheElementInLinkedList();
		s.head=new Node(454);
		Node n2=new Node(77);
		Node n3=new Node(99);
		Node n4=new Node(55);
		
		s.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		s.displayList();
		s.searchElement(454);
		}
}
