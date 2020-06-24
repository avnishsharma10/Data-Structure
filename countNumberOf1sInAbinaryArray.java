// count number of 1's in a binary array
import java.io.*;
import java.util.*;
import java.lang.*;

class Arrays {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		   
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Ones obj = new Ones();
		    System.out.println(obj.countOnes(arr, n));
		    
		    
		}
		
	}
}// } Driver Code Ends


//User function Template for Java

class Ones{
   
    public static int countOnes(int arr[], int n){
        
   
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==1)
        count++;
        //System.out.println(count);
    }
    return count;
        
    }
    
}

