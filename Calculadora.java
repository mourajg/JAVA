>>>
package calculadora;
public class Calculadora {
	public double soma(double a, double b) {
		return a + b;
	}
	public double subtrai(double a, double b) {
		return a - b;
	}
	public double multiplica(double a, double b) {
		return a * b;
	}
	public double divide(double a, double b) {
		return a / b;
	}
}
public static void main(String[] args) {
	listaPrincipal;
}
public class Funcionamento {
	static double valor1;
	static double valor2;
	static double resultado;
	static void listaPrincipal {
		Calculadora calc = new Calculadora();
		int escolha;
		String lista = "Calculadora\n\n" + "1 - Somar\n" + "2 - Subtrair\n" + "3 - Multiplicar\n" + "4 - Dividir\n";
		escolha = 1;
		while (escolha != 5) {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null, lista, "Calculadora", JOptionPane.QUESTION_MESSAGE));
			switch (escolha) {
				case 1:
					valor1 = lerValor("Insira aqui o primeiro valor: ");
					valor2 = lerValor("Insira aqui o segundo valor: ");
					resultado = calc.soma(valor1, valor2);
					mostrarResultado("Soma");
				case 2:
					valor1 = lerValor("Insira aqui o primeiro valor: ");
					valor2 = lerValor("Insira aqui o segundo valor: ");
					resultado = calc.subtrai(valor1, valor2);
					mostrarResultado("Subtrai");
				case 3:
					valor1 = lerValor("Insira aqui o primeiro valor: ");
					valor2 = lerValor("Insira aqui o segundo valor: ");
					resultado = calc.multiplica(valor1, valor2);
					mostrarResultado("Multiplica");
				case 4:
					valor1 = lerValor("Insira aqui o primeiro valor: ");
					valor2 = lerValor("Insira aqui o segundo valor: ");
					resultado = calc.divide(valor1, valor2);
					mostrarResultado("Divide");
			}
		}
	}
}
static double lerValor(String mensagem) {
	double valor;
	String strValor;
	strValor = JOptionPane.showInputDialog(null, mensagem, "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
	valor = Double.parseDouble(strValor);
	return valor;
}
static void mostrarResultado(String operacao) {
	JOptionPane.showMessageDialog(null, String.format("Resultado da operação de %s:\n" + "%.2f e %.2f resulta em %.2f", operacao, valor1, valor2, resultado), "Resultado", JOptionPane.PLAIN_MESSAGE);
}
