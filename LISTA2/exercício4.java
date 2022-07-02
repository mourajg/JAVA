>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício4 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Insira um valor: ");
		int n = in.nextInt ();
		if (n >= 0 && n <= 9) {
			System.out.println ("Valor válido!");
		} else {
			System.out.println ("Valor inválido!");
		}
	}
}
>>>
