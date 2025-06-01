import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioDiezTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new TreeSet<>();
        String respuesta;

        System.out.println("Ingrese los números que quiera y escriba 'n' cuando desee parar.");

        do {
            System.out.print("por favor ingrese un número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número válido. Intente nuevamente.");
                scanner.next(); // Limpia la entrada inválida
                System.out.print("Por favor ingrese un número: ");
            }

            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("¿Desea ingresar otro número? (si/no): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Números ingresados y ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }

}
