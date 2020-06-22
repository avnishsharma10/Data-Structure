//Get element from an array in java


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
            
            int index = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.getByIndex(input, n, index));
            
        }
    }
}



class Get
{
    public static int getByIndex(int arr[], int n, int i)
    {
        if(i<n-1)
         return arr[i];
        else
        return -1;

    }
}