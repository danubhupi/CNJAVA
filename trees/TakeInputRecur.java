package trees;

import java.util.Scanner;

public class TakeInputRecur {
  
	//take input in dfs form
	public static TreeNode<Integer> takeInput(Scanner sc){
		
		System.out.println("Enter node value:");
//		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		TreeNode<Integer> root= new TreeNode<>(data);
		
		System.out.println("Enter num of children of "+ data+":");
		int childCount=sc.nextInt();
		
		for(int i=0;i<childCount; i++) {
//			System.out.println("Enter "+ (i+1)+ "th child ");
			TreeNode<Integer> child=takeInput(sc);
			root.children.add(child);
		}
		
		return root;
	}
	
	//also make print function
	public static void printTN(TreeNode<Integer> root) {
		if(root==null)return;
		 System.out.print("children of "+ root.data+":");
		 
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+" ");
//			printTN(root.children.get(i));
		}
		System.out.println();
		
		for(int i=0;i<root.children.size();i++) {
			
			printTN(root.children.get(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeNode<Integer> root =takeInput(sc);
        System.out.println();
        printTN(root);
	}

}
//2 3 1 0 4 2 5 0 6 0 3 1 7 0
