//Sum of elements of a LinkedList


import java.util.*;
import java.io.*;
import java.lang.*;


class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}


class Driver
{
    public static Node insertNode(Node head, int x)
    {
        Node node = new Node(x);
        if(head == null)
            return new Node(x);
            
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = node;
        
        return head;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            System.out.println(new Get().sumOfElements(head));
        }
    }
    
}


class Get
{
    public static int sumOfElements(Node head)
    {
        Node curr=head;
        int sum =0;
        while(curr!=null)
        {
            sum+=curr.data;
            curr=curr.next;
        }
        return sum;
    }
}
