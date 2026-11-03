package fcc.EvaluacionPA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SistemaAutoservicios {
    private final List<Estudiante> estudiantes=new ArrayList<>();
    private int siguienteMatricula=1;
    public String generarMatricula(){
        return String.format("ECAAS26-%04d", siguienteMatricula++);
    }
    public void registrar(Estudiante estudiante){
        if(estudiante==null) throw new IllegalArgumentException("Estudiante nulo");
        for(Estudiante otro:estudiantes){
            if(otro.obtenerMatricula().equals(estudiante.obtenerMatricula()))
                throw new IllegalArgumentException("Matricula duplicada");
        }
        estudiantes.add(estudiante);
        estudiante.inscribir(); // Polimorfismo en tiempo de ejecucion
        estudiante.imprimirPoliza(); // Polimorfismo en tiempo de ejecucion
    }
    public List<Estudiante> consultarEstudiantes(){
        return Collections.unmodifiableList(estudiantes);
    }
}
