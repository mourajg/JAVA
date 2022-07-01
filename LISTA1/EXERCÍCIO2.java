>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class EXERCÍCIO2 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double valoremr;
		System.out.println ("1 Dólar = Quantos reais? ");
		double c = in.nextDouble ();
		System.out.println ("Valor em dólares: ");
		double valoremd = in.nextDouble ();
		valoremr = valoremd * c;
		System.out.println ("Essa quantidade em dólares deu essa quantidade em reais: " + valoremr);
	}
}
>>>
