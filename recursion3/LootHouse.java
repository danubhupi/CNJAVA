import java.util.*;

class Main {  

  public static int helper(int[]ar,int index,boolean flag){
    if(index>=ar.length){
      return 0;
    }
    
    if(flag==true){
      return helper(ar,index+1,false);
    }
    else{
      return Math.max(ar[index]+helper(ar,index+1,true),helper(ar,index+1,false));
    }


    
  }

  public static int lootH(int[]ar){
    return Math.max(ar[0]+helper(ar,1,true),helper(ar,1,false));
  }

  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++){
      ar[i]=sc.nextInt();
    }
    System.out.println(lootH(ar));
  } 
}
