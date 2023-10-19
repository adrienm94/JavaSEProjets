package tp2;

public class Inscription {

	private int codeInscription;
	private int codePays;

	public Inscription() {
	}

	public Inscription(int codeI, int codeP) {
		this.setCodeInscription(codeI);
		this.setCodePays(codeP);
	}

	public int getCodeInscription() {
		return this.codeInscription;
	}

	public void setCodeInscription(int codeInscription) {
		if ((codeInscription == 1) || (codeInscription == 2)) {
			this.codeInscription = codeInscription;
		} else {
			System.out.println("Le code inscription doit prendre les valeurs 1 ou 2.");
		}
	}

	public int getCodePays() {
		return this.codePays;
	}

	public void setCodePays(int codePays) {
		if ((codePays == 1) || (codePays == 2) || (codePays == 3)) {
			this.codePays = codePays;
		} else {
			System.out.println("Le code pays doit prendre les valeurs 1, 2 ou 3.");
		}
	}

	public String nationalite() {
		switch (this.codePays) {
		case 1:
			return "Etudiant français";
		case 2:
			return "Etudiant francophone";
		default:
			return "Etudiant non francophone";
		}
	}

	public String typeInscription() {
		switch (this.codeInscription) {
		case 1:
			return "Première inscription";
		default:
			return "Réinscription";
		}
	}

	@Override
	public String toString() {
		return "Inscription [ Nationalité : "+this.nationalite()+", type d'inscription : "+this.typeInscription()+"]";
	}

}
