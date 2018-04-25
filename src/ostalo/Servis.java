package ostalo;

import java.util.Date;
import vozila.Vozilo;

public class Servis {
	
	private Vozilo vozilo;
	private Date datum;
	private int brojPredjenihKm;
	
	public Servis(Vozilo vozilo, Date datum, int brojPredjenihKm) {
		this.vozilo = vozilo;
		this.datum = datum;
		this.brojPredjenihKm = brojPredjenihKm;
	}

	public Vozilo getVozilo() {
		return vozilo;
	}

	public void setVozilo(Vozilo vozilo) {
		this.vozilo = vozilo;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public int getBrojPredjenihKm() {
		return brojPredjenihKm;
	}

	public void setBrojPredjenihKm(int brojPredjenihKm) {
		this.brojPredjenihKm = brojPredjenihKm;
	}
	
	
	
}
