package ejercicio04;
import java.util.Scanner;

/**
 * Clase RegistrosVentas.
 * 
 * Objetivo: Registrar ventas, calcular IVA y total a pagar.
 * 
 * Contenido temático:
 * - Menú de ventas con opciones.
 * - Cálculo de IVA (9%).
 * - Validación de pago y cálculo de cambio.
 * 
 * Ejemplo:
 * Venta: 100 → IVA: 9 → Total: 109
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class registrosVentas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double totalCaja = 0;
        int opcion = 0;

        // Bucle principal del menú
        do {
            opcion = mostrarMenu(teclado);

            switch (opcion) {
                case 1:
                    totalCaja += registrarVenta(teclado);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 2);

        System.out.println("El total acumulado en caja es: " + totalCaja);
        teclado.close();
    }

    /** Método para mostrar el menú y devolver la opción seleccionada */
    public static int mostrarMenu(Scanner teclado) {
        System.out.println("==== MENU DE VENTAS ====");
        System.out.println("1. Registrar venta");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
        return teclado.nextInt();
    }

    /** Método para registrar una venta */
    public static double registrarVenta(Scanner teclado) {
        System.out.print("Ingrese el monto de la venta: ");
        double montoVenta = teclado.nextDouble();

        double iva = calcularIva(montoVenta);
        double totalPagar = calcularTotal(montoVenta, iva);

        System.out.println("IVA (9%): " + iva);
        System.out.println("Total a pagar: " + totalPagar);

        System.out.print("Ingrese la cantidad con que paga el cliente: ");
        double cantidadPagada = teclado.nextDouble();

        return calcularCambio(cantidadPagada, totalPagar);
    }

    /** Método para calcular el IVA */
    public static double calcularIva(double montoVenta) {
        return montoVenta * 0.09;
    }

    /** Método para calcular el total a pagar */
    public static double calcularTotal(double montoVenta, double iva) {
        return montoVenta + iva;
    }

    /** Método para calcular el cambio */
    public static double calcularCambio(double cantidadPagada, double totalPagar) {
        double cambio = cantidadPagada - totalPagar;
        if (cambio < 0) {
            System.out.println("Cantidad pagada insuficiente. No se puede completar la venta.");
        } else {
            System.out.println("Cambio a entregar: " + cambio);
        }
        return totalPagar;
    }
}
