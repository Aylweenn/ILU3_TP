package cartes;

public abstract class Probleme {
	private Type type;

	public Probleme(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return this.type;
	}

}
