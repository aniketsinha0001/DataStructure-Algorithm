package com.aniket.treedemo;

class BinaryTreeCreation{	
	static class Node{
		Node left;
		Node right;
		int root;
		Node(int root){
			this.root=root;
			left=null;
			right=null;
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeCreation b=new BinaryTreeCreation();
		Node root=new Node(1);
		Node d2=new Node(2);
		Node d3=new Node(3);
		Node d4=new Node(4);
		Node d5=new Node(5);
		
		root.left=d2;
		root.left.left=d3;
		root.left.right=d4;
		root.right=d5;
		
		System.out.println("In Order Traversal");
		b.inOrderTraverse(root);
		System.out.println("PreOrder Traversal");
		b.preOrderTraversal(root);
	}
	public void inOrderTraverse(Node node) {
		if(node!=null) {
			inOrderTraverse(node.left);
			System.out.print(node.root+" ");
			inOrderTraverse(node.right);
		}
		else {
			return;
		}
	}
	
	private void preOrderTraversal(Node node) {
		if(node!=null) {
		System.out.print(node.root+" ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
		}
	}
}
