>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class CADASTROCONSULTA2 {
	public static void main (String [] args) {
		int i;
		System.out.println ("Quantidade de pessoas para cadastrar: ");
		i = new Scanner (System.in).nextInt ();
		String [] curso = new String [i];
		String [] cpf = new String [i];
		int [] idade = new int [i];
		String [] nome = new String [i];
		for (int x = 0; x < i; x ++) {
			System.out.println ("Nome da pessoa " + (1 + x));
			nome [x] = new Scanner (System.in).next ();
			System.out.println ("Idade da pessoa " + (1 + x));
			idade [x] = new Scanner (System.in).nextInt ();
			System.out.println ("CPF da pessoa " + (1 + x));
			cpf [x] = new Scanner (System.in).next ();
			System.out.println ("Curso da pessoa " + (1 + x));
			curso [x] = new Scanner (System.in).next ();
		}
		String consulta;
		System.out.println ("Insira o nome para consulta: ");
		consulta = new Scanner (System.in).next ();
		boolean inexistente = true;
		for (int x = 0; x < i; x ++) {
			if (consulta.equals (nome [x])) {
				System.out.println ("Pessoa encontrada!");
				System.out.println (nome [x]);
				System.out.println (idade [x]);
				System.out.println (cpf [x]);
				System.out.println (curso [x]);
			}
		}
		if (inexistente) {
			System.out.println("Cadastro inexistente");
		}
	}
}
>>>
