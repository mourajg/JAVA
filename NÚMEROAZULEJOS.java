// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class NÚMEROAZULEJOS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double na;
        System.out.println("Altura parede: ");
        double ap = in.nextDouble();
        System.out.println("Largura parede: ");
        double lp = in.nextDouble();
        System.out.println("Altura azulejo: ");
        double aa = in.nextDouble();
        System.out.println("Largura azulejo: ");
        double la = in.nextDouble();
        na = (ap * lp) / (aa * la);
        System.out.println("Número de azulejos necessários: " + na);
    }
}
