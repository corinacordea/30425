//Assignment 1.2 - Fibonacci even sum 

public class Ex2 {
	
	public static int FibCalc(int n) {
		
		int fib1 = 1, fib2 = 2, sum = 0, tfib = 0;
		
		while (fib1 < n){
			if (fib1 % 2 == 0){
				sum += fib1;
			}
			tfib = fib1;
			fib1 = fib2;
			fib2 = tfib + fib2;
		}
			return sum;
	}
		
	
	public static void main(String[] args) {
				
		System.out.println("The sum of even numbers of the Fibonacci sequence below 400000 is" + FibCalc(4000000));
		
	}
	
	
	
}