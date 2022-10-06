package binaryTree;

import java.util.Scanner;

public class CheckBalanced {
	
	
	//Balanced means difference of height of left subtree
	// and right subtree must be <= 1 for any node in tree
	public static boolean checkBalanced(BTNode<Integer> root) {
		if(root==null) {
			return true;
		}
		// height of left subtree
		int leftHeight=HeightBT.height(root.left);
		//height of right subtree
		int rightHeight=HeightBT.height(root.right);
		//if differece in height is greater than 1
		// that means that tree is not balanced
		if(Math.abs(rightHeight-leftHeight)>1) {
			return false;
		}
		//if not then
		//check for the left subtree and right subtree
		return checkBalanced(root.left)&&checkBalanced(root.right);
		
		//this method is not the best as we need tp check the height
		//of same subtrees multiple time
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BTNode<Integer> root=TakeInputBT.takeInputBT(sc);
		System.out.println(checkBalanced(root));

	}

}
