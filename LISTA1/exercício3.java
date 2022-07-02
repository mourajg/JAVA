>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício3 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double volume;
		System.out.println ("Raio = ");
		double raio = in.nextDouble ();
		System.out.println ("Altura = ");
		double altura = in.nextDouble ();
		volume = 3.14 * raio * raio * altura;
		System.out.println ("Volume = " + volume);
	}
}
>>>
