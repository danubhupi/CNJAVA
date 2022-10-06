package binaryTree;

import java.util.*;

public class TakeInputBT {

	public static BTNode<Integer> takeInputBT(Scanner sc) {
		System.out.println("Enter val of root");
		int data = sc.nextInt();
		BTNode<Integer> root = new BTNode<>(data);
		Queue<BTNode<Integer>> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			BTNode<Integer> top = q.poll();

			System.out.println("Enter value of left node of "+ top.data);
			data = sc.nextInt();
			if (data != -1) {
				top.left = new BTNode<>(data);
				q.add(top.left);
			}
			System.out.println("Enter value of right node of "+ top.data);
			data = sc.nextInt();
			if (data != -1) {
				top.right = new BTNode<>(data);
				q.add(top.right);
			}

		}
		return root;
	}

	public static void printBT(BTNode<Integer> root) {
		if (root == null)
			return;
		System.out.println(root.data);
		if(root.left!=null) {
			System.out.println(" L "+ root.left.data );
		}
		if(root.right!=null) {
			System.out.println(" R "+ root.right.data );
		}
		printBT(root.left);
		
		printBT(root.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BTNode<Integer> root = takeInputBT(sc);
		printBT(root);

	}

}
