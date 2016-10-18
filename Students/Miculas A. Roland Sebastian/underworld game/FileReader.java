package underworld.utils;

import java.util.Scanner;
import java.io.*;

public class FileReader {
	public static void printFileContent(String pathToFile){
		Scanner scan = null;
		try{
			scan = new Scanner(new File(pathToFile));
		}
		catch(FileNotFoundException e){
			System.out.println("FileNotFound " + e.getMessage());
		}
		while(scan.hasNextLine()){
			System.out.println(scan.nextLine());
		}
	}
}
