package tpHumain;

import java.util.Date;

public class Humain {

	private String nom;
	private int âge;
	private Genre genre;
	private Humain conjoint;
	private Union union;

	public Humain() {

	}

	public Humain(String nom, int âge, Genre genre) {
		this.setNom(nom);
		this.setÂge(âge);
		this.setGenre(genre);
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getÂge() {
		return this.âge;
	}

	public void setÂge(int âge) {
		if (âge>=0 && âge <=140) {
			this.âge = âge;
		} else {
			System.out.println("Âge incorrect");
		}
	}

	public Genre getGenre() {
		return this.genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Humain getConjoint() {
		return this.conjoint;
	}
	
	public Union getUnion() {
		return this.union;
	}

	public boolean estMajeur() {
		return (this.getÂge()>=18);
	}

	public boolean estUni() {
		return !(this.conjoint == null);
	}

	public void sUnir(Humain h, Date dateUnion, String lieuUnion, Humain témoinPrincipal1, Humain témoinPrincipal2, TypeContrat typeContrat) {
		if (h == null) {
			System.out.println("Absence de mariage.");
		} else if (h == this) {
			System.out.println("On ne se marie pas avec soi-même.");
		} else if (!this.estMajeur() || !h.estMajeur()) {
			System.out.println("L'une des deux personnes n'est pas majeur.");
		} else if (!this.estUni() && !h.estUni()){
			this.conjoint = h;
			h.conjoint = this;
			this.union = new Union(dateUnion, lieuUnion, témoinPrincipal1, témoinPrincipal2, this, h, typeContrat) ;
		} else {
			System.out.println("Une des deux personnes est déjà mariée.");
		}

	}

	public void seSeparer() {
		if (this.estUni()) {
			this.conjoint.conjoint = null;
			this.conjoint = null;
			this.union = null;
		} else {
			System.out.println("La personne n'est pas mariée.");
		}
	}

	@Override
	public String toString() {
		String s = "Humain : nom=" + this.nom + ", âge=" + this.âge + ", genre=" + this.genre;
		if (!(this.getConjoint() == null)) {
			s += ", nom du conjoint=" + this.conjoint.getNom() + ", union=" + this.union.toString();
		}
		return s;
	}
	
}
