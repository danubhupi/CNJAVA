package binarySearchTree;

import java.util.Scanner;

public class BtwKandK1 {
	
	public static void searchBtw(BSTNode<Integer>root, int k,int k1) {
		if(root==null) {
			return;
		}
		if(root.data>=k && root.data<=k1) {
			System.out.println(root.data);
			searchBtw(root.left,k,k1);
			searchBtw(root.right,k,k1);
		}
		else if(root.data<k) {
			searchBtw(root.right,k,k1);
		}
		else if(root.data>k1) {
			searchBtw(root.left,k,k1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BSTNode<Integer> root=BSTNode.takeInput(sc);
		System.out.println("Enter lower bound:");
		int low=sc.nextInt();
		System.out.println("Enter upper bound:");
		int high=sc.nextInt();
		
		searchBtw(root,low,high);

	}

}
