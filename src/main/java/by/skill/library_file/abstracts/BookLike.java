package by.skill.library_file.abstracts;

import by.skill.library_file.enums.Carrier;
import by.skill.library_file.enums.Genre;
import by.skill.library_file.enums.ItemType;

public abstract class BookLike extends Item {
	private String book_title;
	private String book_author;
	private String book_pages;
	private Genre book_genre;
	private Carrier carrier;
	private ItemType it = ItemType.BOOK;
	
	public BookLike() {
		super();
		this.book_title = "NOT SET";
		this.book_author = "NOT SET";
		this.book_pages = "00";
		this.book_genre = Genre.NS;
		this.carrier = Carrier.NS;
	}

	public BookLike(String book_title, String book_author, String book_pages, Genre book_genre, Carrier carrier) {
		super();
		this.book_title = book_title;
		this.book_author = book_author;
		this.book_pages = book_pages;
		this.book_genre = book_genre;
		this.carrier = carrier;
	}
	
	public String getBook_info() {
		String info = it.getItemtype()+"title:"+this.book_title+">author:"+this.book_author+">pages:"+this.book_pages+
			    ">genre:"+this.book_genre.getGenre()+">type:"+this.carrier.getCarrier()+">\n";
		return info;
	}
	
	public void setBook_info(String book_title, String book_author, String book_pages, Genre book_genre, Carrier carrier) {
		this.book_title = book_title;
		this.book_author = book_author;
		this.book_pages = book_pages;
		this.book_genre = book_genre;
		this.carrier = carrier;
	}
}
