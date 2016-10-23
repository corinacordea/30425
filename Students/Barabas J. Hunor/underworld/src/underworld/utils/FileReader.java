package underworld.utils;
import java.io.File;
import java.util.Scanner;

public class FileReader {
	
	public static void printFileContents (String pathToFile){
		try{ 
			File file = new File(pathToFile);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}
		catch(Exception e){
			System.out.println("Could not open the rulebook");
		}
		
		
	}
}
