package searching;

public class BinarySearch {
	
	public static int BS(int [] ar,int x) {
		
		int s=0,e=ar.length-1,mid;
		
		while(s<=e) {
			mid=(s+e)/2;
			if(ar[mid]==x) {
				return mid;
			}
			else if(ar[mid]>x) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
//			System.out.println("h");
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		
		int [] ar= {1,2,3,4,5,6};
		
		System.out.println(BS(ar,5));
		
		

	}

}
