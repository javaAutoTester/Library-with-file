package by.skill.library_file.ligic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LibraryManager {
	
	public static HashMap<String, LinkedList<String>> uploadLibraryFromFile() throws FileNotFoundException {
		HashMap<String, LinkedList<String>> items = new HashMap<>();
		Pattern p = Pattern.compile("^[A-Z]([A-Z_a-z]+)>");
		File file = new File("/home/papa/Programs/Max-workspace/library_file/src/main/java/library.txt");
		Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
        	String info = scanner.nextLine();
        	Matcher m = p.matcher(info);
        	String item = "";
        	while(m.find()) {
        		item = m.group();
        	}
        	//смотрим, имеется ли найденный ключ в нашем HashMap
        	if(items.containsKey(item)) {
        		items.get(item).add(info);
        	}else {
        		items.put(item, new LinkedList<String>());
        		items.get(item).add(info);
        	}
        }
        scanner.close();
        
		return items;
	}
	
	public static void printLibraryItems(HashMap<String, LinkedList<String>> items) {
		for (int i = 0; i < items.keySet().size(); i++) {
	    	   String key = (String) items.keySet().toArray()[i];
	    	   for (int j = 0; j < items.get(key).size(); j++) {
				System.out.println((String) items.get(key).toArray()[j]);
			}
	  }
	}
	
}
