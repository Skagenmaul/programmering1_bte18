package programmering1_bte18.loopar;

public class looptest1 {

	public static void main(String[] args) {

		int summa = 1;
		int l�n = 1;
		int dagar = 0;

		while (summa <= 1000000) {

			l�n = l�n * 2;

			summa = summa + l�n;
			System.out.println(summa);
			dagar++;
		}

		System.err.println(summa + "efter " + dagar + "dagar");

	}

}
