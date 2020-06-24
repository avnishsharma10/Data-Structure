//count smaller than x in an array
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
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Integer.parseInt(str[i]);
            }
            
            int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.smallerThanX(input, n, x));
            
        }
    }
} 



class Get
{
    public static int smallerThanX(int arr[], int n, int x)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<x)
            count++;
        }
        return count;
    }
}