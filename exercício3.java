>>>
// Desenvolva um programa que some todos os números no intervalo determinado pelo usuário.
import java.util.Scanner;
public class J1003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o início do intervalo: ");
		int ini = in.nextInt;
		System.out.println("Informe o final do intervalo: ");
		int fim = in.nextInt;
		int i = ini;
		int soma = ini;
		while(i < fim) {
			i++;
			soma += i;
		}
		Sysrem.out.println(soma);
	}
}
>>>
