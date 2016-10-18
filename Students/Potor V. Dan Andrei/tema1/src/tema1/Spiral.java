package tema1;

public class Spiral {
	static boolean prime(int n){
		if(n<2)
			return false;
		else{
			for(int i = 2; i<=Math.sqrt(n); i++){
				if(n%i == 0)
					return false;
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		int n = 1, i = 3, inc = 2;
		int primes = 0, nonPrimes = 0;
		while(primes>=nonPrimes/10){
			if(prime(i)){
				primes++;
				System.out.println(i);
			}				
			else
				nonPrimes++;
			if(n<4)
				n++;
			else
			{
				n = 1;
				inc += 2;
			}
			i+=inc;		
		}
		System.out.println(inc+1);
	}
}
