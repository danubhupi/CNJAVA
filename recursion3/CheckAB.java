package recursion3;

public class CheckAB {
	
	public static boolean checkAB(String s,int index) {
//		s.substring(index+1,index+2);
		
		System.out.println(index+ "yes");
		
		if(index>=s.length()) {return true;}
		
		if(s.charAt(index)=='a') 
		{
			if(index+1>=s.length()) {
				System.out.println(index+1);
				return true;
			}
			else if(s.charAt(index+1)=='a') {
				System.out.println(index+2);
				return checkAB(s,index+1);
			}
			else if(s.substring(1,3).charAt(0)=='b' &&  s.substring(1,3).charAt(1)=='b') {
				System.out.println(index+3);
				return checkAB(s,index+3);
			}
			else {
//			System.out.println(s.substring(index+1,index+3)); 
				return false;}
		}
		else {
			
			return false;}
		
		
//		if(s.substring(index,index+2)=="bb") {
//			if(index+2>=s.length()) {
//				return true;
//			}
//			else if(s.charAt(index+2)=='a') {
//				return checkAB(s,index+2);
//			}
//			else return false;
//		}
		
		
		
	}
	
	public static boolean helper(String s) {
		if(s.charAt(0)!='a') {
			return false;
		}
		return checkAB(s,0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(helper("abba"));
		String temp="abba";
		System.out.println(temp.substring(1,3).charAt(0)=='b' &&  temp.substring(1,3).charAt(1)=='b');
	}

}
