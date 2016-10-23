package lab01;

import java.util.*; // importing the standart input

public class SumOfMultiples {
	public static void main(String[] args){
		int sum = 0;
		int number;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number");
		number = scanner.nextInt(); // getting the user input
		for(int index = 0 ; index< number ;index++){
			if(index % 3 == 0 || index % 5 == 0 ){ // checking if the number is divisible with 3 or 5 
				sum += index;  // adding the number to the sum
			}
		}
		System.out.println(sum); // printing out the sum
	}	
}
