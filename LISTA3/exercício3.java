>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício3 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int quantidade;
		System.out.print ("Quantidade de números: ");
		quantidade = in.nextInt ();
		int [] números = new int [quantidade];
		for (int x = 0; x < quantidade; x ++) {
			System.out.println ("Digite o "+ (x + 1) +" número: ");
			números [x] = in.nextInt ();
		}
		for (int y = quantidade - 1; y >= 0; y --) {
			System.out.println (números [y]);
		}
	}
}
>>>
