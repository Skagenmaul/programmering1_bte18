package programmering1_bte18;

import javax.swing.JOptionPane;

public class ovn71 {

	public static void main(String[] args) {

		String string�lder = JOptionPane.showInputDialog("ange din �lder");

		int int�lder = Integer.parseInt(string�lder);

		if (int�lder > 12) {

			System.out.println("f�r deltaga");

		} else {

			System.out.println("f�r ej deltaga");
		}

	}

}
