import java.util.Scanner;

public class EjercicioSeisPalabraPalindroma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la palabra al usuario
        System.out.println("Por favor ingrese una palabra:");
        String palabra = scanner.nextLine().trim(); // .trim() elimina espacios antes y después

        // Validación: verificar si la entrada está vacía
        if (palabra.isEmpty()) {
            System.out.println("No ingresaste ninguna palabra. Por favor, ingresa una palabra válida.");
        } else {
            // Convertir a minúsculas y quitar espacios internos si hay
            palabra = palabra.toLowerCase().replace(" ", "");

            // Invertir la palabra
            String palabraInvertida = "";
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraInvertida += palabra.charAt(i);
            }

            // Comparar original con invertida
            if (palabra.equals(palabraInvertida)) {
                System.out.println("La palabra ingresada es un palíndromo. ¡Bien hecho!");
            } else {
                System.out.println("La palabra ingresada no es un palíndromo. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
    
}
