package lab01;

import java.util.*;

public class FibonaciiEvenSum {
	public static void main(String[] args){
		int number;
		
		Scanner scanner = new Scanner(System.in); // input from keyboard
		System.out.println("Enter a number");
		number = scanner.nextInt(); 
		
		FibonaciiClass fibo = new FibonaciiClass();
		System.out.println(fibo.thirdFibo(number));
		scanner.close();
	}
}
