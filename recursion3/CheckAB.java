package recursion3;

public class CheckAB {
	
	public static boolean checkAB(String s,int index) {
//		
		
		if(index>=s.length()) {return true;}
		
		if(s.charAt(index)=='a') 
		{
			if(index+1>=s.length()) {
				
				return true;
			}
			else if(s.charAt(index+1)=='a') {
				
				return checkAB(s,index+1);
			}
			else if(s.substring(1,3).charAt(0)=='b' &&  s.substring(1,3).charAt(1)=='b') {
				
				return checkAB(s,index+3);
			}
			else {
//		
				return false;}
		}
	
		
		
		if(s.substring(index,index+2)=="bb") {
			if(index+2>=s.length()) {
				return true;
			}
			else if(s.charAt(index+2)=='a') {
				return checkAB(s,index+2);
			}
			else return false;
		}
		
		return false;
		
		
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
		
	}

}
