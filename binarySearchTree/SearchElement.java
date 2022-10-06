package binarySearchTree;

import java.util.Scanner;

public class SearchElement {

	public static boolean searchElement(BSTNode<Integer> root, int key) {

		if (root == null) {
			return false;
		}

		if (key == root.data) {
			return true;
		}

		if (key < root.data) {
			return searchElement(root.left, key);
		} else {
			return searchElement(root.right, key);
		}

//		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be searched:");
		int key =sc.nextInt();

		BSTNode<Integer> root = BSTNode.takeInput(sc);
		System.out.println(searchElement(root, key));

	}

}
