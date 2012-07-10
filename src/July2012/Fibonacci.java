package July2012;

import java.util.ArrayList;

public class Fibonacci {


	public Integer zero = new Integer(0);
	public Integer one = new Integer(1);
	public int c;
	public ArrayList<Integer> fibCache = new ArrayList<Integer>();
	
	public Fibonacci()
	{
		fibCache.add(zero);
		fibCache.add(one);
		fibCache.add(one);
	}

	 public Integer fib(int n) 
	 {
		if(n<2)
			return new Integer(n);
		else
			if (n >= fibCache.size())
				fibCache.add(n, fib(n-1) +(fib(n-2)));
		return fibCache.get(n);
	 }
	 
	 public int i = 1;
	 
	 public int lessthan(int n){
		 while(c< n)	
		 {
			 c = fib(i).intValue();
			 if(c < n)
				 i+=1;
		 }	
		 return c;
	 }
	
}
