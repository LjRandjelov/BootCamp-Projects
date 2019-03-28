package uredjaji;

public class Laptop extends Uredjaj {
	private int ramMemorija;
	private String modelProcesora;

	public Laptop(int uid, boolean stanje) {
		super(uid, stanje);
		this.ramMemorija = 0;
		this.modelProcesora = "";
	}

	public Laptop(int uid, int ramMemorija, String modelProcesora) {
		super(uid);
		this.ramMemorija = ramMemorija;
		this.modelProcesora = modelProcesora;
	}

	public int getRamMemorija() {
		return this.ramMemorija;
	}

	public void setRamMemorija(int ramMemorija) {
		this.ramMemorija = ramMemorija;
	}

	public String getModelProcesora() {
		return this.modelProcesora;
	}

	public void setModelProcesora(String modelProcesora) {
		this.modelProcesora = modelProcesora;
	}

	@Override
	public String toString() {
		{
			if (this.stanje == true)
				x = "ON";
			else
				x = "OFF";
		}
		return "Laptop (" + +this.getUid() + ": " + x + ")[" + this.getRamMemorija() + "GB, " + this.modelProcesora
				+ "]";
	}

}
