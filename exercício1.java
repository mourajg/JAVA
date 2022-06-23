>>>
// Desenvolva um programa que peça ao usuário um valor em segundos, converta e exiba em minutos, horas e dias.
package exercises;
public class JG1 {
	public static void main(String[] args) {
		double s, m, h, d;
		s = 60;
		m = s / 60;
		h = s / 3600;
		d = s / 86400;
		System.out.println("O valor em minutos é: " + m);
		System.out.println("O valor em horas é: " + h);
		System.out.println("O valor em dias é: " + d);
	}
}
>>>
