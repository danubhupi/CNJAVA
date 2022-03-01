package operatorAndFor;
import java.util.*;

public class Fibonacci {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a=1,b=1,c=0;
		for(int i=3;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		
		a=0;
		b=1;
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}

}
