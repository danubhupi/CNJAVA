import java.util.*;
class Main {  

  public static boolean isPresent(int[] ar,int index,int num){
    if(ar[index]==num)
      return true;
    if(index==ar.length-1)
      return false;
    return isPresent(ar,index+1,num);
  }

  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++){
      ar[i]=sc.nextInt();
      
    }
    int num=sc.nextInt();
    System.out.println(isPresent(ar,0,num));
  } 
}
