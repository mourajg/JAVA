>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class exercício3 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int quantidade;
		System.out.print("Digite a quantidade de números: ");
		quantidade = entrada.nextInt();
		
		int[] Numeros = new int[quantidade];
		
		for(int x=0;x<quantidade;x++){
			System.out.print("Digite o "+(x+1)+"° Número: ");
			Numeros[x]= entrada.nextInt();
		}
		System.out.print("\nA ordem contrária é:\n");
		for(int y=quantidade-1;y>=0;y--){
			System.out.println(Numeros[y]);
		}

	}
}
