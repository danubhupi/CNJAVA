package operatorAndFor;
import java.util.*;

public class BiToDeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,pow=1,binary=0;
		
		while(temp>0) {
			int num=temp%10;
			binary+=num*pow;
			temp=temp/10;
			pow*=2;
			
		}
		
		System.out.println(binary);

	}

}
