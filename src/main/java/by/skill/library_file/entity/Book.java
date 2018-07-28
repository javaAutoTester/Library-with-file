package by.skill.library_file.entity;

import java.io.IOException;

import by.skill.library_file.abstracts.BookLike;
import by.skill.library_file.abstracts.Item;
import by.skill.library_file.enums.Carrier;
import by.skill.library_file.enums.Genre;

public class Book extends BookLike {
	
	public Book() {
		super();
	}

	public Book(String book_title, String book_author, String book_pages, Genre book_genre, Carrier carrier) {
		super(book_title, book_author, book_pages, book_genre, carrier);
	}

	@Override
	public void writeToFile() throws IOException {
		Item.toFile(this.getBook_info());
	}
	

	
	
	
}
