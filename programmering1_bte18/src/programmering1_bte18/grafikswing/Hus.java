package programmering1_bte18.grafikswing;

public class Hus {   // klass hus

	private boolean d�rr = false;  // instansvariabel f�r d�rr

	private int x = 0; // instansvariabel x led
	private int y = 0; // instansvariabel y led
	private int z = 0;  // instansvariabel z led

	public Hus(int xx, int yy, int zz, boolean d) {   //  konstruktor med 4 st inparametrar

		x = xx;  //  tar emot v�rdet fr�n skapadet av objektet och l�gger in det i instansvarabeln
		y = yy;   //  tar emot v�rdet fr�n skapadet av objektet och l�gger in det i instansvarabeln
		z = zz;  //  tar emot v�rdet fr�n skapadet av objektet och l�gger in det i instansvarabeln

		d�rr = d; //  tar emot v�rdet fr�n skapadet av objektet och l�gger in det i instansvarabeln

	}

	/*
	 * skriver ut egenskaperna f�r huset allts� dess instansvariabler.
	 *
	 */

	public  void printhus() {

		System.out.println("x="+x+"y="+y+"z="+z+"d�rr="+d�rr);
	}

	public static void main(String[] args) {

		Hus h1=new Hus(10, 20, 40, true); // skapar ett objekt och lagrar en referens till objektet i h1 samt skickar in inparametrar

		h1.printhus(); // anropar instansmetoden p� objektet h1 .

		Hus h2= new Hus(20,20,20,true);

		h2.printhus();




	}

}
