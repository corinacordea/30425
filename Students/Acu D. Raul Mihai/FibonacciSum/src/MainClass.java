import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int next=0,first=0,second=1;
		long sum=0;
		System.out.println("n=");
		int n=scan.nextInt();
		System.out.println("Output table:");
		while(next<n)
		   {
			   if(next%2==0){
			        sum=sum+next;
			        System.out.println(next);
			   }
			    next = first + second;
		        first = second;
		        second = next;
		     // System.out.println(next);
		   
		   }
		System.out.println("Sum of even numbers: " + sum);
	}
}