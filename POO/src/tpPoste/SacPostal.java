package tpPoste;

import java.util.ArrayList;

public class SacPostal {

	private ArrayList<ObjetPostal> sacPostal;
	private double capacite;
	
	public SacPostal() {
		
	}
	
	public SacPostal(double capacite) {
		this.sacPostal = new ArrayList<>();
		this.setCapacite(capacite);
	}

	public double getCapacite() {
		return this.capacite;
	}

	public void setCapacite(double capacite) {
		this.capacite = capacite;
	}
	
	public void ajoutObjet(ObjetPostal o) {
		if (this.sacPostal.contains(o)) {
			System.out.println("Objet postal déjà ajouté.");
		} else if (o.getVolume() > (this.capacite - this.volumeOccupe())){
			System.out.println("Il n'y a plus de place dans le sac.");
		} else {
			this.sacPostal.add(o);
		}
	}
	
	public double volumeOccupe() {
		double vOcc = 0.005; // volume de la toile du sac
		for (int i = 0; i < this.sacPostal.size(); i++) {
			vOcc += this.sacPostal.get(i).getVolume();
		}
		return vOcc;
	}
	
	public double valeurRemboursement() {
		double vRemb = 0.;
		for (ObjetPostal o : this.sacPostal) {
			vRemb += o.tarifRemboursement();
		}
		return vRemb;
	}
	
	public SacPostal sacAvecMemeCodePostal(String codePostal) {
		SacPostal s = new SacPostal(capacite);
		for (ObjetPostal o : this.sacPostal) {
			if (o.getCodePostal().equals(codePostal)) {
				s.ajoutObjet(o);
			}
		}
		return s;
	}

	@Override
	public String toString() {
		return "SacPostal [sacPostal=" + this.sacPostal + ", capacite=" + this.capacite + "]";
	}
	
	
	
}
