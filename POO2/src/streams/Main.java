package streams;

//import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args){

		Personne p1 = new Personne("Edith", "Mulot", 1965);
		Personne p2 = new Personne("Jean", "Dupont", 1985);
		Personne p3 = new Personne("Marie", "Dupont", 1980);
		Personne p4 = new Personne("Eric", "Martin", 1994);
		Personne p5 = new Personne("Jean", "Valais", 1989);

		LinkedList<Personne> liste = new LinkedList<>();
		liste.add(p1);
		liste.add(p2);
		liste.add(p3);
		liste.add(p4);
		liste.add(p5);

		Stream<Personne> streamTab = liste.stream();

		// Nom des personnes nées après 1985
		System.out.println("Nom des personnes nées après 1985 :");
		streamTab.filter(p -> p.getAnnee() > 1985).map(p -> p.getNom())
				.forEach(p -> System.out.println(p));

		// Nom des personnes nées avant 2000, triés par ordre alphabétique sur leurs nom
//		System.out.println(
//				"Nom des personnes nées avant 2000, triés par ordre alphabétique sur leurs nom + leur nombre :");
//		long nombre = streamTab.filter(p -> p.getAnnee() < 2000).sorted(Comparator.comparing(Personne::getNom)).peek(p -> System.out.println(p.getNom())).count();
//		System.out.println("Ils sont " + nombre);
		//		OU
//		streamTab.filter(p -> p.getAnnee() < 2000).map(p -> p.getNom()).sorted()
//		.forEach(p -> System.out.println(p.getNom()));
//		streamTab.filter(p -> p.getAnnee() < 2000).map(p -> p.getNom()).sorted().count();

		// Nom et prénom des personnes, triés par ordre alphabétique sur leurs nom et
		// leur prénom
//		System.out.println("Nom et prénom des personnes, triés par ordre alphabétique sur leurs nom et leur prénom :");
//		streamTab.map(p -> p.getPrenom() + " " + p.getNom()).sorted().forEach(p -> System.out.println(p));

	}

}
