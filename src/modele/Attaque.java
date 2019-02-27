package modele;

public class Attaque {
	private String nom;
	private Type type;
	private int puissance;
	private int precision;
	private int priorite;
	private String effet;
	private Classe classe;
	
	public String toString() {
		return nom + " possède :\n"
				+ puissance + " de puissance\n"
				+ precision + " de precision\n"
				+ priorite	+ " de priorite\n"
				+ " et a pour effet " + effet;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Type getType() {
		return type;
	}
	
	public Classe getClasse() {
		return classe;
	}
	
	public int getPuissance() {
		return puissance;
	}
	
	public int getPrecision() {
		return precision;
	}
	
	public int getPriorite() {
		return priorite;
	}
	
	public String getEffet() {
		return effet;
	}
}
