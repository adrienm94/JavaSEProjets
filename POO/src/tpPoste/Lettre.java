package tpPoste;

public class Lettre extends ObjetPostal {

	private String priorite = "inconnue";

	public Lettre() {
		super();
	}

	public Lettre(String origine, String destination, String codePostal, double poids, double volume,
			TauxRecommandation tauxRecommandation, String priorite) {
		super(origine, destination, codePostal, poids, volume, tauxRecommandation);
		this.setPriorite(priorite);
	}

	public String getPriorite() {
		return this.priorite;
	}

	public void setPriorite(String priorite) {
		if (priorite.equals("urgente") || priorite.equals("ordinaire")) {
			this.priorite = priorite;
		}
	}

	@Override
	public double tarifAffranchissement() {
		double tarifA = super.tarifAffranchissement();
		if (this.priorite.equals("urgente")) {
			tarifA += 0.3;
		}
		return tarifA;
	}

	public double tarifRemboursement() {
		double tarifR = 0.;
		if (this.getTauxRecommandation().equals(TauxRecommandation.un)) {
			tarifR += 1.5;
		} else if (this.getTauxRecommandation().equals(TauxRecommandation.deux)) {
			tarifR += 15.;
		}
		return tarifR;
	}

	public double tarifBase() {
		return 0.5;
	}
	
	@Override
	public String toString() {
		return "Lettre [priorite=" + this.priorite + ", toString()=" + super.toString() + "]";
	}

}
