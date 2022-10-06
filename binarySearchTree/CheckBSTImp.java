package binarySearchTree;

import java.util.Scanner;

public class CheckBSTImp {
	
	public static boolean checkBST(BSTNode<Integer> root) {
		if (root == null) {
			return true;
		}
		
		boolean resLeft=checkBST(root.left);
		boolean resRight= checkBST(root.right);
		boolean res=resLeft&&resRight;
		if (!(root.left == null || root.data > root.left.data)) {
			return false;
		}

		if (!(root.right == null || root.data <= root.right.data)) {
			return false;
		}

		 return res;

	}
//	10 5 15 2 7 12 25 -1 -1 -1 -1 -1 -1 -1 -1 

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
