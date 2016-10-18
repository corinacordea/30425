package tema1;

public class Palindrome {
	
	static boolean isPalindrome(int n){
		int m = n, m2 = 0;
		while(m != 0){
			m2 = m2 *10 + m %10;
			m = m/10;
		}
		if(m2 == n)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int n = 999*999;
		while(isPalindrome(n)==false)
			n--;
		System.out.println(n);
	}
	/*  4 digit
	    n = 9999*9999;
		while(isPalindrome(n)==false)
			n--;
		System.out.println(n);
	 */
}
