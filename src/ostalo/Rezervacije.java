package ostalo;

import java.util.Date;
import osobe.Iznajmljivac;
import vozila.Vozilo;

public class Rezervacije {
	
	private Iznajmljivac iznajmljivac;
	private Vozilo vozilo;
	private int cena;
	private Date datumIznajmljivanja;
	private Date datumKrajaRezervacije;
	private boolean validna = true;
	
	public Rezervacije(Iznajmljivac iznajmljivac, Vozilo vozilo, int cena, Date datumIznajmljivanja, Date datumKrajaRezervacije) {
		this.iznajmljivac = iznajmljivac;
		this.vozilo = vozilo;
		this.cena = cena;
		this.datumIznajmljivanja = datumIznajmljivanja;
		this.datumKrajaRezervacije = datumKrajaRezervacije;
	}

	public Iznajmljivac getIznajmljivac() {
		return iznajmljivac;
	}

	public void setIznajmljivac(Iznajmljivac iznajmljivac) {
		this.iznajmljivac = iznajmljivac;
	}

	public Vozilo getVozilo() {
		return vozilo;
	}

	public void setVozilo(Vozilo vozilo) {
		this.vozilo = vozilo;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public Date getDatumIznajmljivanja() {
		return datumIznajmljivanja;
	}

	public void setDatumIznajmljivanja(Date datumIznajmljivanja) {
		this.datumIznajmljivanja = datumIznajmljivanja;
	}

	public Date getDatumKrajaRezervacije() {
		return datumKrajaRezervacije;
	}

	public void setDatumKrajaRezervacije(Date datumKrajaRezervacije) {
		this.datumKrajaRezervacije = datumKrajaRezervacije;
	}

	public boolean isValidna() {
		return validna;
	}

	public void setValidna(boolean validna) {
		this.validna = validna;
	}
	
}
