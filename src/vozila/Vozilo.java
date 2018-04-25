package vozila;
import java.util.ArrayList;

import ostalo.Gorivo;
import ostalo.Servis;

public abstract class Vozilo {
	
	private int regBroj;
	private double potrosnja;
	private int kilometraza = 0;
	private int cenaIznajmljivanja;
	private int cenaServisa;
	private int servisnaKilometraza;
	private int brojSedista;
	private int brojVrata;
	private boolean naStanju = true;
	
	private Gorivo gorivo;
	private ArrayList<Servis> servisi = new ArrayList<Servis>();
	
	public Vozilo(int regBroj, double potrosnja, int cenaIznajmljivanja, int cenaServisa, int servisnaKilometraza, int brojSedista, int brojVrata, Gorivo gorivo) {
		this.regBroj = regBroj;
		this.potrosnja = potrosnja;
		this.cenaIznajmljivanja = cenaIznajmljivanja;
		this.cenaServisa = cenaServisa;
		this.servisnaKilometraza = servisnaKilometraza;
		this.brojSedista = brojSedista;
		this.brojVrata = brojVrata;
		this.gorivo = gorivo;
	}
	
	public void dodajServis(Servis s) {
		this.getServisi().add(s);
	}

	public int getRegBroj() {
		return regBroj;
	}

	public void setRegBroj(int regBroj) {
		this.regBroj = regBroj;
	}

	public double getPotrosnja() {
		return potrosnja;
	}

	public void setPotrosnja(double potrosnja) {
		this.potrosnja = potrosnja;
	}

	public int getKilometraza() {
		return kilometraza;
	}

	public void setKilometraza(int kilometraza) {
		this.kilometraza = kilometraza;
	}

	public int getCenaIznajmljivanja() {
		return cenaIznajmljivanja;
	}

	public void setCenaIznajmljivanja(int cenaIznajmljivanja) {
		this.cenaIznajmljivanja = cenaIznajmljivanja;
	}

	public int getCenaServisa() {
		return cenaServisa;
	}

	public void setCenaServisa(int cenaServisa) {
		this.cenaServisa = cenaServisa;
	}

	public int getBrojSedista() {
		return brojSedista;
	}

	public void setBrojSedista(int brojSedista) {
		this.brojSedista = brojSedista;
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}

	public boolean isNaStanju() {
		return naStanju;
	}

	public void setNaStanju(boolean naStanju) {
		this.naStanju = naStanju;
	}

	public Gorivo getGorivo() {
		return gorivo;
	}

	public void setGorivo(Gorivo gorivo) {
		this.gorivo = gorivo;
	}

	public ArrayList<Servis> getServisi() {
		return servisi;
	}

	public void setServisi(ArrayList<Servis> servisi) {
		this.servisi = servisi;
	}

	public int getServisnaKilometraza() {
		return servisnaKilometraza;
	}

	public void setServisnaKilometraza(int servisnaKilometraza) {
		this.servisnaKilometraza = servisnaKilometraza;
	}

	
}
