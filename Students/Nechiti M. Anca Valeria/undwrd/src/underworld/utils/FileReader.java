package underworld.utils;

import java.io.IOException;
//import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class FileReader {
	//Path myPath = Paths.get("D:/UTCN E30412/2nd Year/POO/Eclipse/undwrd", "rules.txt");
	
	public static void printFileContents (Path pathToFile) {
		try {
			List<String> lines = Files.readAllLines(pathToFile/*, Charset.defaultCharset()*/);
	            for (String line : lines) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
		    	System.out.println(e);
	        	}
	}
}
