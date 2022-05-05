package recursion;
import java.util.*;

public class SumOfArray {
	
	public static int soa(int[] n,int index) {
		if(index==n.length-1) {
			return n[index];
		}
		
		return n[index]+ soa(n,index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt();
		int [] ar=new int[n];
		
		for(int i=0;i<n ;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println(soa(ar,0));
		sc.close();

	}

}
