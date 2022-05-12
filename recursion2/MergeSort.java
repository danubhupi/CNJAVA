package recursion2;
import java.util.*;

public class MergeSort {
	
	public static void mergeSort(int[]ar,int start,int end) {
		if(start==end) {
			return;
		}
		int mid=(start+end)/2;
		mergeSort(ar,start,mid);
		mergeSort(ar,mid+1,end);
		merge(ar,start,mid,end);
		
	}
	
	public static void merge(int[]ar,int start,int mid,int end) {
		
		
		int ar3[]=new int[end-start+1];
		int i=start,j=mid+1,k=0;
		while(i<mid+1 && j<end+1) {
			if(ar[i]<ar[j]) {
				ar3[k]=ar[i];
				i++;
			}
			else {
				ar3[k]=ar[j];
			j++;
			}
			k++;
		}
		
		while(i<mid+1) {
			ar3[k]=ar[i];
			k++;
			i++;
		}
		
		while(j<end+1) {
			ar3[k]=ar[j];
			k++;
			j++;
		}
		
		for(int q=0;q+start<=end;q++) {
			ar[q+start]=ar3[q];
			
		}
		
	}
	
	public static void print(int []ar) {
		for(int i:ar) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
		 ar[i]=sc.nextInt();
		}
		
		
		mergeSort(ar,0,n-1);
		print(ar);

		sc.close();
	}

}
