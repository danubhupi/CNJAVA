package trees;
import java.util.Scanner;
public class HeightTree {
	
	public static int heightTree(TreeNode<Integer> root) {
		
		if(root.children.size()==0) {
			return 1;
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<root.children.size();i++) {
			max=Math.max(max, heightTree(root.children.get(i)));
		}
		
		return 1+max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeNode<Integer> root=TakeInputItr.takeInputItr(sc);
		System.out.println("Max height 0f tree: "+heightTree(root));

	}

}
