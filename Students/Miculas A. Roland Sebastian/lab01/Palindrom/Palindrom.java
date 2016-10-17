package lab01;

public class Palindrom {
	public boolean isPalindrom(int argument){
		int auxiliar = argument;
		int digit = 0;
		int newNumber = 0;
		
		while(auxiliar != 0){
			digit = auxiliar % 10;
			auxiliar /= auxiliar;
			newNumber = newNumber * 10 + digit;
		}
		if(newNumber == argument)
			return true;
		else
			return false;
	}
}
