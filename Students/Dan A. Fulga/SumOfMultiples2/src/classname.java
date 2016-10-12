
public class classname {
	
	public static int Sum ( int nr ) {
		int s=0;
		int i;
		for(i=1;i<=nr;i++) {
			if(i%3==0 || i%5==0) {
				s=s+i;
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(Sum(1000));
	}

}
