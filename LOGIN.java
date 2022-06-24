>>>
import java.util.Scanner;
public class LOGIN {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Login: ");
		String login = in.nextLine ();
		System.out.println ("Senha: ");
		String senha = in.nextLine ();
		if (login.equals ("João") && senha.equals ("123456")) {
			System.out.printf ("Logado com sucesso!");
		} else {
			System.out.println ("Sem sucesso.");
		}
	}
}
>>>
