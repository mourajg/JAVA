>>>
/* Desenvolva um programa que, peça ao usuário para inserir uma informação de login e armazene o que foi inserido em uma variável. Em seguida peça uma senha, essa será armazenada em outra variável. Por fim, verifique se login e senha são iguais aos que foram definidos. */
import java.util.Scanner;
public class exercises {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Login: ");
		String login = in.nextLine();
		System.out.println("Senha: ");
		String senha = in.nextLine();
		
		if (login.equals("João") && senha.equals("123456")) {
            		System.out.printf("Usuário %s logado com sucesso!", login);
        	} else {
            	System.out.println("Inválido!");
		}
	}
}
>>>
