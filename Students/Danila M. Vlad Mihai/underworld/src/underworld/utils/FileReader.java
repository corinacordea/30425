package underworld.utils;
import java.util.*;
import java.io.File;

public class FileReader {
	public static void printFileContents(String pathToFile){
		try{
			 			File inFile = new File(pathToFile);
			 			Scanner in = new Scanner(inFile);
						while (in.hasNextLine()){
			 				System.out.println(in.nextLine());
			 			}
			 			in.close();
			 		}
			 		catch(Exception e){
			 			System.out.println("Could not open file  " + pathToFile);
			 		}
		
	}

}
