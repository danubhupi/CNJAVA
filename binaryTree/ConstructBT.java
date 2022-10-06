package binaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class ConstructBT {

	public static BTNode<Integer> constructBT(ArrayList<Integer> preorder, ArrayList<Integer> inorder, int ioStart,
			int ioEnd, int preoStart, int preoEnd) {

		if (ioStart >= preorder.size() || ioEnd >= preorder.size() || preoStart >= preorder.size()
				|| preoEnd >= preorder.size()) {
			return null;
		}
		if (ioStart < 0 || ioEnd < 0 || preoStart < 0 || preoEnd < 0) {
			return null;
		}
		if(ioStart>ioEnd || preoStart>preoEnd) {
			return null;
		}
		if (ioStart == ioEnd) {
			BTNode<Integer> child = new BTNode<>(inorder.get(ioStart));
			
			return child;

		}

		BTNode<Integer> root = new BTNode<>(preorder.get(preoStart));
		

		int rootInd = inorder.indexOf(preorder.get(preoStart));
		
		int length = rootInd - ioStart;
		
		BTNode<Integer> left = constructBT(preorder, inorder, ioStart, rootInd - 1, preoStart + 1, preoStart + length);
	
		
		BTNode<Integer> right = constructBT(preorder, inorder, rootInd + 1, ioEnd, preoStart + 1 + length, preoEnd);
		root.left = left;
		root.right = right;
		return root;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int countNodes = sc.nextInt();
		ArrayList<Integer> preorder = new ArrayList<Integer>();
		ArrayList<Integer> inorder = new ArrayList<Integer>();

		System.out.println("inorder:");
		for (int i = 0; i < countNodes; i++) {
			inorder.add(sc.nextInt());
		}
		System.out.println("preorder");
		for (int i = 0; i < countNodes; i++) {
			preorder.add(sc.nextInt());
		}

		BTNode<Integer> root = constructBT(preorder, inorder, 0, countNodes - 1, 0, countNodes - 1);
		
		TakeInputBT.printBT(root);

	}

}

//input
//7
//inorder
//4 1 5 2 6 3 7
//preorder
//2 1 4 5 3 6 7
