package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ar= {9,7,6,10,11,3};
		int pos;
		
		
		for(int i=1;i<ar.length;i++) {
			pos=i;
			while( (pos-1>=0 && ar[i]<ar[pos-1]) )
			{
				pos--;
				}
////			if(pos<0) {pos++;}
//			int temp1=ar[i],temp;
//			for(int j=pos;j<i;j++) {
//				temp=ar[j+1];
//				ar[j+1]=ar[j];
//				ar[j]=temp;
//				
//			}
//			
//			ar[pos]=temp1;
			
			System.out.println(pos);
		}
		
//		for(int i:ar) {
//			System.out.println(i);
//		}

	}

}
