import java.util.Scanner;

public class EjercicioTresSustituirPorMayuscula {
    public static void main(String[] args) {
        // Crear un objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena al usuario
        System.out.println("Por favor ingrese una frase de preferencia en minúsculas:");
        String fraseOriginal = scanner.nextLine();

        // Convertimos todo a minúsculas primero (opcional para uniformidad)
        fraseOriginal = fraseOriginal.toLowerCase();

        // Variable para construir la nueva cadena con letras capitalizadas
        StringBuilder fraseSustituida = new StringBuilder();

        // Usamos un booleano para saber cuándo capitalizar
        boolean sustituirSiguiente = true;

        // Recorremos la cadena carácter por carácter
        for (int i = 0; i < fraseOriginal.length(); i++) {
            char caracter = fraseOriginal.charAt(i);

            if (sustituirSiguiente && Character.isLetter(caracter)) {
                fraseSustituida.append(Character.toUpperCase(caracter));
                sustituirSiguiente = false;
            } else {
                fraseSustituida.append(caracter);
            }

            // Si encontramos un espacio, la próxima letra debe ir en mayúscula
            if (caracter == ' ') {
                sustituirSiguiente = true;
            }
        }

        // Mostramos el resultado
        System.out.println("La frase sustituida es la siguiente: " + fraseSustituida);

        // Cerramos el Scanner
        scanner.close();
    }

}
