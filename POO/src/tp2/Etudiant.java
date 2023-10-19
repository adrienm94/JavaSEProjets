package tp2;

import java.util.Scanner;

/*********************************
 * TP 2
 ***********************************************/

public class Etudiant {

	/****************** Partie attributs ****************************************/

	// L'attribut nom de l'étudiant
	private String nom;

	// Vous devez insérer ci-dessous les autres attributs
	private int age;
	private double noteProg;
	private double noteSyst;
	private double noteStage;
	private Inscription inscription; // Association 1-1 entre les classes Inscription et Etudiant

	/***************************************************************************/

	/******************** Partie Constructeurs ***************************/

	// Constructeur par défaut qui ne contient aucun attribut
	public Etudiant() {

	}

	// Constructeur qui contient seulement l'attribut nom
	public Etudiant(String nom) {
		this.setNom(nom);
	}

	// Vous devez ci-dessous définir le constructeur qui initialise tout sauf les
	// notes de l'étudiant
	public Etudiant(String nom, int age) {
		this.setNom(nom);
		this.setAge(age);
	}

	// Vous devez ci-dessous définir le constructeur qui initialise tout sauf l'age
	// de l'étudiant
	public Etudiant(String nom, double nP, double nSy, double nSt) {
		this.setNom(nom);
		this.setNoteProg(nSt);
		this.setNoteSyst(nSt);
		this.setNoteStage(nSt);
	}

	// Vous devez ci-dessous définir le constructeur qui initialise tous les
	// attributs
	public Etudiant(String nom, int age, double noteProg, double noteSyst, double noteStage) {
		this.setNom(nom);
		this.setAge(age);
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
	}

	// Constructeur initialisant le nom, l'âge et l'inscription
	public Etudiant(String nom, int age, int codeInsc, int codePays) {
		this.setNom(nom);
		this.setAge(age);
		this.inscription = new Inscription(codeInsc, codePays);
	}

	public Etudiant(String nom, int age, double noteProg, double noteSyst, double noteStage, int codeInsc,
			int codePays) {
		this.setNom(nom);
		this.setAge(age);
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
		this.inscription = new Inscription(codeInsc, codePays);
	}

	public Etudiant(String nom, int age, double noteProg, double noteSyst, double noteStage, Inscription inscription) {
		this.setNom(nom);
		this.setAge(age);
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
		this.inscription = new Inscription();
	}

	/***********************************************************************/

	/*************************************
	 * Partie Accesseurs
	 ***********************/

	/*
	 * Accesseurs de l'attribut nom : getNom qui retourne la valeur du nom setNom
	 * qui initialise la valeur du nom
	 */

	public String getNom() {
		return this.nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}

	/* Vous devez ci-dessous créer les accesseurs pour les autres attributs : */

	// Accesseurs de l'age
	public double getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 140) {
			this.age = age;
		} else {
			System.out.println("valeur d'âge incorrecte");
		}
	}

	// Accesseurs des notes
	public double getNoteProg() {
		return this.noteProg;
	}

	public void setNoteProg(double noteProg) {
		if (noteProg>=0 && noteProg<=20) {
			this.noteProg = noteProg;
		} else {
			System.out.println("Valeur de note incorrecte");
		}
	}

	public double getNoteSyst() {
		return this.noteSyst;
	}

	public void setNoteSyst(double noteSyst) {
		if (noteSyst>=0 && noteSyst<=20) {
			this.noteSyst = noteSyst;
		} else {
			System.out.println("Valeur de note incorrecte");
		}
	}

	public double getNoteStage() {
		return this.noteStage;
	}

	public void setNoteStage(double noteStage) {
		if (noteStage>=0 && noteStage<=20) {
			this.noteStage = noteStage;
		} else {
			System.out.println("Valeur de note incorrecte");
		}	}

	// Accesseurs de l'inscription
	public Inscription getInscription() {
		return this.inscription;
	}

	/***********************************************************************************/

	/******************************
	 * Partie méthodes
	 ***************************************/

	/*
	 * Méthode toString() qui permet d'afficher des informations concernant un
	 * étudiant. Méthode à décommenter et à modifier ci-dessous
	 */

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + this.getAge() + ", noteProg=" + this.getNoteProg() + ", noteSyst="
				+ this.getNoteSyst() + ", noteStage=" + this.getNoteStage() + ", " + this.inscription.toString() + "]";
	}

	/*
	 * Méthode saisie qui permet à l'utilisateur de saisir les informations des
	 * étudiants et de les initialiser. Méthode à écrire intégralement en vous
	 * inspirant du TP1
	 */

	public void saisie(Scanner sc) {
		System.out.println("Saisissez le nom de l'étudiant :");
		this.nom = sc.next();
		System.out.println("Saisissez l'âge de l'étudiant :");
		this.age = sc.nextInt();
		System.out.println("Saisissez la note de programmation de l'étudiant :");
		this.noteProg = sc.nextDouble();
		System.out.println("Saisissez la note de système de l'étudiant :");
		this.noteSyst = sc.nextDouble();
		System.out.println("Saisissez la note de stage l'étudiant :");
		this.noteStage = sc.nextDouble();

		this.inscription = new Inscription();
		System.out.println("Saisissez l'inscription de l'étudiant (1 ou 2) :");
		this.inscription.setCodeInscription(sc.nextInt());
		System.out.println("Saisissez le pays de l'étudiant (1, 2 ou 3) :");
		this.inscription.setCodePays(sc.nextInt());
	}

	/* Méthode moyenne à décommenter et à remplir */

	public double moyenne() {
		return (this.getNoteProg() + this.getNoteSyst() + this.getNoteStage()) / 3.0;
	}

	/*
	 * Méthode mention à écrire ci-dessous. Cette méthode utilise la méthode moyenne
	 * définie précédemment et retourne une chaine de caractère qui correspond à la
	 * mention de l'étudiant dont les valeurs possibles sont : Ajourné, passable,
	 * AB, Bien, TB
	 */

	public String mention() {
		String mention = "";
		if (this.moyenne() < 10) {
			mention = "Ajourné";
		} else if (this.moyenne() < 12) {
			mention = "passable";
		} else if (this.moyenne() < 14) {
			mention = "AB";
		} else if (this.moyenne() < 16) {
			mention = "Bien";
		} else {
			mention = "TB";
		}
		return mention;
	}

	/*
	 * Methode ligneResultat à écrire ci-dessous Cette méthode utilise le résultat
	 * de moyenne et de mention et retourne une chaine de caractère précisant : le
	 * nom, la moyenne, la mention, et si l'étudiant est ajourné, la liste des
	 * modules obtenus
	 */

	public String ligneResultat() {
		String ligneRes = "";
		ligneRes += "Résultats de l'étudiant " + this.getNom() + " : " + "\n\tMoyenne : " + this.moyenne()
		+ "\n\tMention : " + this.mention();
		if (this.mention().equals("Ajourné")
				&& ((this.getNoteProg() >= 10) || (this.getNoteSyst() >= 10) || (this.getNoteStage() >= 10))) {
			ligneRes += "\n\tModule(s) obtenu(s) :";
			if (this.getNoteProg() >= 10) {
				ligneRes += " Programmation ";
			}
			if (this.getNoteSyst() >= 10) {
				ligneRes += " Système ";
			}
			if (this.getNoteStage() >= 10) {
				ligneRes += " Stage ";
			}
		}
		return ligneRes;
	}
}
