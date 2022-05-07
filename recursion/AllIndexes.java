import java.util.*;
class Main {  

  public static void allIndexes(int[] ar,List<Integer> ans,int target,int index){

    if(ar[index]==target){
      ans.add(index);
    }
    if(index==ar.length-1){
      return;
    }
     allIndexes(ar,ans,target,index+1);
    
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
    List<Integer> ans=new ArrayList<Integer>();
    allIndexes(ar,ans,target,0);

    for(int i:ans){
      System.out.println(i);
    }
  } 
}
