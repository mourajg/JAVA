>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício1 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double d;
		System.out.println ("Insira o primeiro valor: ");
		double valor1 = in.nextDouble ();
		System.out.println ("Insira o segundo valor: ");
		double valor2 = in.nextDouble ();
		if (valor1 >= valor2) {
			d = valor1 - valor2;
		} else {
			d = valor2 - valor1;
		}
		System.out.println ("Diferença = " + d);
	}
}
>>>
