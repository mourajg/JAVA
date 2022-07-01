>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class EXERCÍCIO8 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Insira um valor: ");
		int código = in.nextInt ();
		switch (código) {
			case 1:
				System.out.println ("um");
				break;
			case 2:
				System.out.println ("dois");
				break;
			case 3:
				System.out.println ("três");
				break;
			default:
				System.out.println ("Valor inválido!");
		}
	}
}
>>>
