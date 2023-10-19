package tp1;

import java.util.Scanner;

public class Maintp1 {

	/********************** Partie méthodes *************************/

	/**
	 * méthode réalisant une conversion degrés Celsius vers degrés Farenheit Entrée
	 * : un nombre réel tempC passé en paramètre tempC représente une temperature
	 * exprimée en degrés Celsius Résultat : un nombre réel résultat de la
	 * conversion en degrés Farenheit Méthode : calcul de tempC * 1,8 + 32.
	 */

	public static double celsius2Farenheit(double tempC) {
		return tempC * 1.8 + 32;
	}

	/*
	 * Ci-dessous écrivez le code des autres méthodes dont la signature vous est
	 * donnée
	 */

	// moyenne(double n1, double n2, double n3) : double
	public static double moyenne(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;
	}

	// moyennePonderee(double n1, double n2, double n3, double c1, double c2, double
	// c3) : double
	public static double moyennePonderee(double n1, double n2, double n3, double c1, double c2, double c3) {
		return (n1 * c1 + n2 * c2 + n3 * c3) / (c1 + c2 + c3);
	}

	// conjugaisonFutur(String inf) : String
	public static String conjugaisonFutur(String inf) {
		return inf + "ai\n" + inf + "as\n" + inf + "a\n" + inf + "ons\n" + inf + "ez\n" + inf + "ont";
	}

	/************************ Partie Main ************************/

	/*
	 * Cette méthode main est la méthode principale Le programme commence à
	 * s'exécuter à partir de là et appelle des sous-programmes
	 */

	public static void main(String[] args) {

		/* Test de la conversion Celsius vers Farenheit */

		System.out.println("**** Test de la conversion Celsius vers Farenheit ****");

		// Cas 1 : valeur de température ordinaire en été à Montpellier

		System.out.println(
				"En été à Montpellier : 35 degrés celsius valent " + celsius2Farenheit(35) + " en degrés Farenheit");

		// Cas 2 : sur le même modèle, donner le code permettant de calculer la
		// température d'ébullition de l'eau

		System.out.println("La température d'ébullition de l'eau (100 degrés celsius) vaut " + celsius2Farenheit(100)
				+ " en degrés Farenheit");

		/* Ci-dessous vous appelerez la méthode moyenne avec les valeurs suivantes : */

		System.out.println("**** Test de la moyenne ****");

		// cas 1 : moyenne de 10, 5, 15
		System.out.println("Moyenne cas 1 : " + moyenne(10, 5, 15));

		// cas 2 : moyenne de 12, 14, 16
		System.out.println("Moyenne cas 2 : " + moyenne(12, 14, 16));

		// cas 3 : moyenne de 7, 12, 8
		System.out.println("Moyenne cas 3: " + moyenne(7, 12, 18));

		/*
		 * Ci-dessous vous appelerez la méthode moyennePonderee avec les valeurs
		 * suivantes :
		 */

		System.out.println("**** Test de la moyenne ponderee ****");

		// cas 1 : moyenne de 10, 5, 15 avec 20, 20, 60
		System.out.println("Moyenne pondérée cas 1 : " + moyennePonderee(10, 5, 15, 20, 20, 60));

		// cas 2 : moyenne de 12, 14, 16 avec 20, 20, 60
		System.out.println("Moyenne pondérée cas 2 : " + moyennePonderee(12, 14, 16, 20, 20, 60));

		// cas 3 : moyenne de 12, 14, 16 avec 30, 30, 20
		System.out.println("Moyenne pondérée cas 3 : " + moyennePonderee(12, 14, 16, 30, 30, 20));

		// cas 4 : moyenne de 7, 12, 8 avec 20, 20, 60
		System.out.println("Moyenne pondérée cas 4 : " + moyennePonderee(7, 12, 18, 20, 20, 60));

		/*
		 * Ci-dessous vous appelerez la méthode conjugueFuturPremierGroupe avec les
		 * valeurs suivantes :
		 */
		System.out.println("**** Test de conjugaisonFutur ****");

		// Cas 1 : chanter
		System.out.println("Verbe chanter :\n" + conjugaisonFutur("chanter"));

		// Cas 2 : travailler
		System.out.println("Verbe travailler :\n" + conjugaisonFutur("travailler"));

		/************************
		 * Utilisation du scanner pour entrer les valeurs
		 ************************/

		/*
		 * On crée un Scanner pour tout le programme. Il représente le flux de ce qui
		 * est saisi au clavier Instruction à décommenter pour pouvoir l'utiliser
		 */

		Scanner sc = new Scanner(System.in);

		// test de la complétion sémantique à faire ci-dessous

		// sc.nextInt();

		/*
		 * Test des précédentes méthodes en demandant à l'utilisateur de saisir une
		 * valeur au clavier
		 */

		// Conversion Celsius2Farenheit (Instructions ci-dessous à décommenter pour
		// exemple)
		System.out.println("Veuillez entrer un nombre réel représentant une température en degrés Celsius");

		double tempCelsius = sc.nextDouble();

		System.out.println(
				tempCelsius + " degrés celsius valent " + celsius2Farenheit(tempCelsius) + " en degrés Farenheit");

		// Moyenne (Ecrire le code source ci-dessous en vous inspirant de ce qui a été
		// fait pour la conversion de Celsius a Farenheit)
		System.out.println("Veuillez entrer 3 notes pour calculer la moyenne.");

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		System.out.println("La moyenne est : " + moyenne(n1, n2, n3));

		// Moyenne pondérée (Ecrire le code source ci-dessous en vous inspirant de ce
		// qui a été fait pour la conversion de Celsius a Farenheit)
		System.out.println("Veuillez entrer 3 notes et 3 coefficients pour calculer la moyenne pondérée.");

		double note1 = sc.nextDouble();
		double note2 = sc.nextDouble();
		double note3 = sc.nextDouble();
		double coef1 = sc.nextDouble();
		double coef2 = sc.nextDouble();
		double coef3 = sc.nextDouble();

		System.out.println("La moyenne pondérée est : " + moyennePonderee(note1, note2, note3, coef1, coef2, coef3));

		// Conjugaison (Ecrire le code source ci-dessous en vous inspirant de ce qui a
		// été fait pour la conversion de Celsius a Farenheit)
		System.out.println("Veuillez donner un infinitif du premier groupe à conjuguer au futur simple.");

		String inf = sc.next();

		System.out.println(conjugaisonFutur(inf));

		sc.close();

	}

}
