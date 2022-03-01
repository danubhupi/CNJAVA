package operatorAndFor;
import java.util.*;
public class DecToBi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int temp=n,dec=0,pow=1;
		
		while(temp>0) {
			dec+=(temp%2)*pow;
			temp=temp/2;
			pow*=10;
		}
		System.out.println(dec);

	}

}
