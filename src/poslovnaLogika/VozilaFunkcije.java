package poslovnaLogika;

import java.util.ArrayList;

import ostalo.Gorivo;
import ostalo.Servis;
import vozila.Bicikl;
import vozila.Vozilo;

public class VozilaFunkcije {
	
	public static int TroskoviPuta(Vozilo v, int km) {
		
		if(v.getClass() == Bicikl.class) {
			return km/60 * 10;
		}
		else {
			
			Gorivo g = v.getGorivo();
			return (int)v.getPotrosnja() / 100 * km * g.getCena();
		}
	}
	
	public static void SledeciServis(Vozilo v, int predjeniPut) {
		ArrayList<Servis> servisi = v.getServisi();
		Servis poslednjiServis = servisi.get(servisi.size() - 1);
		
		if(v.getKilometraza() - poslednjiServis.getBrojPredjenihKm() >= v.getServisnaKilometraza()) {
			System.out.println("Vozilo je potrebno poslati na serivs");
		}
		else {
			int kilometrazaDoServisa = v.getServisnaKilometraza() % (v.getKilometraza() - poslednjiServis.getBrojPredjenihKm());
			System.out.println("Vozilu ce biti potreban servis za " + kilometrazaDoServisa + " km");
		}
	}
	
	
}
