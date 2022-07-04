>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício1 {
	public static void menu () {
		Scanner in = new Scanner (System.in);
		double valor1, valor2, resultado;
		int menu;
		boolean loopmenu = true;
		System.out.println ("Insira o primeiro valor: ");
		valor1 = in.nextDouble ();
		System.out.print("Insira o segundo valor: ");
		valor2 = in.nextDouble ();
		while (loopmenu) {
		System.out.print("1 - Um dos números é ou não múltiplo do outro.\n2 - Os números são pares.\n3 - A média dos números é maior ou igual 7.\n4 - Sair.");
			menu = in.nextInt ();
			switch (menu) {
				case 1:
					if (valor1 % valor2 ==0 || valor1 % valor2 ==0) {
						System.out.println ("Um dos números é múltiplo do outro.");
					} else {
						System.out.println ("Um não é múltiplo do outro.");
					}
					break;
				case 2:
					if (valor1 % 2 == 0 && valor2 % 2 == 0) {
						System.out.println ("São pares!");
					} else {
					}
					break;
				case 3:
					if ((valor1 + valor2) / 2 >= 7) {
						System.out.println ("Positivo!");
					} else {
						System.out.println ("Negativo!");
					}
					break;
				case 4:
					loopmenu = false;
					break;
				default:
					System.out.println ("Opção inválida!");
			}
		}
	}
}
>>>
