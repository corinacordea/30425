package lab02;

import java.io.*;

public class MainClass {
	public static void main(String[] args){
		Functions functions = new Functions("output.txt");
		//PrintWriter writer = null;
		String[] operations;
		
		/*try{
			writer = new PrintWriter("output.txt");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		writer.print("");
		writer.close();*/
		
		Polynomial firstPolynom,secondPolynom;
		InputOutput io = new InputOutput();
		
		io.ReadFromFile("pol.txt");
		firstPolynom = io.GetFirstPolynomial();
		secondPolynom = io.GetSecondPolynomial();
		operations = io.GetFunctions();
	
		for(int i = 0 ; i<operations.length;i++){
			if(operations[i] == null){
				break;
			}
			if(operations[i].equals("ADD")){
				functions.ADD(firstPolynom, secondPolynom);
			}
			else if(operations[i].equals("SUBTRACT")){
				functions.SUBTRACT(firstPolynom, secondPolynom);
			}
			else if(operations[i].equals("MULTIPLY")){
				functions.MULTIPLY(firstPolynom, secondPolynom);
			}
			else {
				String[] tokens = operations[i].split(" "); 
				if(tokens[0].equals("EVAL")){
					functions.EVAL(Integer.parseInt(tokens[1]), firstPolynom);
					functions.EVAL(Integer.parseInt(tokens[1]), secondPolynom);
				}
			else if(tokens[0].equals("MUL_SCAL")){
					functions.MUL_SCAL(Integer.parseInt(tokens[1]), firstPolynom);
					functions.MUL_SCAL(Integer.parseInt(tokens[1]), secondPolynom);
				}
			}
		}
		System.out.println("done");
	}
}	
