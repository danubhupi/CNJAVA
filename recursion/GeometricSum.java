import java.util.*;
import java.lang.*;

class Main {  

  public static double geoSum(int k){
    if(k==0){
      return 1;
    }
    return (1/Math.pow(2,k)) + geoSum(k-1);
  }


  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    System.out.println(geoSum(k));
  } 
}
