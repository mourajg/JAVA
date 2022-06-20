>>>
/* Desenvolva um programa que, peça ao usuário para inserir uma informação de LOGIN e armazene o que foi inserido em uma variável. Em seguida peça uma SENHA, essa será
armazenada em outra variável. Por fim, verifique se LOGIN e SENHA são iguais aos que foram definidos. */
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
            		System.out.println("Inválido!");
		}
	}
}
>>>
