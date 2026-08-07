package ejercicio02MenuEjemplo2;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Clase MenuEjemplo2.
 * 
 * Objetivo: Mostrar un menú modularizado con métodos auxiliares.
 * 
 * Contenido temático:
 * - Modularización con funciones.
 * - Uso de while para repetir el menú.
 * - Ejemplo práctico: suma de números y fecha actual.
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class menuEjemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        // Bucle principal del menú
        while (opcion != 3) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int numero1 = teclado.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int numero2 = teclado.nextInt();
                    sumarNumeros(numero1, numero2);
                    break;
                case 2:
                    mostrarFechaActual();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
            System.out.println();
        }
        teclado.close();
    }

    /** Método para mostrar el menú */
    public static void mostrarMenu() {
        System.out.println("==== MENU PRINCIPAL ====");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Mostrar fecha actual");
        System.out.println("3. Salir");
    }

    /** Método para sumar dos números */
    public static void sumarNumeros(int numero1, int numero2) {
        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
    }

    /** Método para mostrar la fecha actual */
    public static void mostrarFechaActual() {
        LocalDateTime fechaActual = LocalDateTime.now();
        System.out.println("La fecha actual es: " + fechaActual);
    }
}
