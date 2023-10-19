package tpHumain;

import java.util.Date;

public class MainHumain {

	public static void main(String[] args) {
		Humain h1 = new Humain("Jean", 25, Genre.valueOf("homme"));
		Humain h2 = new Humain("Caroline", 17, Genre.valueOf("femme"));
		Humain h3 = new Humain("Frédéric", 31, Genre.valueOf("intergenre"));
		Humain h4 = new Humain("Ludivine", 21, Genre.valueOf("intergenre"));

		// Infos humains créés
		System.out.println(h1);System.out.println(h2);System.out.println(h3);
		System.out.println();

		// Tests méthodes de type retour boolean
		System.out.println(h1.estMajeur());System.out.println(h2.estMajeur());System.out.println(h3.estMajeur());
		System.out.println(h1.estUni());System.out.println(h2.estUni());System.out.println(h3.estUni());
		System.out.println();

		// Tests méthode sUnir()
		h1.sUnir(h3, new Date(), "lieu1", h2, h4, TypeContrat.valueOf("mariage")); //OK
//		h2.sUnir(h4); // Erreur h2 non majeur
//		h4.sUnir(h3); // Erreur h3 déjà marié
//		h4.sUnir(h4); // Erreur mariage avec soi-même
//		h4.sUnir(null); // Erreur absence de mariage
		System.out.println(h1);System.out.println(h1.estUni());

		//Tests méthode seSeparer
		h1.seSeparer(); //OK
		h2.seSeparer(); // Erreur personne non mariée
		System.out.println(h1);System.out.println(h1.estUni());
	}

}
