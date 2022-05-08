import java.util.*;
class Main {  

  public static int mult(int num,int num2,int total){
    if(num2==0){
      return total;
    }
    if(num2>0){
    total=total+num;
    return mult(num,num2-1,total);
    }
    if(num2<0){
      total=total-num;
      return mult(num,num2+1,total);
    }
    return 0;
}   

  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println(mult(num1,num2,0));
  } 
}
