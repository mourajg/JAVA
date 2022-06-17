>>>
/* Desenvolva um programa que, ao inserir uma medida de comprimento em metro, converta e exiba em decâmetro, hectômetro e quilômetro. */
package exercises;
public class Medida_de_comprimento {
	public static void main(String[] args) {
		double m, dam, hm, km;
		
		m = 2; /* Para fazer os cálculos, vamos considerar 2 metros (Poderia ser qualquer valor). */
		dam = m / 10;
		hm = m / 100;
		km = m / 1000;
		
		System.out.println("O valor em decâmetros é: " + dam);
		System.out.println("O valor em hectômetros é: " + hm);
		System.out.println("O valor em quilômetros é: " + km);
	}
}
>>>
