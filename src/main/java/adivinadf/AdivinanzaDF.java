package adivinadf;

import java.util.InputMismatchException;
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

    private static boolean aJugar(int numeroPorAdivinar) {
        Scanner teclado = new Scanner(System.in);
        for (int vidas = 2; vidas >= 0; vidas--) {
            try {
                System.out.println("¿Que numero crees que es?");
                int numeroDelUsuario = teclado.nextInt();

                if (numeroDelUsuario == numeroPorAdivinar) {
                    System.out.println("LO HAS ADIVINADO");
                    return true;
                } else {
                    System.out.println("Ese no es");
                    System.out.println("Te quedan " + vidas + " vidas");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Eso no es un numero...");
                teclado.nextLine();
                vidas++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numero1 = 0, numero2 = 0;
        boolean ganador;
        boolean repetirDatos = true;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Comienza la adivinanza");
        System.out.println("Buscaras un numero aleatorio entre lo que tu decidas");
        do {
            try {
                System.out.println("Escoje el numero minimo");
                numero1 = teclado.nextInt();

                System.out.println("Escoje el numero maximo");
                numero2 = teclado.nextInt();

                if (numero1 > numero2) {
                    System.out.println("El numero minimo no puede ser mas pequeño que el maximo");
                } else {
                    repetirDatos = false;
                }

            } catch (InputMismatchException ime) {
                System.out.println("No se ha introducido un numero");
                teclado.nextLine();
            }

        } while (repetirDatos);

        System.out.println("Escojiendo...");
        int numeroPorAdivinar = adivinar(numero1, numero2);

        ganador = aJugar(numeroPorAdivinar);

        if (ganador == false) {
            System.out.println("No lo has logrado, el numero era: " + numeroPorAdivinar);
        }
    }

}
