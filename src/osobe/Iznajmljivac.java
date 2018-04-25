package osobe;

public class Iznajmljivac extends Korisnik {
	
	private String brojTelefona;
	private String drzavljanstvo;
	
	public Iznajmljivac(String ime, String prezime, String korisnickoIme, String sifra, String JMBG, String brojTelefona, String drzavljanstvo) {
		super(ime, prezime, korisnickoIme, sifra, JMBG);
		this.brojTelefona = brojTelefona;
		this.drzavljanstvo = drzavljanstvo;
	}	

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getDrzavljanstvo() {
		return drzavljanstvo;
	}

	public void setDrzavljanstvo(String drzavljanstvo) {
		this.drzavljanstvo = drzavljanstvo;
	}
	
	
}
