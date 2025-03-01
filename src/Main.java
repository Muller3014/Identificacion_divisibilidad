import java.util.Scanner;
import java.math.BigInteger;
import divisibilidad.Divisibilidad;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("=========Calculadora de divisibilidad=========\n");

        System.out.print("Comprobar la divisibilidad de: ");
        // Leemos el número como String para convertirlo a BigInteger
        String numStr = sc.next();
        BigInteger numero = new BigInteger(numStr);

        // Mostrar las opciones de criterios de divisibilidad
        System.out.println("Elige el criterio de divisibilidad:");
        System.out.println("1. Divisible entre 2");
        System.out.println("2. Divisible entre 3");
        System.out.println("3. Divisible entre 5");
        System.out.println("4. Divisible entre 7");
        System.out.println("5. Divisible entre 11");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                if (Divisibilidad.divisiblePor2(numero)) {
                    System.out.println(numero + " es divisible entre 2.");
                } else {
                    System.out.println(numero + " no es divisible entre 2.");
                }
                break;

            case 2:
                if (Divisibilidad.divisiblePor3(numero)) {
                    System.out.println(numero + " es divisible entre 3.");
                } else {
                    System.out.println(numero + " no es divisible entre 3.");
                }
                break;

            case 3:
                if (Divisibilidad.divisiblePor5(numero)) {
                    System.out.println(numero + " es divisible entre 5.");
                } else {
                    System.out.println(numero + " no es divisible entre 5.");
                }
                break;

            case 4:
                if (Divisibilidad.divisiblePor7(numero)) {
                    System.out.println(numero + " es divisible entre 7.");
                } else {
                    System.out.println(numero + " no es divisible entre 7.");
                }
                break;

            case 5:
                if (Divisibilidad.divisiblePor11(numero)) {
                    System.out.println(numero + " es divisible entre 11.");
                } else {
                    System.out.println(numero + " no es divisible entre 11.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        sc.close();
    }
}
