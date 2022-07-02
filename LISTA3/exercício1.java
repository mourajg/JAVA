>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício1 {
	public static void menu () {
		System.out.println ("MENU");
		System.out.println ("1 - Verificar se um dos números é múltiplo do outro.");
		System.out.println ("2 - Verificar se os dois números são pares.");
		System.out.println ("3 - Sair.);
	}
	public static void verifica1 {
		Scanner in = new Scanner (System.in);
		System.out.println ("Insira o primeiro valor: ");
		int valor1 = in.nextInt ();
		System.out.println ("Insira o segundo valor: ");
		int valor2 = in.nextInt ();
		if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
			System.out.println ("Sim, um dos valores é múltiplo do outro.");
		} else {
			System.out.println ("Não são múltiplos.");
		}
	}
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		
