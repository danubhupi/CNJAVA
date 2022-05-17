package recursion3;

public class AllSubsequencesBetter {
	
	public static void print(String []ar) {
		for(String i:ar) {
			System.out.println(i);
		}
	}
	
	public static String[] allSubseq(String s) {
		if(s.length()==0) {
			String[] temp= {""};
			return temp;
			}
		
		String [] ans=allSubseq(s.substring(1));
		
		String[] newAns=new String[2*ans.length];
		for(int i=0;i<ans.length;i++) {
			newAns[i]=ans[i];
			newAns[i+ans.length]=s.charAt(0)+ans[i];
		}
		
		return newAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(allSubseq("xyz"));

	}

}
