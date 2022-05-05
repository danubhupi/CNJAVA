package recursion;

public class Power {
	
//	public static int Pow(int n,int exp) {
//		if(exp<0) {return -1;}
//		if(exp==0) {return 1;}
//		
//		return n*Pow(n,exp-1);
//		
//	}
	
	public static int Pow(int x,int y) {
		if(x==0)return 0;
		if(y==0)return 1;
		
		int temp=Pow(x,y/2);
		if(y%2==0)return temp*temp;
		else return x*temp*temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pow(4,3));

	}

}
