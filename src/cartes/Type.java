package cartes;

public enum Type {
	FEU ("Feu Rouge", "Feu Vert","Véhicule Prioritaire"),
	ESSENCE ("Essence", "Panne d'Essence","Citerne d'Essence"),
	CREVAISON ("Crevaison","Roue de Secours","Increvable"),
	ACCIDENT("Accident","Réparations","As du Volant");
	private String attaque;
	private String parade;
	private String botte;
	
	private Type(String attaque, String parade, String botte) {
		this.attaque = attaque;
		this.parade = parade;
		this.botte = botte;
	}
	
	public String getAttaque() {
		return this.attaque;
	}
	
	public String getParade() {
		return this.parade;
	}
	
	public String getBotte() {
		return this.botte;
	}
}
