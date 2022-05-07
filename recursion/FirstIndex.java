import java.util.*;

class Main {  

  private static int fi(int []ar,int target,int index ){
    if(ar[index]==target){
      return index;
    }
    if(index==ar.length-1){
      return -1;
    }

    return fi(ar,target,index+1);
  }

  public static int fi(int []ar,int target){
    return fi(ar,target,0);
  }


  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]ar=new int[n];
    for(int i=0;i<n;i++){
      ar[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    System.out.println(fi(ar,target));
  } 
}
