package sorting;

public class BubbleSort {
	
	
	public static void swap(int [] ar,int  i ,int j) {
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	
	public static void BS(int [] ar) {
		
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					swap(ar,j,j+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ar= {-3,10,-1,7,4,5,1,3,0,-19,66};
		BS(ar);
		for(int i:ar) {
			System.out.println(i);
		}

	}

}
