>>>
// Por João Gabriel Amaral de Moura.
package PROJETOCALCULADORA;
import javax.swing.WindowConstants; // Usa.
import javax.swing.JFrame; // Usa.
public class TELA extends JFrame {
	public static void main (String [] args) {
		JFrame janela = new JFrame ("CALCULADORA"); // Título da janela.
		janela.setBounds (200, 500, 400, 400); // Definir tamanho da janela.
		janela.setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE); // Permite fechar.
		janela.setVisible (true);
	}
}
>>>
