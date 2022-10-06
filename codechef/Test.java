package codechef;
import java.util.*;

public class Test {
	public static void func(String s) {
	  int[]ar=new int[256];
	    Arrays.fill(ar,0);
	    for(int i=0;i<s.length();i++){
	    if((int)s.charAt(i)>=97) {
	      ar[s.charAt(i)-32]++;
	    }
	    	else {
	    	 ar[s.charAt(i)]++;
	    	}
	    }

	    for(int i=0;i<ar.length;i++){
	      if(ar[i]>0){
	    	  System.out.println((char)i+":"+ar[i]);
//	        System.out.println();
	        
	      }
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func("This is a test");

	}

}
