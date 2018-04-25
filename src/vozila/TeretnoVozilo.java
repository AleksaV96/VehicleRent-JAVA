package vozila;

import ostalo.Gorivo;

public class TeretnoVozilo extends Vozilo {
	
	private int nosivost;
	private double visina;
	
	public TeretnoVozilo(int regBroj, double potrosnja, int cenaIznajmljivanja, int cenaServisa, int servisnaKilometraza, int brojSedista, int brojVrata, Gorivo gorivo, int nosivost, double visina) {
		super(regBroj, potrosnja, cenaIznajmljivanja, cenaServisa, servisnaKilometraza, brojSedista, brojVrata, gorivo);
		this.nosivost = nosivost;
		this.visina = visina;
	}
}
