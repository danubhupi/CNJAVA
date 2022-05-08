import java.util.*;
import java.lang.*;

class Main {  

  public static boolean palinStr(String s,int l,int r){
    if(l>=r){
      return true;
    }
    if(s.charAt(l)==s.charAt(r)){
      return palinStr(s,l+1,r-1);
    }
    else
      return false;
  }



  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
    Scanner sc=new Scanner(System.in);
    String k=sc.nextLine();
    System.out.println(palinStr(k,0,k.length()-1));
  } 
}
