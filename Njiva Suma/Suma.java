package domacMart8;

public class Suma extends Parcela {
	private double povrsStabla;
	private double prinosZS;
	private int periodS;

	public Suma(double povrsina, double povrsStabla, double prinosZS, int periodS) {
		super(povrsina);
		this.prinosZS = prinosZS;
		this.periodS = periodS;
		this.povrsStabla = povrsStabla;

	}

	@Override
	public char getVrsta() {
		return 'S';
	}

	@Override
	public double prinos(int godine) {
		return this.getPovrsina() / this.povrsStabla * this.prinosZS * (this.periodS * godine);
	}

	@Override
	public String toString() {
		return super.toString() + ":(" + this.povrsStabla + ", " + this.prinosZS + ", " + this.periodS + ")";
	}
}