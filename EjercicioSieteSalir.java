import java.util.Scanner;

public class EjercicioSieteSalir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        int positivos = 0;

        while (true) {
            System.out.println("Por favor ingrese un número o escriba 'salir' para finalizar:");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                suma += numero;
                contador++;

                if (numero > 0) {
                    positivos++;
                }
            } catch (NumberFormatException e) {
                System.out.println("La entrada es inválida. Por favor, ingresa un número válido.");
            }
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("La cantidad de números introducidos es de: " + contador);
            System.out.println("El promedio de los números es de: " + promedio);
            System.out.println("La cantidad de números positivos es de: " + positivos);
        } else {
            System.out.println("No se ingresaron números válidos. No se puede calcular el promedio.");
        }

        scanner.close();
    }

}
