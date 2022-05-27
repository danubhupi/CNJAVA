import java.util.*;

class Main {  

  public static int maxLoot(int n,int[] houseMoney){
    if(n==0){
      return 0;
    }
    if(n==1){
      return houseMoney[0];
    }

    int[] maxMTill=new int[n];
    maxMTill[0]=houseMoney[0];
    maxMTill[1]=Math.max(houseMoney[0],houseMoney[1]);
    for(int i=2;i<n;i++){
      maxMTill[i]=Math.max(maxMTill[i-1],houseMoney[i]+maxMTill[i-2]);
    }

    return maxMTill[n-1];
  }

  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++){
      ar[i]=sc.nextInt();
    }
    System.out.println(maxLoot(n,ar));
  } 
}
