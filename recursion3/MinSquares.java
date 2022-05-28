package recursion3;

public class MinSquares {
	
	
	public static int helper(double target,int num,int cur,double initial) {
//		System.out.println(target);
		if(num>=initial/2) {
			return Integer.MAX_VALUE-10;
			
		}
		if(target==0) {
			return cur;
		}
		if(target<0) {
			return Integer.MAX_VALUE-10;
		}
//		if(target/2<=num) {
//			return Integer.MAX_VALUE-10;
//			
//		}
		
		return  Math.min(  helper(target-Math.pow(num, num),num+1,cur+1,initial), Math.min(helper(target,num+1,cur,initial),helper(target-Math.pow(num, num),num,cur+1,initial)));
	}
	
	public static int minSquares(double target) {
		return helper(target,1,0,target);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minSquares(10));

	}

}
