package recursion;

public class AddNaturalNums {
	
	
	public static int ANN(int n) {
		if(n<=0)return 0;
		if(n==1)return 1;
		
		return n+ANN(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ANN(5));

	}

}
