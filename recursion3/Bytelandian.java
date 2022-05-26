import java.util.*;

class Main {  


  public static int bl(int n){

    if(n==0){
      return 0;
    }
    
    return Math.max(n,bl(n/2)+bl(n/3)+bl(n/4));
  }
  

  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
    System.out.println(bl(2));
  } 
}
