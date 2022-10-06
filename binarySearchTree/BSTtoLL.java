package binarySearchTree;
import linkedList.Node;
import java.util.ArrayList;
import java.util.Scanner;

public class BSTtoLL {
	
	public static void ll(BSTNode <Integer> root,ArrayList<Integer> vals){
		if(root==null) {
			return ;
		}
		ll(root.left,vals);
		vals.add(root.data);
		ll(root.right,vals);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of elements:");
		int count=sc.nextInt();
		System.out.println("Enter numbers in sorted form");
		int [] ar=new int[count];
		for(int i=0;i<count;i++) {
			ar[i]=sc.nextInt();
		}
		BSTNode<Integer> root=ConstructBST.constructBSTHelper(ar);
		ArrayList<Integer> vals=new ArrayList<>();
		ll(root,vals);
		for(int i=0;i<count;i++) {
			System.out.println(vals.get(i));
		}

	}

}
