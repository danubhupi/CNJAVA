package operatorAndFor;

import java.util.*;

public class SqrtInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1;
		while(i<=n/2 && i*i <n) {
			i++;
		}
		if(i*i!=n) {
			System.out.println(i-1);
		}
		else {
			System.out.println(i);
		}

	}

}
