>>>
import java.util.Scanner;
public class LOGINECALCULADORA {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Login: ");
		String login = in.nextLine ();
		System.out.println ("Senha: ");
		String senha = in.nextLine ();
		if (login.equals ("Calculadora") && senha.equals ("123456")) {
			double a, s, m, d;
            		System.out.println ("Valor 1:  ");
            		double valor1 = in.nextDouble ();
            		System.out.println ("Valor 2:  ");
           		double valor2 = in.nextDouble ();
			a = valor1 + valor2;
			s = valor1 - valor2;
			m = valor1 * valor2;
			d = valor1 / valor2;
			System.out.println ("valor 1 + valor 2 = " + a);
			System.out.println ("valor 1 - valor 2 = " + s);
			System.out.println ("valor 1 * valor 2 = " + m);
			System.out.println ("valor 1 / valor 2 = " + d);
		} else {
			System.out.println ("Sem sucesso.");
		}
	}
}
>>>
