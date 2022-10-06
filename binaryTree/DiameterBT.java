package binaryTree;
import java.util.*;
public class DiameterBT {
	
	public static int diameterBT(BTNode<Integer> root) {
		if(root==null)return 0;
		
		//Here call will be made twice for the same thing
		//as we need height of left and right nodes
		//for the diameter of the node
		int opt1=HeightBT.height(root.left)+ HeightBT.height(root.right);
		int opt2=diameterBT(root.left);
		int opt3=diameterBT(root.right);
		return Math.max(opt2, Math.max(opt1, opt3));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BTNode<Integer> root= TakeInputBT.takeInputBT(sc);
		System.out.println(DiameterBetter.DiameterHeight(root).first);
		

	}

}
