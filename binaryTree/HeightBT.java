package binaryTree;

import java.util.Scanner;

public class HeightBT {
	
	public static int height(BTNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		
		return 1+Math.max(height(root.left), height(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		BTNode<Integer>root=TakeInputBT.takeInputBT(sc);
		System.out.println(height(root));

	}

}
//inputs
//2 1 3 4 5 6 -1 -1 -1 -1 -1 -1 -1 
//2 1 3 4 5 6 -1 1 -1 -1 -1 -1 -1 -1 -1  


