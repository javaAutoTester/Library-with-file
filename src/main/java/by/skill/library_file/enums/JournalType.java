package by.skill.library_file.enums;

public enum JournalType { NS("NOT_SET"),JOURNAL("JOURNAL"), SCIENCE_MAGAZINE("SCIENCE_MAGAZINE"),ALMANAC("ALMANAC");
	private String type;

	private JournalType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	

}
