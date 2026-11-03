package fcc.EvaluacionPA;
public class EstudianteMedioSuperior extends Estudiante {
    private final String tutor, preparatoria;
    private final double cuotaSemestral, cuotaPreparatoria;
    public EstudianteMedioSuperior(String nombre,String paterno,String materno,String curp,
            String nacimiento,String genero,String matricula,String clave,String tutor,
            String preparatoria,double cuotaSemestral,double cuotaPreparatoria) {
        super(nombre,paterno,materno,curp,nacimiento,genero,matricula,clave);
        this.tutor=tutor;this.preparatoria=preparatoria;
        this.cuotaSemestral=cuotaSemestral;this.cuotaPreparatoria=cuotaPreparatoria;
    }
    @Override public String obtenerNivel() {return "Medio superior";}
    @Override public void inscribir(){
        marcarInscrito();
        System.out.println("INSCRIPCION MEDIO SUPERIOR: "+obtenerNombreCompleto());
        System.out.println("Matricula: "+obtenerMatricula()+" | Tutor: "+tutor);
        System.out.println("Preparatoria asignada: "+preparatoria);
    }
    @Override public double calcularPoliza(){return cuotaSemestral+cuotaPreparatoria;}
    @Override public void imprimirPoliza(){
        System.out.println("POLIZA: Medio superior");
        System.out.printf("Cuota semestral: $%.2f%nCuota preparatoria: $%.2f%n",cuotaSemestral,cuotaPreparatoria);
        System.out.printf("TOTAL: $%.2f MXN%n",calcularPoliza());
    }
}
