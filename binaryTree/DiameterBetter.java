package binaryTree;

import java.util.Scanner;

public class DiameterBetter {
	
	public static Pair<Integer,Integer> DiameterHeight(BTNode<Integer> root) {
		
		//if root is null then that means height and 
		// diameter will be zero
		if(root==null) {
			Pair<Integer,Integer> diaHeight=new Pair<>();
			diaHeight.first=0;
			diaHeight.second=0;
			return diaHeight;
		}
		
		Pair<Integer,Integer> leftOutput=DiameterHeight(root.left);
		Pair<Integer,Integer> rightOutput=DiameterHeight(root.right);
		
		
		
			
		
		//height of current node
		int currentHeight=Math.max(leftOutput.first, rightOutput.first);
		int currentDiameter=leftOutput.first+rightOutput.first;
		
		//diameter through current node
		int diaLeft=leftOutput.second;
		int diaRight=rightOutput.second;
		
		int resDiameter=Math.max(diaLeft, Math.max(currentDiameter, diaRight));
		System.out.println(resDiameter);
		Pair<Integer,Integer> res=new Pair<>();
		res.first=1+currentHeight;
		res.second=resDiameter;
		return res;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		BTNode<Integer> root=TakeInputBT.takeInputBT(sc);
		System.out.println(DiameterHeight(root).second);
		

	}

}
