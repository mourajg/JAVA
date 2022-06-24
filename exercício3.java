>>>
// Desenvolva um programa que some todos os números em um intervalo determinado pelo usuário.
import java.util.Scanner;
public class JG3 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Abertura do intevalo: ");
		int abertura = in.nextInt ();
		System.out.println ("Fim do intervalo: ");
		int fim = in.nextInt ();
		int i = abertura;
		int soma = abertura;
		while (i < fim) {
			i++;
			soma += i;
		}
		System.out.println (soma);
	}
}
>>>
