package recursion3;





public class MinSqr {
	
	public static int minSqr(int num) {
		
		if(num==0) {
			return 0;
		}
		
		int step=Integer.MAX_VALUE;
		
		for(int i=1;i*i<=num;i++) {
			step=Math.min(step, minSqr(num-i*i));
		}
		
		
		return step+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minSqr(9));
	}

}
