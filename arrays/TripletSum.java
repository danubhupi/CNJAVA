package arrays;
import java.util.*;

public class TripletSum {
	
	public static int     findTriplets (int [] ar,int k) {
		int res=0;
		Arrays.sort(ar);
		
		for(int i=0;i<ar.length-2;i++) {
			int x=k-ar[i];
			int l=i+1;
			int h=ar.length-1;
			while(l<h) {
				if(ar[l]+ar[h]==x) {
					res++;
					l++;
				}
				else if(ar[l]+ar[h]>x) {
					h--;
				}
				else {
					l++;
				}
				
			}
		}
	
				return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
		 ar[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		
		int res=findTriplets(ar,k);
		
		System.out.println(res);
		
		
	}

}
