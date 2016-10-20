

public class Sum {
	public static final int MAX = 1000;
	
	public Sum() {
		int sum;
		sum = 0;
		for(int i = 1; i < MAX; i++) {
			if(i%3 == 0 || i%5 == 0)
				sum = sum + i;
		}
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: \n"+sum);	
	}
	
	public Sum(int n) {
		int sum;
		sum = 0;
		for(int i = 1; i < n; i++) {
			if(i%3 == 0 || i%5 == 0)
				sum = sum + i;
		}
		System.out.println("The sum of all the multiples of 3 or 5 below inserted value is: \n"+sum);	
	}
}
