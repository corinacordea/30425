package lab02;

import java.util.Scanner; // for scanner
import java.io.*;

public class InputOutput {
	private Polynomial firstPolynom ;
	private Polynomial secondPolynom ;
	private String[] functions = new String[100];
	
	public boolean ReadFromFile(String fileName){
		Scanner sc = null;
		int index = 0;
		String line;
		String[] parts;
		
		try{ // try catch in case file doesn't exist
			sc = new Scanner(new File("pol.txt"));
		}
		catch(FileNotFoundException e){ // throw exception;
			System.err.println("File " + fileName + " not found: " + e.getMessage());
			return false;
		}
		
		line = sc.nextLine();
		parts = line.split(" ");
		firstPolynom = new Polynomial(parts.length);
		for(int i =0;i<parts.length;i++){
			firstPolynom.numbers[i] = Integer.parseInt(parts[i]);
		}
		
		line = sc.nextLine();
		parts = line.split(" ");
		secondPolynom = new Polynomial(parts.length);
		for(int i =0;i<parts.length;i++){
			secondPolynom.numbers[i] = Integer.parseInt(parts[i]);
		}
		
		sc.nextLine();
		while(sc.hasNextLine()){
			functions[index] =sc.nextLine();
			index++;
		}
		sc.close();
		return true;
	}
	Polynomial GetFirstPolynomial(){
		return firstPolynom;
	}
	
	Polynomial GetSecondPolynomial(){
		return secondPolynom;
	}
	
	String[] GetFunctions(){
		return functions;
	}
	
	public int WriteToFile(Polynomial polynom,String fileName){
		String output ="";
		PrintWriter writer;
		for(int i = 0 ; i<polynom.degree;i++){
			output = output + Integer.toString(polynom.numbers[i]) + " ";
		}
		try{
			writer = new PrintWriter(new FileOutputStream(new File(fileName),true));
		}
		catch (FileNotFoundException e){
			System.out.println("File " + fileName + "not found: " + e.getMessage());
			return -1;
		}
		writer.println(output);
		writer.close();
		return 0;
	}
	public int WriteToFile(long result,String fileName){
		String output = Long.toString(result);
		PrintWriter writer;
		try{
			writer = new PrintWriter(new FileOutputStream(new File(fileName),true));
		}
		catch (FileNotFoundException e){
			System.out.println("File " + fileName + "not found: " + e.getMessage());
			return -1;
		}
		writer.println(output);
		writer.close();
		return 0;
	}
}
