package uredjaji;

public class Televizor extends Uredjaj {
	private String kanal;

	public Televizor(int uid, boolean stanje) {
		super(uid, stanje);
		if (stanje == false)
			this.kanal = "Ugasen televizor.";
		else
			this.kanal = "";
	}

	public Televizor(int uid, boolean stanje, String kanal) {
		super(uid, stanje);
		if (stanje == false)
			this.kanal = "Ugasen televizor.";
		else
			this.kanal = kanal;
	}

	public String getKanal() {
		return this.kanal;
	}

	public void setKanal(String kanal) {
		this.kanal = kanal;
	}

	@Override
	public String toString() {
		{
			if (this.stanje == true)
				x = "ON";
			else
				x = "OFF";
		}
		StringBuilder sb = new StringBuilder("Televizor");
		sb.append("(").append(this.getUid()).append(": ").append(x).append(") je na kanalu: ");
		if (this.getStanje() == false)
			sb.append("Ugasen televizor");
		else
			sb.append(this.getKanal());
		sb.append(".");
		return sb.toString();
	}

}

