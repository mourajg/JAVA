>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class tabuadausandofor {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int x;
		System.out.println ("Tabuada de qual número você gostaria de ver? ");
		int n = in.nextInt ();
		for (int i = 0; i < 10; i ++) {
			x = n * (1 + i);
			System.out.println (x);
		}
	}
}
>>>
