package programmering1_bte18;

import javax.swing.JOptionPane;

public class �vn23 {

	public static void main(String[] args) {

		String �lderString = JOptionPane.showInputDialog("ange din �lder");

		int age = Integer.parseInt(�lderString);

		double d = age / 10.0;

		int i = (int) d;

		int j�mt = i * 10 + 10;

		int kvar = j�mt - age;

		JOptionPane.showMessageDialog(null, "du fyller " + j�mt + "om" + kvar);

	}

}
