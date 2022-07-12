>>>
// Por João Gabriel Amaral de Moura.
import java.util.ArrayList;
import java.util.Collections; // Sempre usada quando tratamos de Collections.
import java.util.List;
public class COLLECTIONS {
	public static void main (String [] args) {
		List <String> nomes = new ArrayList <> (); // Lista do tipo String que se chama nomes.
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
		String nome = nomes.get (1); // Vai mostrar só o nome que está na posição 1.
		int tamanho = nomes.size (); // Mostra quantos elementos temos no Array.
		boolean temSantos = nomes.contains ("Santos"); // Retorna true se o nome estiver na lista.
		nomes.clear (); // Limpa tudo.
		int posição = nomes.indexOf ("Palmeiras"); // Retorna o posicionamento do time na lista.
	}
}
>>>
import java.util.LinkedList;
import java.util.Queue; // Fila.
public class COLLECTIONS {
	public static void main (String [] args) {
		Queue <String> filaBanco = new LinkedList <> ();
		filaBanco.add ("Maria");
		filaBanco.add ("João");
		filaBanco.add ("Aparecida");
		filaBanco.add ("Marcela");
		filaBanco.add ("Flávia");
		System.out.println (filaBanco);
		String clienteAtendido = filaBanco.poll (); // Mostra quem é o primeiro que será atendido, removendo este do restante da fila.
		System.out.println (clienteAtendido);
		System.out.println (filaBanco); // O restante da fila.
		String primeiroCliente = filaBanco.peek (); // Mostra quem é o primeiro da fila sem remover.
		System.out.println (primeiroCliente);
	}
}
>>>
