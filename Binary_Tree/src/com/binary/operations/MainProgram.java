package com.binary.operations;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BstOperations b=new BstOperations();	
		BstNode root= b.addNode(null,40);
		b.addNode(root, 10);
		b.addNode(root, 50);
		b.addNode(root, 30);
		b.addNode(root, 80);
		
		b.inOrderTraversal(root);
		
		b.displayRecursivly(root);
		
	}

}
