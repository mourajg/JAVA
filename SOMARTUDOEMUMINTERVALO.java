>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class SOMARTUDOEMUMINTERVALO {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Começo do intervalo: ");
		int começo = in.nextInt ();
		System.out.println ("Fim do intervalo: ");
		int fim = in.nextInt ();
		int i = começo;
		int soma = começo;
		while (i < fim) {
			i ++;
			soma += i;
		}
		System.out.println (soma);
	}
}
>>>
