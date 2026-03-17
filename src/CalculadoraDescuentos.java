import java.util.Scanner;
public class CalculadoraDescuentos {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);


        System.out.print("Escribe tu nivel de membresía (PLATINO, VIP, ORO, PLATA, BRONCE, NUEVO): ");


        String tipoCliente = lector.nextLine().toUpperCase();

        double precioProducto = 100.0; //  el precio fijo para el ejemplo


        double porcentajeDescuento = switch (tipoCliente) {
            case "PLATINO" -> 0.30; // 30%
            case "VIP"     -> 0.25; // 25%
            case "ORO"     -> 0.20; // 20%
            case "PLATA"   -> 0.15; // 15%
            case "BRONCE"  -> 0.10; // 10%
            case "NUEVO"   -> 0.05; // 5%
            default        -> 0.0;  //da 0% de descuento
        };


        double montoDescuento = precioProducto * porcentajeDescuento;
        double precioFinal = precioProducto - montoDescuento;

        // 5. Mostramos los resultados
        System.out.println("\n TICKET DE COMPRA ");
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Precio original: " + precioProducto);
        System.out.println("Descuento aplicado: " + montoDescuento);
        System.out.println("Precio final con descuento: " + precioFinal);


        lector.close();
    }
}