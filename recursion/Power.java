package recursion;

public class Power {
	
	public static int Pow(int n,int exp) {
		if(exp<0) {return -1;}
		if(exp==0) {return 1;}
		
		return n*Pow(n,exp-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pow(4,0));

	}

}
