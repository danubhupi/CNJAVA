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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		 System.out.println(removeDup(s,'\n'));
		 sc.close();

	}

}
