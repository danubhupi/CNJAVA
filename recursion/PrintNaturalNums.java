package recursion;

public class PrintNaturalNums {
	
	public static void PrintNums(int end,int start) {
		
		System.out.println(start);
		if(start==end) {
			return;
		}
		else PrintNums(end,start+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNums(10,1);

	}

}
