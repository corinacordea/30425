// naive method: O(2^n)

// This method doesn't work for large values of n, it takes too long to run.
// So I test it on a small value of n.

public class FibonacciSum {
	
	/* 
	   In Java:
	     the integer is 32 bits and range is 
	       from -2,147,483,648 to 2,147,483,647
	   
	     long integer is 64 bits and range is
	       from -9,223,372,036,854,775,807 to -9,223,372,036,854,775,807
	*/
	
	public static final int N = 10;
	
	public static int Fibonacci(int n) {
		if(n <= 1)
			return n;
		return Fibonacci(n-1) + Fibonacci(n-2);
	}

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < N; i++)
			if(Fibonacci(i) % 2 == 0)
				sum = sum + Fibonacci(i);
		
		System.out.println("The Fibonacci Even Sum is: "+sum);
	}

}
