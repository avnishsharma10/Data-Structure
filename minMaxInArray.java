//Max and Min element in array


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
            
            //int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.maximumElement(input, n) + " " + obj.minimumElement(input, n));
            
        }
    }
}


class Get
{
    public static int maximumElement(int arr[],int n)
    {
      
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    
    public static int minimumElement(int arr[],int n)
    {
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
}

