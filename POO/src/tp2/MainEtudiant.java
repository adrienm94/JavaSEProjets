package tp2;

import java.io.IOException;
import java.util.Scanner;

public class MainEtudiant {

	public static void main(String[] args) throws IOException {

		/***********************
		 * Constructeurs
		 *******************************************/

		// Création d'un nouvel étudiant dont le nom est paul
		Etudiant etud1 = new Etudiant("Paul", 22, 1, 1);

		// En vous inspirant de l'exemple, écrire ci-dessous le code pour créer les
		// autres étudiants
		Etudiant etud2 = new Etudiant("Jean", 24, 1, 2);
		Etudiant etud3 = new Etudiant("Abdoulkhader", 23, 2, 2);
		Etudiant etud4 = new Etudiant("Astrid", 26, 1, 3);
		Etudiant etud5 = new Etudiant("Paolo", 27, 1, 3);
		Etudiant etud6 = new Etudiant("Zoé", 26, 12, 14, 17, 1, 1);
		Etudiant etud8 = new Etudiant("Pierre", 24, 1, 2);
//		Etudiant etud9 = new Etudiant("Blabla", 21, 3, 3); // affiche un message d'erreur (code inscription non valable)
//		Etudiant etud10 = new Etudiant("Blabla", 21, 1, 4);// affiche un message d'erreur (code pays non valable)

		/***********************************
		 * Accesseurs
		 *****************************************/

		/* Affichage des informations grâce à l'accesseur get */

		// Affichage du nom de etud1
		System.out.println("Le nom de l'étudiant1 est: " + etud1.getNom());

		// Ecrire ci-dessous les informations des autres étudiants (toutes les
		// informations connues par étudiant)
		System.out.println("Le nom de l'étudiant2 est: " + etud2.getNom());
		System.out.println("Le nom de l'étudiant3 est: " + etud3.getNom());
		System.out.println("Le nom de l'étudiant4 est: " + etud4.getNom());
		System.out.println("Le nom de l'étudiant5 est: " + etud5.getNom());
		System.out.println("Le nom de l'étudiant6 est: " + etud6.getNom());

		/* Modification d'information grâce à l'accesseur set */

		// Modification du nom de etud1
		etud1.setNom("Paul-Henri");

		// Ecrire ci-dessous le code pour modifier l'âge de Jean
		etud2.setAge(25);

		// Ecrire ci-dessous le code pour modifier la note de programmation de Zoe
		etud6.setNoteProg(15);
		//		etud6.setNoteSyst(22); // affiche un message d'erreur (note > 20)

		// Ecrire ci-dessous le code pour ajouter les notes des autres étudiants
		etud1.setNoteProg(16);
		etud1.setNoteSyst(15);
		etud1.setNoteStage(14);
		etud2.setNoteProg(8);
		etud2.setNoteSyst(7);
		etud2.setNoteStage(11);
		etud3.setNoteProg(10);
		etud3.setNoteSyst(14);
		etud3.setNoteStage(11);
		etud4.setNoteProg(12);
		etud4.setNoteSyst(5);
		etud4.setNoteStage(8);
		etud5.setNoteProg(2);
		etud5.setNoteSyst(10);
		etud5.setNoteStage(11);

		/* Verification que les modifications ont bien été prises en compte */

		// Pour chaque étudiant modifié, écrire ci-dessous le code permettant d'afficher
		// les nouvelles informations, grâce à l'accesseur get
		System.out.println("Après modification, le nom de l'étudiant1 est: " + etud1.getNom());
		System.out.println("Après modification, l'âge de l'étudiant2 est: " + etud2.getAge());
		System.out.println("Après modification, le note de programmation de l'étudiant6 est: " + etud6.getNoteProg());
		System.out.println("Après modification, les notes de l'étudiant1 sont: Programmation : " + etud1.getNoteProg()
		+ ", Système : " + etud1.getNoteSyst() + ", Stage : " + etud1.getNoteStage());
		System.out.println("Après modification, les notes de l'étudiant2 sont: Programmation : " + etud2.getNoteProg()
		+ ", Système : " + etud2.getNoteSyst() + ", Stage : " + etud2.getNoteStage());
		System.out.println("Après modification, les notes de l'étudiant3 sont: Programmation : " + etud3.getNoteProg()
		+ ", Système : " + etud3.getNoteSyst() + ", Stage : " + etud3.getNoteStage());
		System.out.println("Après modification, les notes de l'étudiant4 sont: Programmation : " + etud4.getNoteProg()
		+ ", Système : " + etud4.getNoteSyst() + ", Stage : " + etud4.getNoteStage());
		System.out.println("Après modification, les notes de l'étudiant5 sont: Programmation : " + etud5.getNoteProg()
		+ ", Système : " + etud5.getNoteSyst() + ", Stage : " + etud5.getNoteStage());

		/*************************** Les méthodes ************************************/

		/* Utilisation de la méthode toString */

		// Utilisation de la méthode toString pour afficher l'étudiant etud1

		System.out.println("Informations concernant l'étudiant 1: " + etud1);

		// Faire la même chose pour tous les étudiants et vérifier que les données sont
		// correctes
		System.out.println("Informations concernant l'étudiant 2: " + etud2);
		System.out.println("Informations concernant l'étudiant 3: " + etud3);
		System.out.println("Informations concernant l'étudiant 4: " + etud4);
		System.out.println("Informations concernant l'étudiant 5: " + etud5);
		System.out.println("Informations concernant l'étudiant 6: " + etud6);
		System.out.println("Informations concernant l'étudiant 8: " + etud8);

		/* Utilisation de la méthode saisie */

		// // Créer un nouvel étudiant etud7 grace au constructeur vide
		Etudiant etud7 = new Etudiant();
		//
		// // Ouvrir le scanner
		Scanner sc = new Scanner(System.in);
		//
		// // Utiliser la méthode saisie définie dans la classe Etudiant sur l'étudiant
		// // etud7 (vous choisissez les valeurs)
		etud7.saisie(sc);
		//
		// // Vérifier grâce à la méthode toString que les informations concernant etud7
		// // ont bien été initialisées
		System.out.println("Informations concernant l'étudiant 7: " + etud7);

		/* Utilisation de la méthode moyenne */

		// Calcul et affichage de la moyenne de Paul-Henri. A décommenter pour exemple

		System.out.println("la moyenne de Paul-Henri est: " + etud1.moyenne());

		// Ecrire ci dessous le code pour calculer et afficher la moyenne des autres
		// étudiants
		System.out.println("la moyenne de Jean est: " + etud2.moyenne());
		System.out.println("la moyenne d'Abdoulkhader est: " + etud3.moyenne());
		System.out.println("la moyenne d'Astrid est: " + etud4.moyenne());
		System.out.println("la moyenne de Paolo est: " + etud5.moyenne());
		System.out.println("la moyenne de Zoé est: " + etud6.moyenne());
		System.out.println("la moyenne de " + etud7.getNom() + " est: " + etud7.moyenne());

		/*
		 * Utilisation de la méthode mention pour chaque étudiant. Code à écrire
		 * ci-dessous
		 */
		System.out.println("Mention de Paul-Henri : " + etud1.mention());
		System.out.println("Mention de Jean : " + etud2.mention());
		System.out.println("Mention d'Abdoulkhader : " + etud3.mention());
		System.out.println("Mention d'Astrid : " + etud4.mention());
		System.out.println("Mention de Paolo : " + etud5.mention());
		System.out.println("Mention de Zoé : " + etud6.mention());
		System.out.println("Mention de " + etud7.getNom() + " : " + etud7.mention());

		/*
		 * Utilisation de la méthode ligneResultat pour chaque étudiant. Code à écrire
		 * ci-dessous
		 */
		System.out.println(etud1.ligneResultat());
		System.out.println(etud2.ligneResultat());
		System.out.println(etud3.ligneResultat());
		System.out.println(etud4.ligneResultat());
		System.out.println(etud5.ligneResultat());
		System.out.println(etud6.ligneResultat());
		System.out.println(etud7.ligneResultat());

		// Création d'une promotion et test des méthodes associées

		Promotion prom1 = new Promotion(2021, "promotion 2021");
		prom1.inscrire(etud1);
		prom1.inscrire(etud2);
		prom1.inscrire(etud3);
		prom1.inscrire(etud4);
		prom1.inscrire(etud5);
		prom1.inscrire(etud6);
		prom1.inscrire(etud7);
		prom1.inscrire(etud8);

		System.out.println("Liste des étudiants de la promotion 1 : " + prom1.afficheEtudiants());
		System.out.println("Nombre d'étudiants de la promotion 1 : " + prom1.nbEtudiants());
		System.out.println("3ème étudiant inscrit dans la promotion 1 : " + prom1.getEtudiant(2));
		System.out.println("Moyenne générale de la promotion 1 : " + prom1.moyenneGénérale());
		System.out.println("Résultats des étudiants de la promotion 1 : \n   " + prom1.afficheResultats());
		System.out.println("Recherche de l'étudiant Jean dans la promotion 1 : \n  Etudiant trouvé : " + prom1.recherche("Jean"));
		
		System.out.println("Liste des étudiants admis de la promotion 1 : ");
		for (Etudiant e : prom1.listeAdmis()) {
			System.out.println("\t" + e.getNom() + " - " + e.moyenne() + ";");
		}

		System.out.println("Major de la promotion 1 : " + prom1.major());
		System.out.println("Majors de la promotion 1 : ");
		for (Etudiant e : prom1.majors()) {
			System.out.println("\t" + e.getNom() + " - " + e.moyenne() + ";");
		}
		
		System.out.println("Etudiants non francophones et nouvellement inscrits : ");
		System.out.println("  Nombre : " + prom1.nouveauxInscritsNonFrancophones().size());
		for (Etudiant e : prom1.nouveauxInscritsNonFrancophones()) {
			System.out.println("  Informations sur " + e.getNom() + " : " + e.getInscription().toString());
		}
		
		System.out.println("Histogramme des moyennes : " + prom1.histogramme());
	}

}
