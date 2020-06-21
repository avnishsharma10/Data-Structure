//Insert at end in an Array

import java.io.*;
import java.util.*;
class Array {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    
		    for(int i=0;i<sizeOfArray-1;i++)
		    {
		        int x;
		        x=sc.nextInt();
		        arr[i]=x;
		    }
		    
		    int element=sc.nextInt();
		    
		    Insert obj=new Insert();
		    
		    obj.insertAtEnd(arr,sizeOfArray,element);
		    
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        System.out.print(arr[i]+" ");
		        
		    }
		    
		    System.out.println();
		}
	}
}


class Insert
{
    
    public void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        arr[sizeOfArray-1]= element;
     
      
    }
}

