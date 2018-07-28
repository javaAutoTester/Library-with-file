package by.skill.library_file.enums;

public enum Genre { 
	POETRY("Poetry"), PROSE("Prose"), ADVENTURE("Adventure"), NS("NOT SET");
	private String genre;

	private Genre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}
	

}
