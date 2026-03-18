import java.util.Scanner;


public class ValidadorFechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el día: ");
        int day = sc.nextInt();
        System.out.print("Ingresa el mes: ");
        int month = sc.nextInt();
        System.out.print("Ingresa el año: ");
        int year = sc.nextInt();

        boolean esValida = validarFecha(day, month, year);
        if (esValida) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
        sc.close();
    }
    public static boolean validarFecha(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        int daysInMonth;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                boolean esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                daysInMonth = esBisiesto ? 29 : 28;
                break;
            default:
                return false;
        }
        return day >= 1 && day <= daysInMonth; // comentario: Verifica que el día esté dentro del rango válido para el mes y año dados
    }
}
