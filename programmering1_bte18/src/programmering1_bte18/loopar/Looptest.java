package programmering1_bte18.loopar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Looptest {

	public static void main(String[] args) {

		int[] tal = new int[5]; // skapar array

		for (int i = 0; i < 5; i++) {  // loopar 5 varv 0-4

			String s = JOptionPane.showInputDialog("ange ett tal");// l�ser in 5 tal och lagrar tillf�lligt

			tal[i] = Integer.parseInt(s); //omvandlar till int

		}


		int st�rstatalet = Integer.MIN_VALUE; // skapar variabel med l�gt v�rde
		int k = 0; // skapar r�knare
		while (k < 5) {

			if (tal[k] > st�rstatalet) {
				st�rstatalet = tal[k];
			}
			k++;
		}









		int minstatalet = Integer.MAX_VALUE; // skapar variabel med l�gt v�rde
		 k = 0; // skapar r�knare
		while (k < 5) {

			if (tal[k] < minstatalet) {
				minstatalet = tal[k];
			}
			k++;
		}

		System.out.println(Arrays.toString(tal) + "st�rstatalet �r " + st�rstatalet+" mintalet �r "+minstatalet);

	}
}
