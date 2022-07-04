>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício5 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Insira o salário atual: ");
		double salárioatual = in.nextDouble ();
		System.out.println ("Insira o percentual de reajuste: ");
		double reajuste = (in.nextDouble () / 100);
		System.out.println ("O novo salário é: " + String.format ("%.2f", reajuste (salárioatual, reajuste)) + ".");
	}
	public static double reajuste (double salário, double índicereajuste) {
		double novosalário = salário + (salário * índicereajuste);
		return novosalário;
	}
}
>>>
