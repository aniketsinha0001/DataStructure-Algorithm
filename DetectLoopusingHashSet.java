package com.sinha.aniket.linkedlist;

import java.util.HashSet;

public class DetectLoopusingHashSet {
		Node head;
		static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
				next=null;
			}
		}
		
		private boolean detectLoop(){
			Node temp = head;
			HashSet<Node> hs=new HashSet<>();
			while(temp!=null){
				if(hs.contains(temp)){
					System.out.println("Loop Detected!");
					return true;
				}
				hs.add(temp);
				temp=temp.next;
			}
			System.out.println("no Loop Found!");
			return false;
		}
		
	public static void main(String[] args) {
	
		DetectLoopusingHashSet dlp=new DetectLoopusingHashSet();
		dlp.head = new Node(11);
		
		Node n2=new Node(22);
		Node n3=new Node(44);
		Node n4=new Node(54);
		Node n5=new Node(88);
		
		dlp.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n4.next=n2;
		
		dlp.detectLoop();
	}

}
