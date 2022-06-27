>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class CALCULADORA1 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double a, s, m, d;
            	System.out.println ("Valor 1:  ");
            	double valor1 = in.nextDouble ();
            	System.out.println ("Valor 2:  ");
           	double valor2 = in.nextDouble ();
		a = valor1 + valor2; // Adição.
		s = valor1 - valor2; // Subtração.
		m = valor1 * valor2; // Multiplicação.
		d = valor1 / valor2; // Divisão.
		System.out.println ("valor 1 + valor 2 = " + a);
		System.out.println ("valor 1 - valor 2 = " + s);
		System.out.println ("valor 1 * valor 2 = " + m);
		System.out.println ("valor 1 / valor 2 = " + d);
	}
}
>>>
