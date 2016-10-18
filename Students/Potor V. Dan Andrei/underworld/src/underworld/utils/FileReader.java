package underworld.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
	public static void printFileContents(String pathToFile){
		Charset charset = Charset.forName("ISO-8859-1");
	    try {
	      List<String> lines = Files.readAllLines(Paths.get(pathToFile), charset);

	      for (String line : lines) {
	        System.out.println(line);
	      }
	    } 
	    catch (IOException e) {
	      System.out.println(e);
	    }
	}
}