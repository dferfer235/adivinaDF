package adivinadf;

import java.util.Random;
import java.util.Scanner;

/*
 * @author davidfdez
 */
public class AdivinanzaDF {

    private static int adivinar(int n1, int n2) {
        int numeroAleatorio;
        Random nAleatorio = new Random();

        numeroAleatorio = nAleatorio.nextInt(n1) + n2;
        return numeroAleatorio;
    }

    public static void main(String[] args) {
        int numero1, numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Comienza la adivinanza");
        System.out.println("Buscaras un numero aleatorio entre lo que tu decidas");

        System.out.println("Escoje el numero 1");
        numero1 = teclado.nextInt();

        System.out.println("Escoje el numero 2");
        numero2 = teclado.nextInt();
        
    }

}
