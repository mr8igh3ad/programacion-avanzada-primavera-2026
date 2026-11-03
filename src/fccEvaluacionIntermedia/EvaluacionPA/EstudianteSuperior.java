package fcc.EvaluacionPA;
public class EstudianteSuperior extends Estudiante {
    private final String licenciatura, modalidad, plan;
    private final int numeroCreditos;
    private final double costoCredito;
    public EstudianteSuperior(String nombre,String paterno,String materno,String curp,
            String nacimiento,String genero,String matricula,String clave,String licenciatura,
            String modalidad,String plan,int numeroCreditos,double costoCredito) {
        super(nombre,paterno,materno,curp,nacimiento,genero,matricula,clave);
        this.licenciatura=licenciatura;this.modalidad=modalidad;this.plan=plan;
        this.numeroCreditos=numeroCreditos;this.costoCredito=costoCredito;
    }
    @Override public String obtenerNivel(){return "Superior";}
    @Override public void inscribir(){
        marcarInscrito();
        System.out.println("INSCRIPCION NIVEL SUPERIOR: "+obtenerNombreCompleto());
        System.out.println("Matricula: "+obtenerMatricula()+" | Licenciatura: "+licenciatura);
        System.out.println("Modalidad: "+modalidad+" | Plan: "+plan);
    }
    @Override public double calcularPoliza(){return numeroCreditos*costoCredito;}
    @Override public void imprimirPoliza(){
        System.out.println("POLIZA: Nivel superior");
        System.out.println("Numero de creditos: "+numeroCreditos);
        System.out.printf("Costo por credito: $%.2f%nTOTAL: $%.2f MXN%n",costoCredito,calcularPoliza());
    }
}
