package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTNode<T> {

	public T data;
	BSTNode<T> left;
	BSTNode<T> right;

	BSTNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public static BSTNode<Integer> takeInput(Scanner sc) {
		System.out.println("Enter val of root");
		int data = sc.nextInt();
		BSTNode<Integer> root = new BSTNode<>(data);
		Queue<BSTNode<Integer>> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			BSTNode<Integer> top = q.poll();

			System.out.println("Enter value of left node of " + top.data);
			data = sc.nextInt();
			if (data != -1) {
				top.left = new BSTNode<>(data);
				q.add(top.left);
			}
			System.out.println("Enter value of right node of " + top.data);
			data = sc.nextInt();
			if (data != -1) {
				top.right = new BSTNode<>(data);
				q.add(top.right);
			}

		}
		return root;

	}

}
