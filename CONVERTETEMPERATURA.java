>>>
// Por João Gabriel Amaral de Moura.
import java.util.Scanner;
public class CONVERTETEMPERATURA {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        double K, Re, Ra, F;
        System.out.println ("Insira uma temperatura em graus Celsius: ");
        double C = in.nextDouble ();
        K = C + 273.15; //  Kelvin.
        Re = C * 0.8; // Réaumur.
        Ra = C * 1.8 + 32 + 459.67; // Rankine.
        F = C * 1.8 + 32; // Fahrenheit.
        System.out.println ("Em K: " + K);
        System.out.println ("Em Re: " + Re);
        System.out.println ("Em Ra: " + Ra);
        System.out.println ("Em F: " + F);
    }
}
>>>
