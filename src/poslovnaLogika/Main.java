package poslovnaLogika;

import java.util.ArrayList;

import osobe.Iznajmljivac;
import osobe.Korisnik;
import osobe.Sluzbenik;


public class Main {
	
	static ArrayList<Korisnik> korisnici = new ArrayList<Korisnik>();
	static Sluzbenik sluzbenik1 = new Sluzbenik("Petar", "Markovic", "PetarMar971", "444333", "3374744383994");
	static Sluzbenik sluzbenik2 = new Sluzbenik("Tesa", "Tesanovic", "TesaTes333", "123456", "1233322134567");
	static Iznajmljivac iznajmljivac1 = new Iznajmljivac("Aleksa", "Vujic", "AleksaV96", "454080", "3334433234433", "0649122627", "Srpsko");
	

	public static void main(String[] args) {
		korisnici.add(sluzbenik1);
		korisnici.add(sluzbenik2);
		korisnici.add(iznajmljivac1);
		Login.Log(korisnici);
	}

}
