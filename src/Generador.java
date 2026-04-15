import java.util.ArrayList;
import java.util.List;

public class Generador {
    
    public static List<Estudiante> generarListado(int cantidadEstudiante) { // metodo
        List<Estudiante> estudiantes = new ArrayList<>();
        for(int i = 0; i < cantidadEstudiante; i++) {
            String nombre = "Estudiante_" +i;
            int edad = 1;
            Estudiante nuevo = new Estudiante(nombre, edad); // instanciar estudiante
            estudiantes.add(nuevo);

        }
        return estudiantes;

    }
}
