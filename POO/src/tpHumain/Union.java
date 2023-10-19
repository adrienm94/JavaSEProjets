package tpHumain;

import java.util.Date;

public class Union {

	private Date dateUnion;
	private String lieuUnion = "lieu inconnu";
	private Humain témoinPrincipal1;
	private Humain témoinPrincipal2;
	private TypeContrat typeContrat;

	public Union() {

	}

	public Union(Date dateUnion, String lieuUnion, Humain témoinPrincipal1, Humain témoinPrincipal2, Humain conjoint1, Humain conjoint2,
			TypeContrat typeContrat) {
		this.dateUnion = dateUnion;
		this.lieuUnion = lieuUnion;
		this.setTémoinPrincipal1(témoinPrincipal1);
		this.setTémoinPrincipal2(témoinPrincipal2);
		this.typeContrat = typeContrat;
	}

	public Date getDateUnion() {
		return this.dateUnion;
	}

	public void setDateUnion(Date dateUnion) {
		this.dateUnion = dateUnion;
	}

	public String getLieuUnion() {
		return this.lieuUnion;
	}

	public void setLieuUnion(String lieuUnion) {
		this.lieuUnion = lieuUnion;
	}


	public TypeContrat getTypeContrat() {
		return this.typeContrat;
	}

	public void setTypeContrat(TypeContrat typeContrat) {
		this.typeContrat = typeContrat;
	}

	public Humain getTémoinPrincipal1() {
		return this.témoinPrincipal1;
	}

	public void setTémoinPrincipal1(Humain témoinPrincipal1) {
		this.témoinPrincipal1 = témoinPrincipal1;
	}

	public Humain getTémoinPrincipal2() {
		return this.témoinPrincipal2;
	}

	public void setTémoinPrincipal2(Humain témoinPrincipal2) {
		this.témoinPrincipal2 = témoinPrincipal2;
	}

	@Override
	public String toString() {
		return "Union [dateUnion=" + this.dateUnion + ", lieuUnion=" + this.lieuUnion + ", témoinPrincipal1=" + this.témoinPrincipal1
				+ ", témoinPrincipal2=" + this.témoinPrincipal2 + ", typeContrat=" + typeContrat + "]";
	}



}
