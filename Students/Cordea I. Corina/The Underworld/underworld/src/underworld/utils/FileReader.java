package underworld.utils;

import java.io.File;
import java.util.Scanner;

public class FileReader {
	public static void printFileContents (String pathToFile){
		try{
			File inputFile = new File(pathToFile);
			Scanner scanner = new Scanner(inputFile);
			while (scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}
		catch(Exception error){
			System.out.println("Error opening file!");
		}
	}
}
