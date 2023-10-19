package streams;

public class Personne {

	private String prenom, nom;
	private int annee;
	
//	public Personne() {
//		
//	}

	public Personne(String prenom, String nom, int annee) {
		this.prenom = prenom;
		this.nom = nom;
		this.annee = annee;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnnee() {
		return this.annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + this.prenom + ", nom=" + this.nom + ", annee=" + this.annee + "]";
	}
	
	
	
	
	
}
