package fcc.EvaluacionPA;
public class EstudiantePosgrado extends Estudiante {
    private final String tipoPosgrado, programa, clavePrograma;
    private final boolean becaConacyt;
    private final double cuotaSemestral;
    public EstudiantePosgrado(String nombre,String paterno,String materno,String curp,
            String nacimiento,String genero,String matricula,String clave,String tipoPosgrado,
            String programa,String clavePrograma,boolean becaConacyt,double cuotaSemestral){
        super(nombre,paterno,materno,curp,nacimiento,genero,matricula,clave);
        this.tipoPosgrado=tipoPosgrado;this.programa=programa;this.clavePrograma=clavePrograma;
        this.becaConacyt=becaConacyt;this.cuotaSemestral=cuotaSemestral;
    }
    @Override public String obtenerNivel(){return "Posgrado";}
    @Override public void inscribir(){
        marcarInscrito();
        System.out.println("INSCRIPCION POSGRADO: "+obtenerNombreCompleto());
        System.out.println("Matricula: "+obtenerMatricula()+" | Tipo: "+tipoPosgrado);
        System.out.println("Programa: "+programa+" | Clave: "+clavePrograma);
        System.out.println("Beca Conacyt: "+(becaConacyt?"Si":"No"));
    }
    @Override public double calcularPoliza(){return cuotaSemestral;}
    @Override public void imprimirPoliza(){
        System.out.println("POLIZA: Posgrado");
        System.out.println("Tipo: "+tipoPosgrado+" | Clave programa: "+clavePrograma);
        System.out.printf("Cuota semestral: $%.2f%nTOTAL: $%.2f MXN%n",cuotaSemestral,calcularPoliza());
        System.out.println("Nota: no se aplico descuento de beca; el enunciado no indica un monto.");
    }
}
