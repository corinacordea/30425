
public class Palindrome {
	public static void main(String args[]){
		
		int mul=0;
		int reverse;
		for (int i=9999; i>1000; i--){
			for (int k=9999; k>1000; k--){
				mul = i*k;
				int rMul = mul;
				reverse=0;
				while( rMul != 0){
					reverse = reverse*10;
					reverse = reverse+rMul%10;
					rMul = rMul/10;
				}
				if (mul==reverse){
					System.out.print("Palindrome:"+mul);
					return;
				}

			}

		}

	}

}
