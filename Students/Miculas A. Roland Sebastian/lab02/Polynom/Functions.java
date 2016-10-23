package lab02;

public class Functions {
		private InputOutput io = new InputOutput();
		private String fileName;
		Functions(String fileName){
			this.fileName = fileName;
		}
		
		public void ADD(Polynomial firstPolynom,Polynomial secondPolynom){
			Polynomial sum ;
		
			if(firstPolynom.degree > secondPolynom.degree){
				sum = new Polynomial(firstPolynom.degree);
				for(int i = 0 ;i< firstPolynom.degree - secondPolynom.degree;i++){
					sum.numbers[i] = firstPolynom.numbers[i];
				}
				for(int i = firstPolynom.degree - secondPolynom.degree;i<sum.degree;i++){
					sum.numbers[i] = firstPolynom.numbers[i] + secondPolynom.numbers[i - firstPolynom.degree + secondPolynom.degree];
				}
			}
			else{
				sum = new Polynomial(secondPolynom.degree);
				for(int i = 0 ;i< secondPolynom.degree - firstPolynom.degree;i++){
					sum.numbers[i] = secondPolynom.numbers[i];
				}
				for(int i = secondPolynom.degree - firstPolynom.degree;i<sum.degree;i++){
					sum.numbers[i] = secondPolynom.numbers[i] + firstPolynom.numbers[i - secondPolynom.degree + firstPolynom.degree];
				}
			}
			
			io.WriteToFile(sum, fileName);
		}				

		public void SUBTRACT(Polynomial firstPolynom,Polynomial secondPolynom){
			Polynomial difference ;
			
			if(firstPolynom.degree > secondPolynom.degree){
				difference = new Polynomial(firstPolynom.degree);
				for(int i = 0 ;i< firstPolynom.degree - secondPolynom.degree;i++){
					difference.numbers[i] = firstPolynom.numbers[i];
				}	
				for(int i = firstPolynom.degree - secondPolynom.degree;i<difference.degree;i++){
					difference.numbers[i] = firstPolynom.numbers[i] - secondPolynom.numbers[i - firstPolynom.degree + secondPolynom.degree];
				}
			}
			else{
				difference = new Polynomial(secondPolynom.degree);
				for(int i = 0 ;i< secondPolynom.degree - firstPolynom.degree;i++){
					difference.numbers[i] = secondPolynom.numbers[i];
				}
				for(int i = secondPolynom.degree - firstPolynom.degree;i<difference.degree;i++){
					difference.numbers[i] = firstPolynom.numbers[i - secondPolynom.degree + firstPolynom.degree] - secondPolynom.numbers[i] ;
				}
			}
			io.WriteToFile(difference, fileName);
		}
		
	long EVAL(int n,Polynomial polynom){
		long p = 0;
        for (int i = polynom.degree - 1; i >= 0; i--)
            p = (long) (p + polynom.numbers[i]*Math.pow(n,i));
        io.WriteToFile(p,fileName);
        return p;
	}
	void MUL_SCAL(int n,Polynomial polynom){
		Polynomial newPolynom = new Polynomial(polynom.degree);
		for(int i = 0;i<polynom.degree;i++){
			newPolynom.numbers[i] = polynom.numbers[i] * n;
		}
		io.WriteToFile(newPolynom,fileName);
	}
	void MULTIPLY(Polynomial firstPolynom,Polynomial secondPolynom){
		Polynomial newPolynom = new Polynomial(firstPolynom.degree + secondPolynom.degree -1);
		for(int i = 0 ; i <firstPolynom.degree;i++){
			for(int j = 0 ;j<secondPolynom.degree;j++){
				newPolynom.numbers[i+j] += firstPolynom.numbers[i]*secondPolynom.numbers[j];
			}
		}
		io.WriteToFile(newPolynom, fileName);
	}
}
/*
 * 5 -4 2 0 -2 3  0  3  -17
               4 -2  0    1
   5 -4 2 0 -2 7 -2  3  -16   */
