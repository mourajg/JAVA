>>>
// Desenvolva um programa que verifique se LOGIN e SENHA são iguais aos que foram definidos.
import java.util.Scanner;
public class exercises {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Login: ");
		String login = in.nextLine();
		System.out.println("Senha: ");
		String senha = in.nextLine();
		if (login.equals("Maria") && senha.equals("123456")) {
            		System.out.printf("Usuário logado com sucesso!");
        	} else {
            		System.out.println("Não encontrado!");
		}
	}
}
>>>
