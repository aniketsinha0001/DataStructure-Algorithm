package com.sinha.aniket.linkedlist;


class Stack {
	int top;
	int Max=10;
	int[] stack=new int[Max];
	
	Stack(){
		top=-1;
	}
	
	 void push(int data){
		// For push must check Overflow Condition.
		if(top==Max-1){
			System.out.println("Stack is Full");
		}
		else{
			 stack[++top]=data;
		}
	}
	
	void pop(){
		// For pop must check stack underflow condition.
		if(top==-1){
			System.out.println("Stack is Empty");
		}
		else{
			int x = stack[top--];
			System.out.println("Element removed! "+x);
		}
	}
	
	void peek(){
		if(top==-1){
			System.out.println("Stack is Empty");
		}
		else{
			int x=stack[top];
			System.out.println("Display Top element Peek "+x);
		}
	}
	void displayStack(){
		int temp=top;
		while(temp>=0){
			System.out.print(stack[temp]+" ");
			temp--;
		}
		System.out.println();
	}
}
class StackImpl{
	public static void main(String args[]){

	Stack s1=new Stack();
	s1.pop();
	s1.push(10);
	s1.push(20);
	s1.push(30);
	s1.push(40);
	
	s1.displayStack();
	
	s1.pop();
	s1.displayStack();
	
	s1.peek();
	}
}

