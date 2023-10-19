package tpPoste;

public class Colis extends ObjetPostal {

	private String contenu;
	private double valeurEnEuros;

	public Colis() {
		super();
	}

	public Colis(String origine, String destination, String codePostal, double poids, double volume,
			TauxRecommandation tauxRecommandation, String contenu, double valeurEnEuros) {
		super(origine, destination, codePostal, poids, volume, tauxRecommandation);
		this.setContenu(contenu);
		this.setValeurEnEuros(valeurEnEuros);
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public double getValeurEnEuros() {
		return this.valeurEnEuros;
	}

	public void setValeurEnEuros(double valeurEnEuros) {
		this.valeurEnEuros = valeurEnEuros;
	}

	@Override
	public double tarifAffranchissement() {
		double tarifA = super.tarifAffranchissement();
		if (this.getVolume() > 1.0 / 8.0) {
			tarifA += 3.0;
		}
		return tarifA;
	}

	public double tarifRemboursement() {
		double tarifR = 0.;
		if (this.getTauxRecommandation().equals(TauxRecommandation.un)) {
			tarifR += 0.1 * this.valeurEnEuros;
		} else if (this.getTauxRecommandation().equals(TauxRecommandation.deux)) {
			tarifR += 0.5 * this.valeurEnEuros;
		}
		return tarifR;
	}
	
	public double tarifBase() {
		return 2.0;
	}

	@Override
	public String toString() {
		return "Colis [contenu=" + contenu + ", valeurEnEuros=" + valeurEnEuros + ", toString()=" + super.toString()
				+ "]";
	}

}
