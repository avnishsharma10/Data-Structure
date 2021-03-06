// implementation of a Queue using 2 stacks
import java.util.*;
import java.util.Stack;
import java.util.LinkedList;



class GfG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			StackQueue g = new StackQueue();
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryTyoe = sc.nextInt();
				if(QueryTyoe == 1)
				{
					int a = sc.nextInt();
					g.insert(a);
				}else
				if(QueryTyoe == 2)
				System.out.print(g.remove()+" ");
			q--;
				
			}
			System.out.println();
		t--;
		}
	}
}



class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void insert(int B)
    {
	   // Your code here
	   while(!s2.isEmpty()){
	       s1.add(s2.pop());
	   }
	   s1.add(B);
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int remove()
    {
        while(!s1.isEmpty())
        {
            s2.add(s1.pop());
        }
       if(s2.isEmpty()) return -1;
       return s2.pop();
    }
}
