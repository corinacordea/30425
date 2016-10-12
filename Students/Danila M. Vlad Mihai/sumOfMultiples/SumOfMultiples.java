package sumOfMultiples;
import java.util.*;

public class SumOfMultiples {


    public static void main(String[] args) {
    	Scanner maxNumber = new Scanner(System.in);
    	System.out.println("You want numbers smaller than:");
    	int n = maxNumber.nextInt();
        int sum=0;
        for(int count=0;count<n;count++){
        	if(count%3==0 || count%5==0)
        		sum+=count;
        }


        System.out.println("The sum is: " +sum);

    }

}