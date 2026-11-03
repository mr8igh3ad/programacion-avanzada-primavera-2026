package fcc.EvaluacionPA;
public abstract class Estudiante extends UsuarioAutoservicios {
    private final String matricula;
    private boolean inscrito;
    public Estudiante(String nombre, String paterno, String materno, String curp,
            String fechaNacimiento, String genero, String matricula, String contrasena) {
        super(nombre,paterno,materno,curp,fechaNacimiento,genero,matricula,contrasena);
        this.matricula=matricula;
    }
    public String obtenerMatricula() { return matricula; }
    protected void marcarInscrito() { inscrito=true; }
    public boolean estaInscrito() { return inscrito; }
    public abstract void inscribir();
    public abstract double calcularPoliza();
    public abstract void imprimirPoliza();
    public abstract String obtenerNivel();
}
