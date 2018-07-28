package by.skill.library_file.abstracts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import by.skill.library_file.enums.Carrier;
import by.skill.library_file.enums.Genre;

public abstract  class Item {
	
	protected static void toFile(String info) throws IOException {
		File file = new File("/home/papa/Programs/Max-workspace/library_file/src/main/java/library.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write(info);
		fw.close();
	}
	
	public abstract void writeToFile() throws IOException;

	public void setBook_info(String book_title, String book_author, String book_pages, Genre book_genre, Carrier carrier) {
		
	}
	
}

