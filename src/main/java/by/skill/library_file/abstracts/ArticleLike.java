package by.skill.library_file.abstracts;

import by.skill.library_file.enums.Carrier;
import by.skill.library_file.enums.ItemType;

public abstract class ArticleLike extends IssueLike {
	private String article_title;
	private String article_author;
	private Carrier carrier;
	private ItemType it = ItemType.ARTICLE;
	
	public ArticleLike() {
		super();
		this.article_title = "NOT SET";
		this.article_author = "NOT SET";
		this.carrier = Carrier.NS;
	}
	
	public ArticleLike(String article_title, String article_author, Carrier carrier) {
		super();
		this.article_title = article_title;
		this.article_author = article_author;
		this.carrier = carrier;
	}

	public String getArticle_info() {
		String info =this.it.getItemtype()+"title:"+this.article_title+">author:"+this.article_author+">carrier:"
		       +this.carrier.getCarrier()+">"+this.getIssue_info();
		return info;
	}
	
    public void setArticle_info(String article_title, String article_author, Carrier carrier) {
    	this.article_title = article_title;
		this.article_author = article_author;
		this.carrier = carrier;
    }
}
