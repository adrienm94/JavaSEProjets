package tp2;

import java.util.ArrayList;
import java.util.Arrays;

public class Promotion {

	private int annee;
	private String nom;
	private ArrayList<Etudiant> promotion;

	public Promotion() {
		this.promotion = new ArrayList<>();
	}

	public Promotion(int a, String n) {
		this.annee = a;
		this.nom = n;
		this.promotion = new ArrayList<>();
	}

	public int getAnnee() {
		return this.annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void inscrire(Etudiant e) {
		if (this.promotion.contains(e)) {
			System.out.println("Cet étudiant est déjà inscrit.");
		} else {
			this.promotion.add(e);
		}
	}

	public int nbEtudiants() {
		return this.promotion.size();
	}

	public String afficheEtudiants() {
		if (this.promotion.isEmpty()) {
			return "Cette promotion n'a pas d'étudiants.";
		} else {
			String res = "";
			for (Etudiant e : this.promotion) {
				res += e.toString();
			}
			return res;
		}
	}

	public Etudiant getEtudiant(int i) {
		if (i >= 0 && i < this.nbEtudiants()) {
			return this.promotion.get(i);
		} else {
			return null;
		}
	}

	public double moyenneGénérale() {
		if (this.nbEtudiants() == 0) {
			return 0.;
		} else {
			double somme = 0;
			for (int i = 0; i < this.nbEtudiants(); i++) {
				somme += this.getEtudiant(i).moyenne();
			}
			return somme / this.nbEtudiants();
		}
	}

	public String afficheResultats() {
		String res = "";
		for (Etudiant e : this.promotion) {
			res += e.ligneResultat() + "\n   ";
		}
		return res;
	}

	public boolean recherche(String nom) {
		int i = 0;
		boolean trouve = false;
		while (i < this.nbEtudiants() && !trouve) {
			if (this.getEtudiant(i).getNom().equals(nom)) {
				trouve = true;
			}
			i += 1;
		}
		return trouve;
	}

	public ArrayList<Etudiant> listeAdmis() {
		ArrayList<Etudiant> listeAdmis = new ArrayList<>();
		for (Etudiant e : this.promotion) {
			if (e.moyenne() >= 10) {
				listeAdmis.add(e);
			}
		}
		return listeAdmis;
	}

	public String major() {
		String major = this.getEtudiant(0).getNom();
		for (int i = 0; i < this.nbEtudiants() - 1; i++) {
			if (this.getEtudiant(i + 1).moyenne() > this.getEtudiant(i).moyenne()) {
				major = this.getEtudiant(i + 1).getNom();
			}
		}
		return major;
	}

	public ArrayList<Etudiant> majors() {
		ArrayList<Etudiant> listeMajors = new ArrayList<>();
		for (int i = 0; i < this.nbEtudiants() - 1; i++) {
			if (this.getEtudiant(i + 1).moyenne() > this.getEtudiant(i).moyenne()) {
				listeMajors.removeAll(listeMajors);
				listeMajors.add(this.getEtudiant(i + 1));
			} else if (this.getEtudiant(i + 1).moyenne() == this.getEtudiant(i).moyenne()) {
				listeMajors.add(this.getEtudiant(i + 1));
			}
		}
		return listeMajors;
	}

	public ArrayList<Etudiant> nouveauxInscritsNonFrancophones() {
		ArrayList<Etudiant> listeNouveauxInscritsNonFrancophones = new ArrayList<>();
		for (Etudiant e : this.promotion) {
			if ((e.getInscription().getCodePays() == 3) && (e.getInscription().getCodeInscription() == 1)) {
				listeNouveauxInscritsNonFrancophones.add(e);
			}
		}
		return listeNouveauxInscritsNonFrancophones;
	}

	public String histogramme() {
		String[] hist = new String[20];
		for (int i = 0; i <= 18; i++) {
			hist[i] = "[" + i + "-" + String.valueOf(i + 1) + "[";
		}
		hist[19] = "[19-20]";
		for (int j = 0; j < this.nbEtudiants(); j++) {
			int k = 0;
			while (!(k+1>this.getEtudiant(j).moyenne() && k<=this.getEtudiant(j).moyenne())) {
				k++;
			}
			hist[k] = hist[k] + " *";
		}
		return Arrays.toString(hist);
	}
	
}

