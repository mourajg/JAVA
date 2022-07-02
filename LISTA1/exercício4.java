>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício4 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int idadeemdias;
		System.out.println ("IDADE - anos: ");
		int anos = in.nextInt ();
		System.out.println ("IDADE - meses: ");
		int meses = in.nextInt ();
		System.out.println ("IDADE - dias: ");
		int dias = in.nextInt ();
		idadeemdias = dias + (meses * 30) + (anos * 365);
		System.out.println ("Idade em dias: " + idadeemdias);
	}
}
>>>
