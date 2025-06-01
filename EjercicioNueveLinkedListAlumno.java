import java.util.LinkedList;

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
   

public class EjercicioNueveLinkedListAlumno {
    public static void main(String[] args) {
        // Crear una lista de tipo LinkedList que almacene objetos Alumno
        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        // Agregar alumnos a la lista
        listaAlumnos.add(new Alumno("A001", "Izuku Midoriya", "2025-1234"));
        listaAlumnos.add(new Alumno("A002", "Katsuki Bakugo", "2025-5678"));
        listaAlumnos.add(new Alumno("A003", "Shoto Todoroki", "2025-9012"));

        // Mostrar los elementos de la lista
        System.out.println("Listado de alumnos en la LinkedList:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

}
