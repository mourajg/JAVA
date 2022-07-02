>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício5 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		do {
			System.out.println ("Insira um valor: ");
			int n = in.nextInt ();
			if (n > 0) {
				System.out.println ("O valor é positivo!");
			} else {
			}
			if (n < 0) {
				System.out.println ("O valor é negativo!");
			}
		} while (n != 0);
	}
}
>>>
