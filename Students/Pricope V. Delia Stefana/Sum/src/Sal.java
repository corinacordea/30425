
public class Sal {
	public static void main(String[] args) {	
		int sum = 0;
		for (int myNumber = 1; myNumber <= 1000; ++myNumber) {
			if (myNumber / 3 == 0 || myNumber / 5 == 0) {
				sum = sum + myNumber;
			}
		}
		System.out.println(sum);
	}
}
