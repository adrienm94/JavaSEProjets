package genericitebornee;

public class Produit implements ObjetAvecEtiquette{

	private String etiquette;
	
	public Produit() {
		
	}
	
	public Produit(String e) {
		this.etiquette = e;
	}

	public String getEtiquette() {
		return this.etiquette;
	}

	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}
	
	@Override
	public String toString() {
		return "Produit : " + this.etiquette;
	}
	
}
