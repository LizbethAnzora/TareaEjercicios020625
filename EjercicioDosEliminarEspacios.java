import java.util.Scanner;

public class EjercicioDosEliminarEspacios {
     public static void main(String[] args) {
        // Crear el objeto Scanner para recibir entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena al usuario
        System.out.println("Por favor ingrese una cadena de texto (una frase con varias palabras) y con espacios:");
        String cadenaOriginal = scanner.nextLine(); // Leer la línea completa

        // Quitar todos los espacios en blanco de la cadena
        String cadenaSinEspacios = cadenaOriginal.replaceAll("\\s+", "");

        // Mostrar la cadena resultante
        System.out.println("La cadena ingresada sin espacios es la siguiente: " + cadenaSinEspacios);

        // Cerrar el Scanner
        scanner.close();
    }

}
