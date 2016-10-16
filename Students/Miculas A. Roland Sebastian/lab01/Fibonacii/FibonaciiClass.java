package lab01;

import java.math.*;

public class FibonaciiClass {
	int a00= 1,b00 = 1;
	int a01= 1,b01 = 1;
	int a10= 1,b10 = 1;
	int a11= 1,b11 = 0;
	
	public int FirstFibo(int argument){ // first fibo method using classic recursive
		if(argument == 1)
			return 1; // if the number is 0 or 1 then return the value
		else if(argument == 0)
			return 0;
		else return FirstFibo(argument-1) + FirstFibo(argument-2); // return the sum of previous 2 numbers
	}
	
	public int SecondFibo(int argument){ //O(n) complexity, trying out the matrix version of the fibo function
		
		for(int index = 2;index < argument;index ++){ // starting from 2 since we consider a00 = 1 the second element
			a00 = b00 * 1 + b01 * 1;
			a01 = b00 * 1 + b11 * 0 ;
			a10 = b10 * 1 + b11 * 1;
			a11 = b10 * 1 + b11 * 0;
			
			b00 = a00;
			b01 = a01;
			b10 = a10;
			b11 = a11;
		}
		return a00;
	}
	
	public int ThirdFibo(int argument){ // O(log(n)) same as second but FOR function goes to sqrt(n)
		int condition = 1;
		while(condition <= Math.sqrt(argument)){ // going up until half but by multiplying the matrix with itself
			a00 = b00 * b00 + b01 * b10;
			a01 = b00 * b01 + b01 * b11 ;
			a10 = b10 * b00 + b11 *	 b10;
			a11 = b10 * b01 + b11 * b11;
			
			b00 = a00;
			b01 = a01;
			b10 = a10;
			b11 = a11;
			condition *= 2;
		}
		while(condition < argument-1){ // add whatever its left 
			a00 = b00 * 1 + b01 * 1;
			a01 = b00 * 1 + b11 * 0 ;
			a10 = b10 * 1 + b11 * 1;
			a11 = b10 * 1 + b11 * 0;
			
			b00 = a00;
			b01 = a01;
			b10 = a10;
			b11 = a11;
			condition++;
		}
		return a00;
		
	}
}

/*b00 b01 b00 b01
 * b10 b11 b10 b11
 * 1 1 1 1
 * 1 0 1 0 
 * 2 1 2 1
 * 1 1 1 1
 * 5 3 
 * 3 2 
 * 34 21
 * 21 13*/
