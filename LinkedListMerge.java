package thedatastructure.com.stack;

import thedatastructure.com.stack.LinkedListDemo.Node;

class LinkedListDemo {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void displayLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static Node mergeTwoLinkedList(Node n1, Node n2) {
		Node mergeNode = new Node(0);
		Node temp1 = n1;
		Node temp2 = n2;
		Node current = mergeNode;
		while (temp1 != null && temp2 != null) {
			if (temp1.data <= temp2.data) {
				current.next = temp1;
				temp1 = temp1.next;
			} else {
				current.next = temp2;
				temp2 = temp2.next;
			}
			current = current.next;
		}
		while (temp1 != null) {
			current.next = temp1;
			temp1 = temp1.next;
			current = current.next;
		}
		while (temp2 != null) {
			current.next = temp2;
			temp2 = temp2.next;
			current = current.next;
		}
		return mergeNode.next;
	}
}

public class LinkedListMerge {
	public static void main(String[] args) {
		LinkedListDemo d1 = new LinkedListDemo();
		LinkedListDemo d2 = new LinkedListDemo();
		LinkedListDemo list = new LinkedListDemo();

		d1.head = new Node(1);
		d1.head.next = new Node(2);
		d1.head.next.next = new Node(4);
		d1.displayLinkedList(d1.head);

		d2.head = new Node(1);
		d2.head.next = new Node(3);
		d2.head.next.next = new Node(4);
		System.out.println();
		d2.displayLinkedList(d2.head);

		Node mergedLinkedList = list.mergeTwoLinkedList(d1.head, d2.head);
		System.out.println();
		list.displayLinkedList(mergedLinkedList);
	}
}
