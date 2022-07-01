>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class EXERCÍCIO8 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double v;
		System.out.println ("Volume: ");
		double vo = in.nextDouble ();
		System.out.println ("Raio: ");
		double ra = in.nextDouble ();
		System.out.println ("Altura: ");
		double al = in.nextDouble ();
		v = 3.14159 * ra * ra * al;
		System.out.println ("Volume: " + v);
	}
}
>>>
