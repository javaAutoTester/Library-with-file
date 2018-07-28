package by.skill.library_file.enums;

public enum Carrier { 
	E("e-item"),P("paper-item"), NS("NOT SET");
	private String carrier;

	private Carrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCarrier() {
		return carrier;
	}
	

}
