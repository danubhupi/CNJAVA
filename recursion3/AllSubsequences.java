package recursion3;

public class AllSubsequences {
	
	public static void print(String []ar) {
		for(String i:ar) {
			System.out.println(i);
		}
	}
	
	public static String[] allSubseq(String s,int index,String [] ans) {
		if(index<0)return ans;
		String[] newAns=new String[2*ans.length];
		for(int i=0;i<ans.length;i++) {
			newAns[i]=ans[i];
			newAns[i+ans.length]=s.charAt(index)+ans[i];
		}
		
		return allSubseq(s,index-1,newAns);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ar=new String[1];
		ar[0]="";
		print(allSubseq("xyz",2,ar));
		
		
		

	}

}
