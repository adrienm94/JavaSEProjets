package genericiteSimple;

public class EtiquetteBouteille {

	private double degreAlcool;
	private String nomProducteur;
	private String adresse;
	private String contenu;
	private double quantite; // en litres
	
	public EtiquetteBouteille() {
		
	}
	
	public EtiquetteBouteille(double degreAlcool, String nomProducteur, String adresse, String contenu,
			double quantite) {
		this.degreAlcool = degreAlcool;
		this.nomProducteur = nomProducteur;
		this.adresse = adresse;
		this.contenu = contenu;
		this.quantite = quantite;
	}

	public double getDegreAlcool() {
		return this.degreAlcool;
	}

	public void setDegreAlcool(double degreAlcool) {
		this.degreAlcool = degreAlcool;
	}

	public String getNomProducteur() {
		return this.nomProducteur;
	}

	public void setNomProducteur(String nomProducteur) {
		this.nomProducteur = nomProducteur;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public double getQuantite() {
		return this.quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "EtiquetteBouteille [degreAlcool=" + this.degreAlcool + ", nomProducteur=" + this.nomProducteur + ", adresse="
				+ this.adresse + ", contenu=" + this.contenu + ", quantite=" + this.quantite + "]";
	}
	
	
	
}
