package ejercicio03;
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
                    double num1Suma = teclado.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2Suma = teclado.nextDouble();
                    System.out.println("La suma es: " + realizarSuma(num1Suma, num2Suma));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    double num1Resta = teclado.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2Resta = teclado.nextDouble();
                    System.out.println("La resta es: " + realizarResta(num1Resta, num2Resta));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    double num1Multiplicacion = teclado.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2Multiplicacion = teclado.nextDouble();
                    System.out.println("La multiplicación es: " + realizarMultiplicacion(num1Multiplicacion, num2Multiplicacion));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    double num1Division = teclado.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2Division = teclado.nextDouble();
                    System.out.println("La división es: " + realizarDivision(num1Division, num2Division));
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
    public static double realizarSuma(double num1, double num2) {
        return num1 + num2;
    }

    /** Método para restar dos números */
    public static double realizarResta(double num1, double num2) {
        return num1 - num2;
    }

    /** Método para multiplicar dos números */
    public static double realizarMultiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    /** Método para dividir dos números */
    public static double realizarDivision(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }
}
