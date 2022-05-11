package recursion2;
import java.util.*;

public class RemoveDuplicates {
	
	public static String removeDup(String s,char prev) {
		if(s=="") {
			return "";
		}
		String temp;
		if(s.charAt(0)==prev) {
			temp="";
			}
		else temp=""+s.charAt(0);
		
		return temp + removeDup(s.substring(1),s.charAt(0));
		
	}
	
	
	public static String removeDupBetter(String s) {
		if(s.length()<=1) {
			return s;
		}
		
		if(s.charAt(0)==s.charAt(1)) {
			return removeDupBetter(s.substring(1));
		}
		else
			return s.charAt(0)+ removeDupBetter(s.substring(1));
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		 System.out.println(removeDup(s,'\n'));
		System.out.println(removeDupBetter(s));
		 sc.close();

	}

}
