package drum;

public class GlavniDrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vozac v1 = new Vozac (" Petar Petrovic");
		
		v1.setBrVozacke("12345");
		
		Automobili a1 = new Automobili  ("000123");
		a1.setSnaga(200);
		a1.setVozac(v1);
	
		
				
		System.out.println(a1);
	}

}
