package tpPoste;

public abstract class ObjetPostal {

	private String origine = "origine inconnue";
	private String destination = "destination inconnue";
	private String codePostal = "code postal inconnu";
	private double poids; // en kilos
	private double volume; // en mètres cube
	private TauxRecommandation tauxRecommandation = TauxRecommandation.zero; // zero, un ou deux

	public ObjetPostal() {

	}

	public ObjetPostal(String origine, String destination, String codePostal, double poids, double volume,
			TauxRecommandation tauxRecommandation) {
		this.setOrigine(origine);
		this.setDestination(destination);
		this.setCodePostal(codePostal);
		this.setPoids(poids);
		this.setVolume(volume);
		this.setTauxRecommandation(tauxRecommandation);
	}

	public String getOrigine() {
		return this.origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public double getPoids() {
		return this.poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getVolume() {
		return this.volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public TauxRecommandation getTauxRecommandation() {
		return this.tauxRecommandation;
	}

	public void setTauxRecommandation(TauxRecommandation tauxRecommandation) {
		this.tauxRecommandation = tauxRecommandation;
	}

	public double tarifAffranchissement() {
		double tarifA = this.tarifBase();
		if (this.tauxRecommandation.equals(TauxRecommandation.un)) {
			tarifA += 0.5;
		} else if (this.tauxRecommandation.equals(TauxRecommandation.deux)) {
			tarifA += 1.5;
		}
		return tarifA;

	}

	public abstract double tarifRemboursement();
	
	public abstract double tarifBase();

	@Override
	public String toString() {
		return "ObjetPostal [origine=" + this.origine + ", destination=" + this.destination + ", codePostal="
				+ this.codePostal + ", poids=" + this.poids + ", volume=" + this.volume + ", tauxRecommandation="
				+ this.tauxRecommandation + "]";
	}

}
