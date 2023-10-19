package genericiteSimple;

import java.util.Date;

public class EntreeAgenda extends Paire<Date, String>{
	
	public EntreeAgenda(Date fst, String scd) {
		super(fst, scd);
	}

	@Override
	public String toString() {
		return "EntreeAgenda : " + super.toString();
	}
	
}
