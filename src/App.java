import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadEstudiantes = 30_00000;   
        int cantidad = 1_000_000;   

        List<Estudiante> estudiantes = Generador.generarListado(cantidadEstudiantes);
    
        //for (Estudiante est : estudiantes) {
        //  System.out.println(est.nombre);
        //}
        String nombreBuscar = "Estudiante_2900111";
        int intentos = 0;
        for(Estudiante est: estudiantes){
            if(est.nombre.equals(nombreBuscar)){
                System.out.println("EXISTE");
                break;
            } else {
                intentos++;
            }
        }
        System.out.println("FIN");
        System.out.println(intentos);
    }

}
