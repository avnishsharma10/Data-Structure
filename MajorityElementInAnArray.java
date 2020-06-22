//Majority element in an array

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Majority().majorityElement(arr, n)); 
        }
    }
}

class Majority
{
    static int majorityElement(int arr[], int size)
    {
        // your code here
        Arrays.sort(arr);
        int max=1;
        int curr=1;
        int ans=-1;
        int res=-1;
        for(int i=1;i<size;i++)
        {
            if(arr[i]==arr[i-1])
            {
                curr++;
            }
            else
            {
                if(curr>max)
                {
                    max=curr;
                    ans=arr[i-1];
                }
                curr=1;
            }
        }
        if(curr>max)
        {
            max=curr;
            ans=arr[size-1];
        }
        if(max>(size/2)&& size>1)
        {
            res=ans;
        }
        if(size==1) res=arr[0];
        return res;
    }
}