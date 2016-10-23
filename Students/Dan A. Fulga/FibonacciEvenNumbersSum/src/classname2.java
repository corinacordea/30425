
public class classname2 {
	public static int Fibonacci(int nr) {
		int nr1, nr2;
		nr1=1;
		nr2=2;
		int sum=0;
		int aux=0;
		int i;
		nr=4000000; //im not sure that's ok
		
		for(i=1;i<=nr;i++) {
			aux=nr1+nr2;
			nr1=nr2;
			nr2=aux;
			if ( aux%2==0) {
				sum=sum+aux;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(100));
	}

}
