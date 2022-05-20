package recursion3;

import java.util.ArrayList;

public class SubsetSumK {
	
	public static void helper(int [ ]ar,int index,ArrayList<Integer>temp,ArrayList<ArrayList<Integer> > result,int sum,int target) {
		if(sum==target) {
			ArrayList<Integer> temp1= new ArrayList<Integer>(temp);
			result.add(temp1);
			return;
		}
		if(index>=ar.length) {
			return;
		}
		temp.add(ar[index]);
		sum+=ar[index];
		helper(ar,index+1,temp,result,sum,target);
		temp.remove(temp.size()-1);
		sum-=ar[index];
		helper(ar,index+1,temp,result,sum,target);
		
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
	
	public static void subsets(int[] ar,int target) {
		ArrayList<Integer>temp=new ArrayList<>();
		ArrayList<ArrayList<Integer> >result=new ArrayList<ArrayList<Integer>>();
		helper(ar,0,temp,result,0,target);
		print(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={5 ,12 ,3 ,17, 1 ,18 ,15 ,3 ,17 };
		int target=6;
		subsets(ar,target);

	}

}
