import java.util.Scanner;

/**
 * ====================================
 *           eXcript.com
 *          fb.com/eXcript
 * ====================================
 */

public class J1003 {

    //Soma de todos os números de um intervalo
    public static void main(String[] args) {
        //Criamos uma nova instancia da classe Scanner
        Scanner in = new Scanner(System.in);
        //Imprimimos a frase pedindo o inicio do intervalo
        System.out.println("Informe o início do intevalo: ");
        //Capturamos o inicio do intervalo
        int ini = in.nextInt();
        //Imprimimos a frase pedindo o término do intervalo
        System.out.println("Informe o final do intervalo: ");
        //Capturamos o término do intervalo
        int fim = in.nextInt();

        int i = ini;
        int soma = ini;
        //1..5
        while(i<fim){
            i++;
            soma+=i;
            //soma = soma + i;
        }
        System.out.println(soma);
/*i    = 1
  ini  = 1
  soma = 1
  fim  = 5
     - --- ---
  | variável.......|   i    |     soma    | soma + i      | fim   |
  | valor inicial..|   1    |       1     |   1  + 1      |  5    |
  | expressão......| i=i+1  | soma=soma+i |               |       |
  | -- ||-|---|---|
  |1 ciclo(i<5)....|  i=1   | soma=1      |   1  + 2 = 3  |    5  |
  |2 ciclo(i<5)....|  i=2   | soma=3      |   3  + 3 = 6  |    5  |
  |3 ciclo(i<5)....|  i=3   | soma=6      |   6  + 4 = 10 |    5  |
  |4 ciclo(i<5)....|  i=4   | soma=10     |   10 + 5 = 15 |    5  |
     - --- --- */

    }
}
