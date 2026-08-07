package ejercicio03MenuMatematico;
import java.util.Scanner;

/**
 * Clase MenuMatematico.
 * 
 * Objetivo: Realizar operaciones matemáticas básicas mediante un menú.
 * 
 * Contenido temático:
 * - Modularización con métodos.
 * - Operaciones aritméticas: suma, resta, multiplicación, división.
 * - Validación de división por cero.
 * 
 * Ejemplo:
 * Opción 1 → Suma de dos números.
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class menuMatematico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        // Bucle principal del menú
        while (opcion != 5) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double numero1Suma = teclado.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double numero2Suma = teclado.nextDouble();
                    System.out.println("La suma es: " 
                    + realizarSuma(numero1Suma, numero2Suma));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    double numero1Resta = teclado.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double numero2Resta = teclado.nextDouble();
                    System.out.println("La resta es: " 
                    + realizarResta(numero1Resta, numero2Resta));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    double numero1Multiplicacion = teclado.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double numero2Multiplicacion = teclado.nextDouble();
                    System.out.println("La multiplicación es: " 
                    + realizarMultiplicacion(numero1Multiplicacion, numero2Multiplicacion));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    double numero1Division = teclado.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double numero2Division = teclado.nextDouble();
                    System.out.println("La división es: " 
                    + realizarDivision(numero1Division, numero2Division));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
                    break;
            }
            System.out.println();
        }
        teclado.close(); // Se cierra el recurso Scanner
    }

    /** Método para mostrar el menú */
    public static void mostrarMenu() {
        System.out.println("==== MENU MATEMATICO ====");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Salir");
    }

    /** Método para sumar dos números */
    public static double realizarSuma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /** Método para restar dos números */
    public static double realizarResta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    /** Método para multiplicar dos números */
    public static double realizarMultiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    /** Método para dividir dos números */
    public static double realizarDivision(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }
}
