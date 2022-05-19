package recursion3;

public class BinarySearch {
	public static int BS(int [] ar,int low,int high,int target) {
		if(low>high) {
			return -1;
		}
		int mid=(low+high)/2;
		if(ar[mid]==target) {
			return mid;
		}
		if(ar[mid]<target) {
			return BS(ar,mid+1,high,target);
		}
		else return BS(ar,low,mid-1,target);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ar= {1,2,4,76,89,456};
		System.out.println(BS(ar,0,ar.length-1,2));

	}

}
