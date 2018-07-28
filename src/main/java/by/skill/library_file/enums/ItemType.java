package by.skill.library_file.enums;

public enum ItemType {
	BOOK("BOOK>"), ISSUE("ISSUE>"), ARTICLE("ARTICLE>");
	private String itemtype;

	private ItemType(String itemtype) {
		this.itemtype = itemtype;
	}

	public String getItemtype() {
		return itemtype;
	}
	
	

}
