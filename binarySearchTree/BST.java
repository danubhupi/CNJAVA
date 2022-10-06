package binarySearchTree;

import java.util.Scanner;

import binaryTree.TakeInputBT;

public class BST {
	
	BST(){
		root=null;
	}

	private BSTNode<Integer> root;
	
	
	
	public void takeInput(Scanner sc) {
		root=BSTNode.takeInput(sc);
	}

	
	public void print() {
		Print.printBST(root);
	}

	
	private BSTNode<Integer> insertDataHelper(int data, BSTNode<Integer>root) {
		if(root==null) {
			BSTNode<Integer> newChild= new BSTNode<>(data);
			return newChild;
		}
		
		if(data>=root.data) {
			root.right=insertDataHelper(data,root.right);
		}
		else {
			root.left=insertDataHelper(data,root.left);
		}
		
		return root;
		
	}
	
	public void insertData(int data) {
		root=insertDataHelper(data,root);

	}

	private boolean hasDataHelper(int data, BSTNode<Integer> root) {
		if (root == null) {
			return false;
		}

		if (root.data == data) {
			return true;
		} else if (root.data > data) {
			return hasDataHelper(data, root.left);
		} else {
			return hasDataHelper(data, root.right);
		}
	}

	public boolean hasData(int data) {

		return hasDataHelper(data, root);

	}
	
	
	private BSTNode<Integer> deleteDataHelper(int data, BSTNode<Integer> root){
		
		if(root==null) {
			return null;
		}
		if(data<root.data) {
			root.left=deleteDataHelper(data,root.left);
		}
		else if(data>root.data) {
			root.right=deleteDataHelper(data,root.right);
		}
		else {
			
			if(root.right==null) {
				return root.left;
			}
			else if(root.left==null) {
				return root.right;
			}
			else {
			
			
			BSTNode<Integer> minNode=root.right;
			while(minNode.left!=null) {
				minNode=minNode.left;
			}
			root.data=minNode.data;
			root.right=deleteDataHelper(minNode.data,root.right);
		}
		}
		
		return root;
	}
	
	public void deleteData(int data){
		root= deleteDataHelper(data,root);
	}
	
	public static void main(String[] args)
	{
		BST root=new BST();
//		Scanner sc=new Scanner(System.in);
//		root.takeInput(sc);
//		root.print();
//		System.out.println("Enter value to be searched:");
//		int key=sc.nextInt();
//		System.out.println(root.hasData(key));
//		System.out.println("Enter value to be added to BST:");
//		int newData=sc.nextInt();
		
		root.insertData(10);
		root.insertData(5);
		root.insertData(15);
		root.insertData(2);
		root.insertData(20);
		root.insertData(12);
		root.insertData(7);
//		root.print();
//		System.out.println(root.hasData(20));
		root.deleteData(5);
		root.print();
		
//	4 2 6 1 3 5 7 -1 -1 -1 -1 -1 -1 -1 -1	
	}
}
