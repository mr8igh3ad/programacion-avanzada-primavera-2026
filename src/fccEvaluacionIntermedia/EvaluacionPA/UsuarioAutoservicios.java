package fcc.EvaluacionPA;
public abstract class UsuarioAutoservicios {
    private final String nombre, apellidoPaterno, apellidoMaterno;
    private final String curp, fechaNacimiento, genero, usuario, contrasena;
    public UsuarioAutoservicios(String nombre, String paterno, String materno, String curp,
            String fechaNacimiento, String genero, String usuario, String contrasena) {
        this.nombre=nombre; this.apellidoPaterno=paterno; this.apellidoMaterno=materno;
        this.curp=curp; this.fechaNacimiento=fechaNacimiento; this.genero=genero;
        this.usuario=usuario; this.contrasena=contrasena;
    }
    public String obtenerNombreCompleto() { return nombre+" "+apellidoPaterno+" "+apellidoMaterno; }
    public String obtenerCURP() { return curp; }
    public String obtenerFechaNacimiento() { return fechaNacimiento; }
    public String obtenerGenero() { return genero; }
    public String obtenerUsuario() { return usuario; }
    public boolean autenticar(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }
}
