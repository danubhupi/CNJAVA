package recursion;

public class NumOfDig {
	
	public static int NOD(int n) {
		if(n==0)return 0;
		
		return 1+ NOD(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NOD(99));

	}

}
