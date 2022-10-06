package binaryTree;

import java.util.Scanner;

public class CheckBalancedBetter {
	
	// here using pair to return info about subtrees
	//first will be the height of the subtree
	//second will be info that if it is balanced or not
	//here we will go from end to root
	//hence we wont need to check height of something again and again
	
	public static Pair<Integer,Boolean> checkBalanced(BTNode<Integer> root){
		//if root is null that means height for it will be zero
		//also it will be considered balanced as it follows definition
		if(root==null) {
			Pair<Integer,Boolean> res=new Pair<>();
			//seting height for it as zero
			res.first=0;
			//setiing its children as balanced
			res.second=true;
			return res;
		}
		
		//if a node is leaf node then
		//its height will be set as one
		//and it will be balanced as it folows the
		//definition
		
		if(root.left==null && root.right==null) {
			Pair<Integer,Boolean> res=new Pair<>();
			res.first=1;
			res.second=true;
			return res;
		}
		//gets info about the left (subtree) child
		Pair<Integer,Boolean> left=checkBalanced(root.left);
		//gets info abput the right  (subyree) child
		Pair<Integer,Boolean> right=checkBalanced(root.right);
		
		Pair<Integer,Boolean> res=new Pair<>();
		//height for current node will be max of its child plus one
		res.first=1 + Math.max(left.first, right.first);
		//if its children are balanced will be decided
		// by the difference in height between them
		//and if their children are balanced
		//basiclly we dont need to go and find height again and again
		
		res.second= (left.second&&right.second)&&(Math.abs(left.first-right.first)<=1);
		
		return res;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BTNode<Integer> root=TakeInputBT.takeInputBT(sc);
		Pair<Integer,Boolean>res=checkBalanced(root);
		System.out.println(res.second);

	}

}
