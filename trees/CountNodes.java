package trees;
import java.util.Scanner;

public class CountNodes {
	
	public static int countNodes(TreeNode<Integer> root) {
		if(root.children.size()==0) {
			return 1;
		}
		int sum=0;
		for(int i=0;i<root.children.size();i++) {
			sum+=countNodes(root.children.get(i));
		}
		
		
		
		return sum+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeNode<Integer>root=TakeInputRecur.takeInput(sc);
		System.out.println(countNodes(root));

	}

}
