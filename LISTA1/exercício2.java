>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício2 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double r;
		System.out.println ("1 dólar = Quantos reais? ");
		double c = in.nextDouble ();
		System.out.println ("Valor em dólares: ");
		double d = in.nextDouble ();
		r = d * c;
		System.out.printf ("Essa quantidade em dólares deu %s reais.", r);
	}
}
>>>
