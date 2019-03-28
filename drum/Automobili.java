package drum;

public class Automobili {
	private String serijskiBr;
	private int snaga;
	private Vozac vozac;
	
	
	
	public Automobili (String serijskiBr) {
		this.serijskiBr=serijskiBr;
		this.snaga = 0;
		this.vozac=null;
		
	}

	public String getSerijskiBr() {
		return serijskiBr;
	}

	
	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	@Override
	public String toString() {
		
		return this.getSerijskiBr() + " { " + this.getSnaga() + " }" +this.getVozac();
	}

	
	
}
