package binarySearchTree;

import java.util.Scanner;

public class CheckBST {

	public static boolean checkBST(BSTNode<Integer> root) {
		
		//empty tree is a BST
		if (root == null) {
			return true;
		}
		
		// left should be less then root 
		// or it can be null
		if (!(root.left == null || root.data > root.left.data)) {
			return false;
		}

		if (!(root.right == null || root.data <= root.right.data)) {
			return false;
		}

		return checkBST(root.left) && checkBST(root.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		BSTNode<Integer> root = BSTNode.takeInput(sc);
		long startTime = System.nanoTime();
		//code
		System.out.println(checkBST(root));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		

	}

}
