
public class classname3 {
	//im thinking about starting with the biggest 3 digits number (999), see if it is a palindrome and if not,
	// decrease it until i found one and then break the function


//condition that a number is indeed a palindrome
// example :11
// x= 11%10 = 1
// y= y * 10 + x = 11
// z = 101/10 = 10
// if x=11 then ok 

// example 101=nr
// x=nr%10=1
// y=y*100+x= 100+1=101 ok
// z=101/10=10
	
	public boolean verify(int nr) { // is it ok that i have 'nr' there or am I "destroying" the boolean type?
								    // otherwise nr needed to be initialized
		int i;
		int x,y,z;
		y=1;
		while(nr>0) {
			x=nr%10;
			y=y*100+x;
			z=nr/10;
			if (y==nr) {
				return true;
			}
			else return false;
		}
		
		
	}
	
	public static int Palindrome(int nr) {
		
		
		int i;
		for(i=999;i<=0;i--) {
			if(verify(i)==true) {
				 break;
			}
			else i--;
			
		}
		nr=i;
		return nr;
		
	}
	
}
// problem doesnt work, honestly idk why, but i think i havent used corectly that boolean function
// it keeps telling me to change the boolean type to void