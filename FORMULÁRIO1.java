>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class FORMULÁRIO1 {
	public static void menu () {
		System.out.println ("MENU");
		System.out.println ("1 - Cadastrar");
		System.out.println ("2 - Entrar");
	}
	public static void cadastrar () {
		Scanner in = new Scanner (System.in);
		System.out.println ("NOME: ");
		String nome = in.nextLine ();
		System.out.println ("IDADE: ");
		int idade = in.nextInt ();
		System.out.println ("SEXO (M ou F): ");
		char sexo = in.nextChar ();
		System.out.println ("SENHA (2 digitos): ");
		byte senha = in.nextByte ();
	)
	public static void entrar () {
		System.out.println ("Nome: ");
		String n = in.nextLine ();
		System.out.println ("Senha: ");
		byte s = in.nextByte ();
		if (n == nome && s == senha) {
			System.out.printf ("Nome: " + nome);
			System.out.printf ("Idade: " + idade);
			System.out.printf ("Sexo: " + sexo);
		} else {
			System.out.println ("Sem sucesso.");
		}
	}
	public static void main (String [] args) {
		int x;
		Scanner in = new Scanner (System.in);
		do {
			menu ();
			x = in.nextInt ();
			switch (x) {
				case 1:
					cadastrar ();
					break;
				case 2:
					entrar ();
					break;
				default:
					System.out.println ("Erro!");
			}
		} while (x != 0);
	}
}
