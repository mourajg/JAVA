>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício2 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Valor 1: ");
		int valor1 = in.nextInt ();
		System.out.println ("Valor 2: ");
		int valor2 = in.nextInt ();
		if (valor1 == valor2) {
			System.out.println ("Os valores são iguais!");
		} else {
		}
		if (valor1 > valor2) {
			System.out.printf ("O valor %s é maior.", valor1);
			System.out.printf ("\nO valor %s é menor.", valor2);
		} else {
			System.out.printf ("O valor %s é maior.", valor2);
			System.out.printf ("\nO valor %s é menor.", valor1);
		}
	}
}
>>>
