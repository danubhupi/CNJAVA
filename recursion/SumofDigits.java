package recursion;

public class SumofDigits {
	
	public static int sod(int n) {
		if(n<0) {
			n*=-1;
		}
		if(n==0) {return 0;}
		return n%10 + sod(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sod(230));

	}

}
