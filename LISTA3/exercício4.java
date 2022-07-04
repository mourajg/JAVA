>>>
// Por João Gabriel Amaral de Moura
import java.util.Scanner;
public class exercício4 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int componentes;
		System.out.println ("Insira o número de posições: ");
		componentes = in.nextInt();
		int [] v1 = new int [componentes];
		int [] v2 = new int [componentes];
		for (int x = 0; x < componentes; x ++) {
			System.out.println ("Insira o valor da posição "+ (x + 1) +" do vetor 1: ");
			v1 [x] = in.nextInt ();
		}
		for (int x = 0; x < componentes; x ++) {
			System.out.print ("Insira o valor da posição "+ (x + 1) +" do vetor 2: ");
			v2 [x] = in.nextInt ();
		}
		for (int x = 0; x < componentes; x ++) {
			if (v1 [x] == v2 [x]) {
				System.out.println ("Valores das posições "+ (x + 1) +" dos vetores é igual.");
			}
		}
	}
}
>>>
