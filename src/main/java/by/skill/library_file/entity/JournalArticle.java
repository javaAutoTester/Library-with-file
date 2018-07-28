package by.skill.library_file.entity;

import java.io.IOException;

import by.skill.library_file.abstracts.ArticleLike;
import by.skill.library_file.abstracts.Item;
import by.skill.library_file.enums.Carrier;

public class JournalArticle extends ArticleLike{
	
	public JournalArticle() {
		super();
	}
	
	public JournalArticle(String article_title, String article_author, Carrier carrier) {
		super(article_title, article_author, carrier);
	}
	
	@Override
	public void writeToFile() throws IOException {
		Item.toFile(this.getArticle_info());
	}

	
}
