import java.util.Scanner;

public class EjercicioCincoConteoDeA {
    public static void main(String[] args) {
        // Crear el objeto Scanner para recibir entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la frase
        System.out.println("Por favor ingrese una frase:");
        String frase = scanner.nextLine();

        // Contar las letras 'a' en la frase
        int contadorA = 0;
        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contadorA++;
            }
        }

        // Mostrar el resultado
        System.out.println("La cantidad de letras 'a' en la frase es: " + contadorA);

        // Cerramos el Scanner
        scanner.close();
    }

}
