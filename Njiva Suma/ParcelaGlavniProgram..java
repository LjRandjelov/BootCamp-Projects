package domacMart8;

public class ParcelaGlavniProgram {

	public static void main(String[] args) {

		Parcela[] parcela = new Parcela[5];

		Parcela n1 = new Njiva(100, 5);
		parcela[0] = n1;
		Parcela n2 = new Njiva(45, 5);
		parcela[1] = n2;
		Parcela s1 = new Suma(120, 2, 5, 4);
		parcela[2] = s1;

		Parcela s2 = new Suma(150, 1, 5, 3);
		parcela[3] = s2;

		for (int i = 0; i < parcela.length; i++) {
			if (parcela[i] == null)
				continue;
			System.out.println(parcela[i].prinos(3) + "  " + parcela [i].toString());

		}
	}
}
