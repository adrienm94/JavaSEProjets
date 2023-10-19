package genericiteSimple;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
//		FileAttente<Integer> file1 = new FileAttente<>(); 
//		FileAttente<Integer> file2 = new FileAttente<>(); 
//		
//		file1.entre(1);file1.entre(2);file1.entre(3);file1.sort();
//		file2.entre(1);file2.entre(2);file2.entre(3);
//		
//		System.out.println(file1.estVide());
//		System.out.println(file1.nbElements());
//		System.out.println(file1);
//		
//		System.out.println(FileAttente.getNbEntreesTotal());
//		System.out.println(FileAttente.memeObjets(file1, file2));
//		System.out.println(file1.memeObjetsNonStatic(file2));
//		System.out.println(file1.memeLongueur(file2));
		
		PaireEtiquetee<String, Integer, String> p1 = new PaireEtiquetee<>("a", 1, "première lettre de l'alphabet");
		PaireEtiquetee<String, String, Integer> p2 = new PaireEtiquetee<>("chiffre", "zéro", 0);
		
		PaireHomogene<String> p3 = new PaireHomogene<>("TVA", "20%");
		PaireHomogene<String> p4 = new PaireHomogene<>("Remise", "10%");
		
		EntreeAgenda e1 = new EntreeAgenda(new Date(), "cours");
		EntreeAgenda e2 = new EntreeAgenda(new Date(), "cours2");
		
		EtiquetteBouteille eb1 = new EtiquetteBouteille(14.5, "Eugène Moustache", "1 rue de la barbe", "Vin Grand Cru 2023", 1.5);
		BouteilleEtiquetee<String> b1 = new BouteilleEtiquetee<>("bouteille n°1", "eau");
		BouteilleEtiquetee<EtiquetteBouteille> b2 = new BouteilleEtiquetee<>("bouteille n°2", eb1);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(b1);
		System.out.println(b2);
		
		
	}

}
