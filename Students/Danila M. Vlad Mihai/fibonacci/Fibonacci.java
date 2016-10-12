package fibonacci;

public class Fibonacci {
	 public static void main (String[] args){
		 int sum=2;
		 int[] array = new int[1234567];// how can i get rid of this number????
		 array[0] = 1;
		 array[1] = 2;
		 for (int i = 2; ; i++) {
		        array[i] = array[i - 1] + array[i - 2];
		        if(array[i] > 4000000) break;
		        if(array[i] % 2 == 0)
		        	sum+=array[i];
		 }
		 System.out.println("Your sum is:" +sum);
	   
		
	 }
}
