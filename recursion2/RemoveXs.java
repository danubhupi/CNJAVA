package recursion2;

public class RemoveXs {
	
	public static String removeX(String s,int index) {
		if(index>=s.length()) {
			return "";
		}
		String ans="";
		if(s.charAt(index)!='x') {
			ans+=s.charAt(index);
		}
		
		return ans+ removeX(s,index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeX("heloxx",0));

	}

}
