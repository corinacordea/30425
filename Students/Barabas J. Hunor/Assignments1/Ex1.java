// Assignment 1.1- Sum of multiplies

import java.util.Scanner;

public class L1Ex1 {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int sum = 0, num;
		
		System.out.println("Enter a number:");
		num = inp.nextInt();
		
		for(int counter =0; counter<num; ++counter ){
			if(counter % 3 == 0 || counter % 5 == 0){
				sum += counter;
			}
		}
		
		System.out.println("The sum of multiplies of 3 or 5 below the entered number = " + sum);

	}
}

