import java.util.*;
import java.lang.*;

class Main {  


  public static int num0(int num,int total){
    if(Math.abs(num)<10){
      if(num==0){total++;}
      return total;
    }
    if(num%10==0){
      total++;
    }
    return num0(num/10,total);
  }
  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
     Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    System.out.println(num0(num1,0));
    
  } 
}
