package lab01;

public class MainClass {
	public static void main(String[] args){
		int maximum = 0;
		Palindrom palindrom = new Palindrom();
		
		for(int index = 1000;index <9999;index++){
			if(palindrom.CheckIfPalindrom(index * index) == true){
				maximum = index*index;
			}
		}
		System.out.println(maximum);
	}
}
