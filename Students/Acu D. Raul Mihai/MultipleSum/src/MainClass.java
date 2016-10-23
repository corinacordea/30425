import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SumOfMultiples sumofMultiples = new SumOfMultiples();
		System.out.println("n = ?");
		int n = input.nextInt();
		System.out.println("Output table:");
		sumofMultiples.getSum(n);
	}

}