package recursion3;

public class Stairs {
	
	public static int stairs(int stairs) {
		if(stairs==0) {
			return 1;
		}
		if(stairs<0) {
			return 0;
		}
		
		return stairs(stairs-1)+stairs(stairs-2)+stairs(stairs-3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairs(5));

	}

}
