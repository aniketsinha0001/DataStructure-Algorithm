package com.sinha.aniket.linkedlist;

import java.util.HashSet;

public class LengthofLoopLinkedList {

	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	private Node detectLoop(){
		Node temp = head;
		Node currentNode=null;
		HashSet<Node> hs=new HashSet<>();
		while(temp!=null){
			if(hs.contains(temp)){
				System.out.println("Loop Detected!");
				currentNode= temp;
				return temp;
			}
			hs.add(temp);
			temp=temp.next;
		}
		System.out.println("no Loop Found!");
		return null;
	}
	
	
	
	public static void main(String[] args) {
		LengthofLoopLinkedList dlp=new LengthofLoopLinkedList();
		dlp.head = new Node(11);
		
		Node n2=new Node(22);
		Node n3=new Node(44);
		Node n4=new Node(54);
		Node n5=new Node(88);
		
		dlp.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=dlp.head;
		
		Node startingNode = dlp.detectLoop();
		Node currentNode = dlp.detectLoop();
		int count = 0;
		for(int i =0 ; ; i++){
			if(currentNode.next == startingNode){
				 count++;
				 break;
			}
			else{
				count++;
				currentNode = currentNode.next;
			}
			
		}
		System.out.println(count);


	}
}
