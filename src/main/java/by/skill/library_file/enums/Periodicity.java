package by.skill.library_file.enums;

public enum Periodicity { 
	NS("NOT SET"),DAILY("daily"), WEEKLY("weekly"), MONTHLY("monthly"), YEARLY("early");
    private String periodicity;
    
	private Periodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public String getPeriodicity() {
		return periodicity;
	}  
	
}
