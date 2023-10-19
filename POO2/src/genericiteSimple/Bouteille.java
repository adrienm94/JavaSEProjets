package genericiteSimple;

public class Bouteille {

	private String nom;
	
	public Bouteille() {}
	
	public Bouteille(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Bouteille [nom=" + this.nom + "]"; 
	}
	
}
