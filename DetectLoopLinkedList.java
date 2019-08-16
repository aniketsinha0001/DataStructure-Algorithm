package com.sinha.aniket.linkedlist;

public class DetectLoopLinkedList {
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
	
	private int detectLoopUsingFloydCycleAlgo(){
		Node slow= head;
		Node fast= head;
		while(slow!=null && fast.next!=null){
			slow= slow.next;
			fast=fast.next.next;
			if(slow==fast){
			System.out.println("Loop Detected!");
				return 1;
			}
		}
		System.out.println("Loop not Found!");
		return 0;
		
	}
	
	public static void main(String[] args) {
		DetectLoopLinkedList dll= new DetectLoopLinkedList();
		dll.head = new Node(11);
		
		Node n2=new Node(22);
		Node n3=new Node(44);
		Node n4=new Node(54);
		Node n5=new Node(88);
		
		dll.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n4.next=n2;
		
		//dll.displayList();
		dll.detectLoopUsingFloydCycleAlgo();
	}

}
