/**
 * 
 * @author Yoga
 *
 */
public class Fibonacci {
	/**
	 * 
	 */
	public static void main (String args[]) {
		// TODO Auto-generated constructor stub
		int a, b, fib;
		a = 0;
		b = 1;
		int sum=0;
		for (int i = a; i < 100000; i ++){
			fib=a+b;
			if (fib>4000000){
				break;
			}
			if(fib%2 == 0){
				sum+=fib;
			}
			System.out.print(fib + " ");
			a=b;
			b=fib;
		}
		System.out.print("\nSum of even numbers is "+sum);
	}

}