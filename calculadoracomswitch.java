>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class calculadora {
	public static void menu () {
		System.out.println ("MENU");
		System.out.println ("1 - Somar");
		System.out.println ("2 - Subtrair");
		System.out.println ("3 - Multiplicar");
		System.out.println ("4 - Dividir");
	}
	// Função somar.
	public static void somar () {
		Scanner in = new Scanner (System.in);
		double soma;
		System.out.println ("Valor 1: ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2: ");
		double valor2 = in.nextDouble ();
		soma = valor1 + valor2;
		System.out.println ("valor 1 + valor 2 = " + soma);
	}
	// Função subtrair.
	public static void subtrair () {
		Scanner in = new Scanner (System.in);
		double subtração;
		System.out.println ("Valor 1: ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2: ");
		double valor2 = in.nextDouble ();
		subtração = valor1 - valor2;
		System.out.println ("valor 1 - valor 2 = " + subtração);
	}
	// Função multiplicar.
	public static void multiplicar () {
		Scanner in = new Scanner (System.in);
		double multiplicação;
		System.out.println ("Valor 1: ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2: ");
		double valor2 = in.nextDouble ();
		multiplicação = valor1 * valor2;
		System.out.println ("valor 1 * valor 2 = " + multiplicação);
	}
	// Função dividir.
	public static void dividir () {
		Scanner in = new Scanner (System.in);
		double divisão;
		System.out.println ("Valor 1: ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2: ");
		double valor2 = in.nextDouble ();
		divisão = valor1 / valor2;
		System.out.println ("valor 1 / valor 2 = " + divisão);
	}
	public static void main (String [] args) {
		int x;
		Scanner in = new Scanner (System.in);
		do {
			menu ();
			x = in.nextInt ();
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
					System.out.println ("Erro!");
			}
		} while (x != 0);
	}
}
>>>
