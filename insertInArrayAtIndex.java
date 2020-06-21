//Insert at an index in an Array

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
		    
		    int index=sc.nextInt();
		    int element=sc.nextInt();
		    
		    Insert obj=new Insert();
		    obj.insertAtIndex(arr,sizeOfArray,index,element);
		    
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
    
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        if(index==sizeOfArray-1)
        arr[index]=element;
        else
        for(int i=sizeOfArray-2;i>index-1;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        
    }


}