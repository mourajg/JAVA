>>>
// Por João Gabriel Amaral de Moura.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class COLLECTIONS {
	public static void main (String [] args) {
		List <String> nomes = new ArrayList <> ();
		nomes.add ("Flamengo");
		nomes.add ("Fluminense");
		nomes.add ("Palmeiras");
		nomes.add ("Atlético Mineiro");
		nomes.add ("São Paulo");
		nomes.add ("Santos");
		System.out.println (nomes);
		nomes.set (0, "Atlético Mineiro"); // Fixar um elemento em uma posição.
		Collections.sort (nomes); // Ordenar os elementos.
		System.out.println (nomes);
	}
}
>>>
