import java.util.*;
class Main {
	
	public static int coinChange(int[] coin,int val,int index){
		//base case
		//if we overreach the denominations
		if(index>=coin.length){
			return 0;
		}
		//if value=0 then we have found a way
		if(coin[index]==val){
			return 1;
		}
		//if val <0 the =n incorrect path
		if(val<0){
			return 0;
		}
		
		
		//two choices
		//choose or skipcoin 
		// choose
		//two choices when choose
		//move ahead after choosing or dont
		int choose = coinChange(coin,val-coin[index],index);
		//skip coin
		int noChoose=coinChange(coin,val,index+1);
		return choose + noChoose;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int denominations[]=new int[count];
		for(int i=0;i<count;i++){
			denominations[i]=sc.nextInt();
			
		}
		int value=sc.nextInt();
		System.out.println(coinChange(denominations,value,0));
	}
}
