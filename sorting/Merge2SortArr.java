package sorting;

public class Merge2SortArr {
	
public static void print(int [] ar) {
		
		for(int i:ar) {
			System.out.println(i);
		}
		
	}


public  static int[] M2SA(int []ar1,int[]ar2) {
	int ar3[]=new int[ar1.length+ar2.length];
	int i=0,j=0,k=0;
	while(i<ar1.length && j<ar2.length) {
		if(ar1[i]<ar2[j]) {
			ar3[k]=ar1[i];
			i++;
		}
		else {
			ar3[k]=ar2[j];
		j++;
		}
		k++;
	}
	
	while(i<ar1.length) {
		ar3[k]=ar1[i];
		k++;
		i++;
	}
	
	while(j<ar2.length) {
		ar3[k]=ar2[j];
		k++;
		j++;
	}
	return ar3;
		
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1= {3,4,77,87,89};
		int[] ar2= {-2,-1,1,4,5,100};
		
		print(M2SA(ar1,ar2));

	}

}
