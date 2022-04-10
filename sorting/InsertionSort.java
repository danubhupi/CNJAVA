package sorting;

public class InsertionSort {
	
	public static void IS(int[] ar) {
		
int pos;
		
		
		for(int i=1;i<ar.length;i++) {
			pos=i;
			while( (pos-1>=0 && ar[i]<ar[pos-1]) )
			{
				pos--;
				}

			int temp1=ar[i];
			for(int j=i;j>=pos && j>0;j--) {
				ar[j]=ar[j-1];
			
				
			}
			
			ar[pos]=temp1;
			

		}
		
	}
	
		public static void print(int [] ar) {
			
			for(int i:ar) {
				System.out.println(i);
			}
			
		}

	public static void main(String[] args) {
		
		
		int []ar= {9,7,6,10,11,3,0,12,11,-0};
		
		IS(ar);
		print(ar);
		
		
		

	}

}
