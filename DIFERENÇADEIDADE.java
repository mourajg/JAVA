>>>
import java.util.Scanner;
public class DIFERENÇA {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println ("Digite sua idade: ");
		int idadeEu = in.nextInt ();
		System.out.println ("Idade de sua namorada: ");
		int idadeNamorada = in.nextInt ();
		int d = idadeEu - idadeNamorada;
		System.out.printf ("Sou %d anos mais velho que minha namorada.", d);
	}
}
>>>
