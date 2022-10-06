package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputItr {

	// also make print function

	public static TreeNode<Integer> takeInputItr(Scanner sc) {
		System.out.println("ENter value of root");
		int data = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data);
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode<Integer> frontNode = q.poll();
			System.out.println("Enter number of child of  " + frontNode.data);
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.println("Enter value of " + (i + 1) + "th child");
				data = sc.nextInt();
				TreeNode<Integer> child = new TreeNode<>(data);
				frontNode.children.add(child);
				q.add(child);
			}

		}
		return root;

	}
	
	public static void printItr(TreeNode<Integer> root) {
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			root=q.poll();
			System.out.print("Children of "+root.data+":");
			for(int i=0;i<root.children.size();i++) {
				q.add(root.children.get(i));
				System.out.println(root.children.get(i).data+" ,");
			}
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-
		Scanner sc = new Scanner(System.in);

		TreeNode<Integer> root = takeInputItr(sc);
					printItr(root);
//		TakeInputRecur.printTN(root);

	}

}
