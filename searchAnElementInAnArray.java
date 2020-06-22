//Search an element in an array in java
import java.util.*;
import java.io.*;
import java.lang.*;

class Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int sizeOfArray = Integer.parseInt(read.readLine());
            int arr[] = new int[sizeOfArray];
            
            String st[] = read.readLine().trim().split("\\s+");
            for(int i = 0; i < sizeOfArray; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            int x = Integer.parseInt(read.readLine());
            
            Searching obj = new Searching();
            
            System.out.println(obj.search(arr, sizeOfArray, x));
        }
    }



class Searching{
        
    static int search(int arr[], int n, int x)
    {
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                ans=i;
                break;
            }
        }
        return ans;
        
    }
    
}
