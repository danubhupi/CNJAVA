package binaryTree;

import java.util.Scanner;

public class Traversals {
	
	public static void inorder(BTNode<Integer> root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(" "+root.data+" ");
		inorder(root.right);
	}
	
	public static void postorder(BTNode<Integer>root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(" "+root.data+" ");
		
	}
	
	public static void preorder(BTNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(" "+root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BTNode<Integer> root = TakeInputBT.takeInputBT(sc);
		System.out.println("Inorder:");
		inorder(root);
		System.out.println();
		System.out.println("postorder:");
		postorder(root);
		System.out.println();
		System.out.println("preorder:");
		preorder(root);
	}

}
