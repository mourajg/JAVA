>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class Calculadora {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double somar, subtrair, multiplicar, dividir;
		// Coletando os valores.
		System.out.println ("Valor 1: ");
		double valor1 = in.nextDouble ();
		System.out.println ("Valor 2: ");
		double valor2 = in.nextDouble ();
		// Operações.
		somar = valor1 + valor2; // Adição.
		subtrair = valor1 - valor2; // Subtração.
		multiplicar = valor1 * valor2; // Multiplicação.
		dividir = valor1 / valor2; // Divisão.
		// Exibindo os resultados.
		System.out.println ("Somando o resultado é: " + somar);
		System.out.println ("Subtraindo o resultado é: " + subtrair);
		System.out.println ("Multiplicando o resultado é: " + multiplicar);
		System.out.println ("Dividindo o resultado é: " + dividir);
	}
}
>>>
