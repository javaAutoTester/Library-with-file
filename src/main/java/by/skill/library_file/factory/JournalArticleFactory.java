package by.skill.library_file.factory;

import by.skill.library_file.abstracts.Item;
import by.skill.library_file.entity.JournalArticle;

public class JournalArticleFactory extends ItemFactory{

	@Override
	public Item createItem() {
		// TODO Auto-generated method stub
		return new JournalArticle();
	}
	
}
