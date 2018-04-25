package vozila;

import ostalo.Gorivo;

public class PutnickoVozilo extends Vozilo {
	
	public PutnickoVozilo(int regBroj, double potrosnja, int cenaIznajmljivanja, int cenaServisa, int servisnaKilometraza, int brojSedista, int brojVrata, Gorivo gorivo) {
		super(regBroj, potrosnja, cenaIznajmljivanja, cenaServisa, servisnaKilometraza, brojSedista, brojVrata, gorivo);
	}
}
