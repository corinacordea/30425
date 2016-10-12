package palindrome;

public class LargestPalindrome {
	 public static void main (String[] args){
		 int result=0;	
		 int max=0;
		 for(int i=999;i>=100;i--){
			 for(int j=999; j>=100; j--){
				 int temp;
				 result = i*j;
				 temp = result;
				 int reverse= 0;
				 int lastDigit;
				 while(temp>0){
					 
					 lastDigit = temp%10;
					 reverse=reverse*10+lastDigit;
					 temp=temp/10;
					  
				 }
				 if(result==reverse && result>max)
					 max=result;
			 }	
					
		 }
		 System.out.println("Your number is:" +max);
	 }

}

