import java.util.ArrayList;

class Alumno {
    private String codigo;
    private String nombre;
    private String carnet;
   
    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}

    

public class EjercicioOchoAlumno {
    public static void main(String[] args) {
        // 1. Crear la lista genérica de tipo ArrayList<Alumno>
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // 2. Insertar valores: instanciamos objetos Alumno y los agregamos a la lista
        listaAlumnos.add(new Alumno("A001", "Izuku Midoriya", "2025-1234"));
        listaAlumnos.add(new Alumno("A002", "Katsuki Bakugo", "2025-5678"));
        listaAlumnos.add(new Alumno("A003", "Shoto Todoroki", "2025-9012"));

        // 3. Mostrar en pantalla cada objeto Alumno de la lista
        System.out.println("Listado de alumnos registrados:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

}
