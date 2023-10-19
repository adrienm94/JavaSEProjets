package tpPoste;

public class MainObjetPostal {

	public static void main(String[] args) {

		// Création d'objets postaux (si ObjetPostal n'est pas une class abstraite)

//		ObjetPostal o1 = new ObjetPostal();
//		ObjetPostal o2 = new ObjetPostal("lieu1", "lieu2", "00000", 5.0, 0.5, TauxRecommandation.valueOf("deux"));
//		System.out.println(o1);
//		System.out.println(o2);

		// Création de lettres
		Lettre l1 = new Lettre("Montpellier", "Kouk, igloo 2, banquise nord", "00002", 2.0, 0.5,
				TauxRecommandation.valueOf("un"), "ordinaire");
		Lettre l2 = new Lettre("Montpellier", "Sbouk, igloo 8, banquise nord", "00008", 1.0, 0.1,
				TauxRecommandation.valueOf("deux"), "urgente");
		System.out.println(l1);
		System.out.println(l2);

		// Création de colis
		Colis c1 = new Colis("Montpellier", "Miko, igloo 2, banquise ouest", "00012", 3.5, 0.6,
				TauxRecommandation.valueOf("un"), "haltères", 50.5);
		Colis c2 = new Colis("Montpellier", "Frodok, hangar 200, terres ouest", "10200", 60, 1,
				TauxRecommandation.valueOf("deux"), "table", 299.99);
		System.out.println(c1);
		System.out.println(c2);

		// Test de la méthode tarifAffranchissement
//		System.out.println(o1.tarifAffranchissement());
//		System.out.println(o2.tarifAffranchissement());
		System.out.println(l1.tarifAffranchissement());
		System.out.println(l2.tarifAffranchissement());
		System.out.println(c1.tarifAffranchissement());
		System.out.println(c2.tarifAffranchissement());
		
		// Test de la méthode tarifRemboursement
//		System.out.println(o1.tarifRemboursement());
//		System.out.println(o2.tarifRemboursement());
		System.out.println(l1.tarifRemboursement());
		System.out.println(l2.tarifRemboursement());
		System.out.println(c1.tarifRemboursement());
		System.out.println(c2.tarifRemboursement());

		// Test Sac Postal
		SacPostal s1 = new SacPostal(3.0);
		s1.ajoutObjet(l1);
		s1.ajoutObjet(l2);
		s1.ajoutObjet(c1);
		s1.ajoutObjet(c2);
		System.out.println(s1);
		System.out.println(s1.volumeOccupe());
		System.out.println(s1.valeurRemboursement());
		System.out.println(s1.sacAvecMemeCodePostal("00002"));
		
	}

}
