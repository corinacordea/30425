import java.util.Scanner;

public class Main {

	//private static Scanner in;

	public static void main(String[] args) {
		Sum sum = new Sum();
		
		System.out.printf("Enter the number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		Sum sum1 = new Sum(n);
	}

}