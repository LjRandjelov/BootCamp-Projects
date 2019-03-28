package uredjaji;

public class Uredjaj {
	protected boolean stanje;
	private int uid;
	public static String x;

	public Uredjaj(int uid) {
		this.stanje = false;
		this.uid = uid;
	}

	public Uredjaj(int uid, boolean stanje) {
		this.stanje = stanje;
		this.uid = uid;
	}

	public boolean getStanje() {
		return this.stanje;
	}

	public void setStanje(boolean stanje) {
		this.stanje = stanje;
	}

	public int getUid() {
		return this.uid;
	}

	@Override
	public String toString() {
		{
			if (this.stanje == true)
				x = "ON";
			else
				x = "OFF";
		}
		return "Uredjaj (" + getUid() + ": " + x + ")";

	}

}

