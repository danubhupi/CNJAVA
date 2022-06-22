package recursion3;

import java.util.Scanner;

public class CoinTower {
	
	public static String coinT(int n, char c,int x,int y) {
		if(n<0) {
			return "";
		}
		if(n==0) {
			return ""+c;
		}
		if(c=='b') {
			return coinT(n-1,'w',x,y)+coinT(n-x,'w',x,y)+coinT(n-y,'w',x,y);
		}
		else
			return coinT(n-1,'b',x,y)+coinT(n-x,'b',x,y)+coinT(n-y,'b',x,y);
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(coinT(n-1,'b',x,y)+coinT(n-x,'b',x,y)+coinT(n-y,'b',x,y));
		System.out.println('w'&'b');
		System.out.println((char)(1));

	}

}
