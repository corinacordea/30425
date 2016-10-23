//Assignment 1.3- Largest palindrome

public class Ex3 {
	
	
	    public static void main(String[] args) {
	        int lpal = 0;
	        for(int i = 101; i <= 999; i++)
	        {
	            for(int j = i; j <= 999; j++)
	            {
	                int lpal1 = i * j;
	                StringBuilder s1 = new StringBuilder(""+ lpal1);
	                String s2 = ""+ lpal1;
	                s1.reverse();
	                if(s2.equals(s1.toString()) && lpal < lpal1) {
	                    lpal = lpal1;

	                }

	            }
	        }

	        System.out.println(lpal);
	    }
}
