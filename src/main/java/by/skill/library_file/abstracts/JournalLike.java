package by.skill.library_file.abstracts;

import by.skill.library_file.enums.Periodicity;
import by.skill.library_file.enums.JournalType;

public abstract class JournalLike extends Item {
	private JournalType journal_type;
	private String journal_title;
	private String journal_subject;
	private Periodicity journal_periodicity;
	
	protected JournalLike() {
		this.journal_type = JournalType.NS;
		this.journal_title = "NOT SET";
		this.journal_subject = "NOT SET";
		this.journal_periodicity = Periodicity.NS;
	}	
	
	public String getJournal_info() {
		String info = this.journal_type.getType()+">"+"title:"+this.journal_title+">subject:"+this.journal_subject+
	             ">periodicity:"+this.journal_periodicity.getPeriodicity()+">\n";
		return info;
	}
	
	public void setJournal_info(JournalType journal_type, String journal_title, String journal_subject, Periodicity journal_periodicity) {
		this.journal_type =journal_type;
		this.journal_title = journal_title;
		this.journal_subject = journal_subject;
		this.journal_periodicity = journal_periodicity;
	}
	
}
