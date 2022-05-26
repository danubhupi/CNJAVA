import java.util.*;

class Main {  


  public static int bl(int n,int dp[]){

    if(n==0){
      return 0;
    }
    int two,three,four;
    if(dp[n/2]==-1){
      two=bl(n/2,dp);
      dp[n/2]=two;
      
    }else{
      two=dp[n/2];
    }

    if(dp[n/3]==-1){
      three=bl(n/3,dp);
      dp[n/3]=three;
      
    }else{
      three=dp[n/3];
    }

    if(dp[n/4]==-1){
      four=bl(n/4,dp);
      dp[n/4]=four;
      
    }else{
      four=dp[n/4];
    }
    
    
    return Math.max(n,two+three+four);
  }
  

  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n+1];
    for(int i=0;i<n+1;i++){
      ar[i]=-1;
    }
    System.out.println(bl(n,ar));
  } 
}
