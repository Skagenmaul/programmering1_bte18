package programmering1_bte18;

import javax.swing.JOptionPane;

public class bilforsakring {

	public static void main(String[] args) {

		String l = JOptionPane.showInputDialog("l�ngd p� ditt fordon");

		int l�ngd = Integer.parseInt(l);

		if (l�ngd < 6) {

			System.out.print("pris : 1000kr");

		}  if (l�ngd >= 6 && l�ngd < 10) {

			System.out.print("pris : 2000kr");

		} else {

			System.out.println("pris :3000kr ");

		}

	}

}
