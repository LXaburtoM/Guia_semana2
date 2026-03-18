public class DilemaInventario {
    public static void main(String[] args) {
        double weigth = 45.0; //          Peso del producto en kg
        double distance = 150.0; //       Distancia en km
        String productType = "Frágil"; // Tipo de producto

        if (weigth > 50 && distance > 100) {
            System.out.println("Usar Transporte pesado");
        } else if (weigth < 50 && productType.equals("Frágil")) {
            System.out.println("Usar Envío Premium");
        } else if (weigth < 10 && distance < 20) {
            System.out.println("Usar Dron");
        } else {
            System.out.println("No se cumple ninguna regla específica, usar método de envío estándar.");
        }
    }
}
