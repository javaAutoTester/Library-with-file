package by.skill.library_file.factory;

import by.skill.library_file.abstracts.Item;
import by.skill.library_file.enums.ItemType;

public abstract class ItemFactory {
	public abstract Item createItem();
	
	public static ItemFactory createItemFactory(ItemType type) {
		if((type.getItemtype()).equals("BOOK>")) {
			return new BookFactory();
		}
		return null;	
		
	}
	

}
