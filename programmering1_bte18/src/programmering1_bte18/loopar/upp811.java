package programmering1_bte18.loopar;

import javax.swing.JOptionPane;

public class upp811 {

	public static void main(String[] arg) {

		int antalanst�llda = 0;
		int summmal�n = 0;

		boolean loop = true;
		do {

			String sval = JOptionPane.showInputDialog("1: statistik \n 2: mata in nya uppgifter \n 3: avsluta");
			System.out.println(sval);

			switch (sval) {

			case "1":
				if (summmal�n!=0  && antalanst�llda!=0) {
				int medell�n = summmal�n / antalanst�llda;

				JOptionPane.showMessageDialog(null, "antal:" + antalanst�llda + "medell�n" + medell�n);

				}else {
					int medell�n=0;
					JOptionPane.showMessageDialog(null, "antal:" + antalanst�llda + "medell�n" + medell�n);

				}


				break;
			case "2":

				int i = JOptionPane.showConfirmDialog(null, "har du ant�llt en ny person");

				if (i == 0) {

					antalanst�llda++;
					summmal�n += Integer.parseInt(JOptionPane.showInputDialog("l�n"));
				}

				break;
			case "3":
				loop = false;
				System.out.println("false");
				break;
			default:
				System.out.println("default");
			}

		} while (loop);
	}
}