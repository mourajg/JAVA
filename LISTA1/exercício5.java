>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício5 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Valor 1: ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2: ");
		double valor2 = in.nextDouble ();
		if (valor1 == valor2) {
			System.out.println ("Valores iguais!");
		} else {
			System.out.println ("Valores diferentes!");
		}
		if (valor1 > valor2) {
			System.out.println ("O valor 1 é maior que o valor 2.");
		} else {
			System.out.println ("O valor 2 é maior que o valor 1.");
		}
	}
}
>>>
