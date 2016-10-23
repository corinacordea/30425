package tema1;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		long sum = 3;
		while((a<=4000000)&&(b<=4000000)){
			if(a<b){
				a = a + b;
				if(a%2 == 0)
					sum += a;
			}
				
			else{
				b = a + b;	
				if(b%2 == 0)
					sum += b;
			}		
		}
		System.out.println(sum);
	}
}
