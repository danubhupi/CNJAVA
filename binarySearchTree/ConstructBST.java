package binarySearchTree;

import java.util.Scanner;



public class ConstructBST {
	
	public static BSTNode<Integer> constructBST(int ar[],int low,int high){
		
		//if low goes high then we will return null
		//as we know that we've iterated over each element in that
		//range
		if(low>high) {
			return null;
		}
		
		//mid will represent the root of a subtree in
		//a particular rangee
		int mid= low+(high-low)/2;
		// root will be mid element
		BSTNode<Integer> root= new BSTNode<>(ar[mid]);
		
		// left subtree will be formed from elements at the 
		// left of root
		root.left=constructBST(ar,low,mid-1);
		
		// right subtree will be formed with elements at the
		// right of root
		root.right=constructBST(ar,mid+1,high);
		
		//return the root
		return root;
	}
	
	public static BSTNode<Integer> constructBSTHelper(int[]ar){
		return constructBST(ar,0,ar.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter number of nodes:");
		//number of nodes
		int count=sc.nextInt();
		
		//sorted array which will be made into bst
		int ar[]=new int[count];
		
		
		for(int i=0;i<count;i++) {
			ar[i]=sc.nextInt();
		}
		
		
		//balanced BST 
		BSTNode<Integer> root=constructBSTHelper(ar);
		Print.printBST(root);

	}

}
