package programmering1_bte18;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class upp21 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.println("ange bas");

		int bas=input.nextInt();

		System.out.println("ange h�jd");

		int h�jd=input.nextInt();

		double area=(bas*h�jd)/2.0;

		JOptionPane.showMessageDialog(null,"arean av triangeln �r" +area+ "m2");


	}




}
