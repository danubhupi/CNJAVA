import java.util.*;

class Main {  


  public static int bl(int n){

    if(n==0){
      return 0;
    }
    int dp[]=new int[n+1];
    dp[0]=0;

    for(int i=1;i<n+1;i++){
      dp[i]=Math.max(i,dp[i/2]+dp[i/3]+dp[i/4]);
    }
    
    
    
    return dp[n];
  }
  

  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    System.out.println(bl(n));
  } 
}
