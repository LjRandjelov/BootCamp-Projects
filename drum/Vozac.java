package drum;

public class Vozac {
	private String imeP;
	private String brVozacke;

	public Vozac(String imeP) {

		this.imeP = imeP;
		this.brVozacke = " ";
	}

	public String getImeP() {
		return imeP;
	}

	public String getBrVozacke() {
		return brVozacke;
	}

	public void setBrVozacke(String brVozacke) {
		this.brVozacke = brVozacke;
	}

	@Override
	public String toString() {
		
		return this.getImeP() + " { " + this.getBrVozacke() + " }";
	}

}
