package by.skill.library_file.factory;

import by.skill.library_file.abstracts.Item;
import by.skill.library_file.entity.JournalIssue;

public class JournalIssueFactory extends ItemFactory {

	@Override
	public Item createItem() {
		return new JournalIssue();
	}
	

}
