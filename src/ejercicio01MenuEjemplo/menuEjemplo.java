package ejercicio01;
import java.util.Scanner;

/**
 * Clase MenuEjemplo.
 * 
 * Objetivo: Mostrar un menú simple con tres opciones:
 * saludar, mostrar información y salir.
 * 
 * Contenido temático:
 * - Uso de do-while para repetir el menú.
 * - Estructura switch para seleccionar la opción.
 * 
 * Ejemplo:
 * Opción 1 → "¡Hola! Espero que estés teniendo un buen día."
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class menuEjemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        // Bucle principal del menú
        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar información");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt(); // Leer la opción ingresada

            // Se evalúa la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Espero que estés teniendo un buen día.");
                    break;
                case 2:
                    System.out.println("Este es un programa de ejemplo de menú en Java.");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 3);

        teclado.close(); // Se cierra el recurso Scanner
    }
}
