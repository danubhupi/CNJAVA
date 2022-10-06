package binarySearchTree;



public class Print {
	
	public static void printBST(BSTNode<Integer> root) {
		if (root == null)
			return;
		System.out.println(root.data);
		if(root.left!=null) {
			System.out.println(" L "+ root.left.data );
		}
		if(root.right!=null) {
			System.out.println(" R "+ root.right.data );
		}
		printBST(root.left);
		
		printBST(root.right);

	}

}
