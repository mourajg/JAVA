>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class CADASTROCONSULTA1 {
	public static void main (String [] args) {
		int i;
		System.out.println ("Quantidade de pessoas para cadastrar: ");
		i = new Scanner (System.in).nextInt ();
		String [] nome = new String [i];
		for (int x = 0; x < i; x ++) {
			System.out.println ("Pessoa " + (1 + x));
			nome [x] = new Scanner (System.in).next ();
		}
		String consulta;
		System.out.println ("Insira o nome para consulta: ");
		buscadenome = new Scanner (System.in).next ();
		boolean inexistente = true;
		for (int x = 0; x < i; x ++) {
			if (buscadenome.equals (nome [x])) {
				System.out.println (nome [x]);
				inexistente = false;
			}
		}
		if (inexistente) {
			System.out.println("Nome inexistente");
		}
	}
}
>>>
