package com.binary.operations;

import java.util.Stack;

public class BstOperations {
	BstNode root;
	
	public BstNode addNode(BstNode root,int value) {
		if(root==null) {
			return new BstNode(value);
		}
		if(value<root.data) {
			
			root.leftChild=addNode(root.leftChild,value);
			
		}else{	
			
			root.rightChild=addNode(root.rightChild,value);
			
		}
		return root;
	}
	
	public void inOrderTraversal(BstNode root) {
		if(root==null) {
			return;
		}
		
		inOrderTraversal(root.leftChild);
		System.out.print(root.data+" ");
		inOrderTraversal(root.rightChild);
		
	}
	
	public void displayRecursivly(BstNode root) {
			Stack<BstNode> sc=new Stack<>();
			BstNode curr=root;
			while(curr.leftChild!=null && !sc.isEmpty()) {
				sc.push(curr);
				curr=curr.leftChild;
			}
			System.out.println(curr.data);
			curr=sc.pop();
			curr=curr.rightChild;
		
	}
	
}
