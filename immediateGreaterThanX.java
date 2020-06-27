//Immediate greater than X


import java.util.*;
import java.io.*;
import java.lang.*;


class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            int x = Integer.parseInt(read.readLine());    
            System.out.println(new Greater().immediateGreater(arr, n, x));
        }
    }
}

class Greater
{
    public static int immediateGreater(int arr[], int n, int x)
    {
        
        Arrays.sort(arr);
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>x)
            {
                ans=arr[i];
                break;
            }
        }
        return ans;
    }
}