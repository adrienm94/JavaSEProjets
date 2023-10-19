package genericitebornee;

import java.util.ArrayList;

public class Rayon<T extends ObjetAvecEtiquette> {

	private ArrayList<T> contenu = new ArrayList<>();
	
	public Rayon() {
		
	}
	
	public void mettreEnRayon(T p){
		if (!this.contenu.contains(p)) {
			this.contenu.add(p);
		}
		else {
			System.out.println("Ce produit est déjà en rayon.");
		}
	}
	
	public String listingContenu() {
		String listing = "|";
		for (T p : contenu) {
			listing += p.getEtiquette() + "|";
		}
		return listing;
	}
}
