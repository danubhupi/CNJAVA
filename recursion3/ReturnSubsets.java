package recursion3;

import java.util.ArrayList;

public class ReturnSubsets {
	
	public static void helper(int [ ]ar,int index,ArrayList<Integer>temp,ArrayList<ArrayList<Integer> > result) {
		if(index>=ar.length) {
			ArrayList<Integer> temp1= new ArrayList<Integer>(temp);
			result.add(temp1);
			return;
		}
		temp.add(ar[index]);
		helper(ar,index+1,temp,result);
		temp.remove(temp.size()-1);
		helper(ar,index+1,temp,result);
		
		return;
	}
	
	public static void print(ArrayList<ArrayList<Integer>> temp) {
		for(ArrayList<Integer> i:temp) {
			for(int j:i) {
				System.out.print(j+" ");
			}if(i.size()==0) {
				System.out.print("empty");
			}
			System.out.println();
		}
		
		
	}
	
	public static void subsets(int[] ar) {
		ArrayList<Integer>temp=new ArrayList<>();
		ArrayList<ArrayList<Integer> >result=new ArrayList<ArrayList<Integer>>();
		helper(ar,0,temp,result);
		print(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={1,2,3};
		subsets(ar);
		
	}

}
