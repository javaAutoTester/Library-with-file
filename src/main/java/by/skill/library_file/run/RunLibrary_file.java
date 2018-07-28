package by.skill.library_file.run;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import by.skill.library_file.abstracts.BookLike;
import by.skill.library_file.abstracts.IssueLike;
import by.skill.library_file.abstracts.Item;
import by.skill.library_file.abstracts.JournalLike;
import by.skill.library_file.entity.Book;
import by.skill.library_file.ligic.LibraryManager;
import by.skill.library_file.entity.JournalArticle;
import by.skill.library_file.entity.JournalIssue;
import by.skill.library_file.enums.Carrier;
import by.skill.library_file.enums.Genre;
import by.skill.library_file.enums.ItemType;
import by.skill.library_file.enums.Periodicity;
import by.skill.library_file.factory.ItemFactory;
import by.skill.library_file.enums.JournalType;

public class RunLibrary_file {

	public static void main(String[] args) throws IOException {	
		
//		JournalIssue ji1 = new JournalIssue();
//		ji1.setIssue_info("В поисках новой земли", "2017", "10", Carrier.E);
//		ji1.setJournal_info(JournalType.JOURNAL, "Вокруг света", "Путешествия", Periodicity.MONTHLY);
//		ji1.writeToFile();
//		
//		JournalArticle ja1 = new JournalArticle();
//		ja1.setArticle_info("Неизведанный остров в тихом океане","Орналдо Вито" , Carrier.P);
//		ja1.setIssue_info("На лодке в тихом океане", "2015", "1", Carrier.E);
//		ja1.setJournal_info(JournalType.ALMANAC, "Кругосветный альманах", "Природа", Periodicity.YEARLY);
//		ja1.writeToFile();
//		
//		Book b1 = new Book();
//		b1.setBook_info("Где-то на белом свете", "Константин Симонов", "354", Genre.PROSE, Carrier.P);
//		b1.writeToFile();
		
		// Factory паттерн пока применить тяжело, т.к. методы set_info содержат разное число параметров,
		// и их тяжело переопределить
		ItemFactory factory = ItemFactory.createItemFactory(ItemType.BOOK);
		Item item = factory.createItem();
		item.setBook_info("Я еду на Байкал", "Константин Богомазов", "3", Genre.ADVENTURE, Carrier.P);
		item.writeToFile();
		
		
//		HashMap<String, LinkedList<String>> items = 	LibraryManager.uploadLibraryFromFile();
//		LibraryManager.printLibraryItems(items);
		
	}
	

}
