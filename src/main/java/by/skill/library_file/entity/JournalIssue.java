package by.skill.library_file.entity;

import java.io.IOException;

import by.skill.library_file.abstracts.IssueLike;
import by.skill.library_file.abstracts.Item;
import by.skill.library_file.enums.Carrier;

public class JournalIssue extends IssueLike {
	
	public JournalIssue() {
		super();
	}
			
	public JournalIssue(String issue_title, String issue_year, String issue_number, Carrier carrier) {
		super(issue_title, issue_year, issue_number, carrier);
	}

	@Override
	public void writeToFile() throws IOException {
		Item.toFile(this.getIssue_info());
	}

}
