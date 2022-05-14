// { Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }// } Driver Code Ends


class Solution

{
    
     public static void swap(int[]ar,int i,int j){
    int temp=ar[i];
    ar[i]=ar[j];
    ar[j]=temp;
  }
  
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int ar[], int si, int ei)
    {
        // code here
        
        
          if(si>=ei)return;
    int pp=partition(ar,si,ei);
    quickSort(ar,si,pp-1);
    quickSort(ar,pp+1,ei);
    
    }
    static int partition(int ar[], int si, int ei)
    {
        // your code here
         int pivot=ar[si],count=0;
    for(int i=si+1;i<=ei;i++){
      if(ar[i]<=pivot){
        count++;
      }
    }
    swap(ar,si,count+si);
    int i=si,j=ei;

    while(i<j){
      if(ar[i]>pivot && ar[j]<= pivot){
        swap(ar,i,j);
      }
      if(ar[i]<=pivot)i++;
      if(ar[j]>pivot)j--;
    }
    return count+si;
    } 
}
