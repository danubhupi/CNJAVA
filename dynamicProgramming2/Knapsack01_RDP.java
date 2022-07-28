package dynamicProgramming2;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack01_RDP {

	public static int knapsack(int[] val,int weight[],int weightLeft, int index,int dp[]) {
		//if all elements have been worked on then return
		if(index>=val.length) {
			return 0;
		}
		// check if element can be added to sack or not
		if(weightLeft-weight[index]<0) {
			//if not
			//skip ahead to next element
			if(dp[weightLeft]!=-1) {
				return dp[weightLeft];
			}
			dp[weightLeft]= knapsack(val,weight,weightLeft,index+1,dp);
			return dp[weightLeft];
		}
		else {
			int added,notAdded;
			//if it can be added
			//two choices
			//we add it
			//then value of the sack will increase and weightLeft will decrease
			if(dp[weightLeft-weight[index]]!=-1) {
				added=val[index]+dp[weightLeft-weight[index]];
			}
			else {
            added= val[index]+ knapsack(val,weight,weightLeft-weight[index],index+1,dp);
			}
			//if we do not add it then value and weight left wont change
			 notAdded=knapsack(val,weight,weightLeft,index+1,dp);
			
			dp[weightLeft]= Math.max(added,notAdded);
			return dp[weightLeft];
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
		//arrays that stores max value at any given weight
		int[] dp=new int[weightLeft+1];
		Arrays.fill(dp, -1);
		// Max value that can be fir into sack
		System.out.println("\n"+knapsack(val,weight,weightLeft,0,dp));
		
//		for(int i:dp) {
//			System.out.println(i);
//		}
		
		

	}

}
