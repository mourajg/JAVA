>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class CALCULADORA2 {
	public static void menu () {
		System.out.println ("MENU");
		System.out.println ("1 - Somar");
		System.out.println ("2 - Subtrair");
		System.out.println ("3 - Multiplicar");
		System.out.println ("4 - Dividir");
	}
	public static void somar () {
		double a;
		System.out.println ("Valor 1:  ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2:  ");
		double valor2 = in.nextDouble ();
		a = valor1 + valor2;
		System.out.println ("valor 1 + valor 2 = " + a);
	}
	public static void subtrair () {
		double s;
		System.out.println ("Valor 1:  ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2:  ");
		double valor2 = in.nextDouble ();
		s = valor1 - valor2;
		System.out.println ("valor 1 - valor 2 = " + s);
	}
	public static void multiplicar () {
		double m;
		System.out.println ("Valor 1:  ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2:  ");
		double valor2 = in.nextDouble ();
		m = valor1 * valor2;
		System.out.println ("valor 1 * valor 2 = " + m);
	}
	public static void dividir () {
		double d;
		System.out.println ("Valor 1:  ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2:  ");
		double valor2 = in.nextDouble ();
		d = valor1 / valor2;
		System.out.println ("valor 1 / valor 2 = " + d);
	}
}
	public static void main (String [] args) {
		int x;
		Scanner entrada = new Scanner (System.in);
		do {
			menu();
			x = entrada.nextInt ();
			switch (x) {
				case 1:
					somar ();
					break;  
				case 2:
					subtrair ();
					break;
				case 3:
					multiplicar ();
					break;
				case 4:
					dividir ();
					break;
				default:
					System.out.println("Erro!");
			}
		} while (x != 0);
	}
>>>
