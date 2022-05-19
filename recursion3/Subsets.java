package recursion3;
import java.util.*;

public class Subsets {
	
	public static void print(ArrayList<Integer> temp) {
		for(int i:temp) {
			System.out.print(i+" ");
		}
		if(temp.size()==0) {
			System.out.print("empty");
		}
		System.out.println();
	}
	
	public static void helper(int [ ]ar,int index,ArrayList<Integer>temp) {
		if(index>=ar.length) {
			print(temp);
			return;
		}
		temp.add(ar[index]);
		helper(ar,index+1,temp);
		temp.remove(temp.size()-1);
		helper(ar,index+1,temp);
		return;
	}
	
	public static void subsets(int[] ar) {
		ArrayList<Integer>temp=new ArrayList<>();
		helper(ar,0,temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={1,2,3,4};
		subsets(ar);

	}

}
