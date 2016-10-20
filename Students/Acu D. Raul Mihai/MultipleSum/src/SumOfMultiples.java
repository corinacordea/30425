
public class SumOfMultiples{

	public SumOfMultiples(){
	}
		public void getSum(int n){
		int i,sum=0;
			for(i=0;i<n;i++){
				if((i%3==0) || (i%5==0))
					sum=sum+i;
			}
		System.out.println("The sum of multiples of 3 and 5 lower than " + n + " is: "+ sum);
		}
}