package poslovnaLogika;

import java.util.Scanner;

import osobe.Korisnik;

public class Menu {
	
	public static void KorisnickiMeni(Korisnik k) {
		System.out.println("Uspesno ste se ulogovali kao iznajmljivac\n");
		System.out.println("Vas nalog: " + k.getKorisnickoIme() + "\n");
		System.out.println(k.getIme() + " " + k.getPrezime());
		System.out.println("\nMeni:\n1.) Izaberi vozilo\n2.) Napravi rezervaciju\n3.) Otkazi rezervaciju\n4.) Vrati vozilo)");
		
		Scanner sc = new Scanner(System.in);
		int opcija = sc.nextInt();
		
		switch(opcija) {
			case 1: 
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
		sc.close();
	}
	
	public static void MeniZaposlenog(Korisnik k) {
		System.out.println("Uspesno ste se ulogovali kao sluzbenik\n");
		System.out.println("Vas nalog: " + k.getKorisnickoIme() + "\n");
		System.out.println(k.getIme() + " " + k.getPrezime());
		System.out.println("\nMeni: \n1.) Dodaj vozilo\n2.) Obrisi vozilo");
		
		Scanner sc = new Scanner(System.in);
		int opcija = sc.nextInt();
		
		switch(opcija) {
			case 1:
				break;
			case 2:
				break;
		}
		sc.close();
	}
}
