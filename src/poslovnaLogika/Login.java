package poslovnaLogika;

import java.util.ArrayList;
import java.util.Scanner;

import osobe.Iznajmljivac;
import osobe.Korisnik;
import osobe.Sluzbenik;

public class Login {
	
	
	public static void Log(ArrayList<Korisnik> korisnici) {
		
		boolean b = false;
		
		System.out.println("Dobrodosli u servis za iznajmljivanje vozila. Unesite vase korisnicko ime i lozinku.");
		
		while(b == false) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Korisnicko ime:");
		String username = sc.nextLine();
		System.out.println("Lozina:");
		String password = sc.nextLine();
		for(Korisnik k: korisnici) {
			if(k.getKorisnickoIme().equals(username) && k.getSifra().equals(password)) {
				b = true;
				if(k.getClass() == Sluzbenik.class) {
					Menu.MeniZaposlenog(k);
					sc.close();
				}
				else if(k.getClass() == Iznajmljivac.class) {
					Menu.KorisnickiMeni(k);
					sc.close();
				}
			}
		}
			if(b == false) {
			System.out.println("\nPogresno korisnicko ime ili lozinka\n");
			}
		}
		
		
	}
}
