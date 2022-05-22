package recursion3;

public class MinStepTo1 {
	
	public static int min(int n) {
		if(n==1) {
			return 0;
		}
		if(n<1) {
			return Integer.MAX_VALUE;
		}
		
		if(n%2==0) {
			return Math.min(1+min(n-1),min(n/2)+1);
		}
		
		else if(n%3==0) {
		return Math.min(1+min(n-1),1+min(n/3));
		}
		else
			return 1+min(n-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min(7));

	}

}
