package programmering1_bte18.loopar;

public class looptest1 {

	public static void main(String[] args) {

		int summa = 1; // deklarerar en variabel samt initsierar den
		int l�n = 1;
		int dagar = 0;

		while (summa <= 1000000) { // s� l�nge som summan �r mindre eller lika med en miljon

			l�n = l�n * 2;  // l�nen dubblas

			summa = summa + l�n;  // f�rm�genhet + l�n = summa
			System.out.println(summa);
			dagar++;
		}

		System.err.println(summa + "efter " + dagar + "dagar");

	}

}
