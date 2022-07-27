package recursion3;

import java.util.Scanner;

public class Knapsack01 {
	
	public static int knapsack(int[] val,int weight[],int weightLeft, int index) {
		//if all elements have been worked on then return
		if(index>=val.length) {
			return 0;
		}
		// check if element can be added to sack or not
		if(weightLeft-weight[index]<0) {
			//if not
			//skip ahead to next element
			return knapsack(val,weight,weightLeft,index+1);
		}
		else {
			//if it can be added
			//two choices
			//we add it
			//then value of the sack will increase and weightLeft will decrease
			int added=val[index]+ knapsack(val,weight,weightLeft-weight[index],index+1);
			//if we do not add it then value and weight left wont change
			int notAdded=knapsack(val,weight,weightLeft,index+1);
			return Math.max(added,notAdded);
		}
		
	}
	public static void takeInput(int ar[],int n,Scanner sc) {
//		Scanner temp=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// number of elements
		int n=sc.nextInt();
		// array containing value of each element
		int val[]=new int[n];
		//array containing weight of each elemnnt
		int weight[]=new int[n];
		//reusing function to take input
		takeInput(weight,n,sc);
		takeInput(val,n,sc);
		// total weight that can be carried by the thieve
		int weightLeft=sc.nextInt();
		// Max value that can be fir into sack
		System.out.println(knapsack(val,weight,weightLeft,0));
		sc.close();

	}

}
