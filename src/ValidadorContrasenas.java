import java.util.Scanner;

public class ValidadorContrasenas {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa la contraseña a evaluar: ");
        String contrasena = lector.nextLine();

        int cantidadLetras = contrasena.length();
        String nivelSeguridad;

        if (cantidadLetras > 8) {
            nivelSeguridad = "Segura";     // Más de 8
        }
        else if (cantidadLetras == 8) {
            nivelSeguridad = "Moderada";   // Exactamente 8
        }
        else {
            nivelSeguridad = "Insegura";   // Si no posee menos de 7
        }

        System.out.println("\n Resultado ");
        System.out.println("Tu contraseña tiene " + cantidadLetras + " caracteres.");
        System.out.println("Clasificación: " + nivelSeguridad);

        lector.close();
    }
}