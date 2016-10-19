
class SumOfMultiples {

	public SumOfMultiples() {
	
		/*int[] anArray = new int[1000];
		for (int k = 0; k < 1000; k ++) {
			anArray[k] = k;
		}*/

		int sum = 0;
		for (int i = 0; i < 1000; i++) {	
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + ", ");
				sum=+i;
			}
		}
		System.out.print("\nSum is "+sum);
	}
	
	public static void main(String[] args) {
		SumOfMultiples sumOfMultiples = new SumOfMultiples();
	}
}




/*
 //Twist 1
 
  import java.util.Scanner;
  public class SumOfMultiples {
	  public static void main(String args[]){
		  Scanner number = new Scanner(System.in);
			
			int n;
			int sum = 0;
			System.out.println("Enter a number:");
			n= number.nextInt();
			for (int i = 0; i < n; i++) {	
				if (i%3 == 0 || i%5 == 0) {
					System.out.print(i + ", ");
					sum += i;
				}
			}
			System.out.print("\nSum is "+sum);
	  }
}*/