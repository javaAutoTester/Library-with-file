package by.skill.library_file.abstracts;

import by.skill.library_file.enums.Carrier;
import by.skill.library_file.enums.ItemType;

public abstract class IssueLike extends JournalLike {
	private String issue_title;
	private String issue_year;
	private String issue_number;
	private Carrier carrier;
	private ItemType it = ItemType.ISSUE;
	
    public IssueLike() {
    	super();
    	this.issue_title = "NOT SET";
    	this.issue_year = "0000";
    	this.issue_number = "#0";
    	this.carrier = Carrier.NS;
    }
	
	public IssueLike(String issue_title, String issue_year, String issue_number, Carrier carrier) {
		super();
		this.issue_title = issue_title;
		this.issue_year = issue_year;
		this.issue_number = issue_number;
		this.carrier = carrier;
	}
	
	public String getIssue_info() {
		String info = null;
		if(this instanceof IssueLike) {
		info = this.it.getItemtype()+"title:"+this.issue_title+">year:"+this.issue_year+">number:"+this.issue_number+">carrier:"
		       +this.carrier.getCarrier()+">"+this.getJournal_info();
		}
		if(this instanceof ArticleLike) {
			info =this.it.getItemtype()+"title:"+this.issue_title+">year:"+this.issue_year+">number:"+this.issue_number+">"+this.getJournal_info();
			}
		
		return info;
	}

	public void setIssue_info(String issue_title, String issue_year, String issue_number, Carrier carrier) {
		this.issue_title = issue_title;
		this.issue_year = issue_year;
		this.issue_number = issue_number;
		this.carrier = carrier;
	}
	
}
