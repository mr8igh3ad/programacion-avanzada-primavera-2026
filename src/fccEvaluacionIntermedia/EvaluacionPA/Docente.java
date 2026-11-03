package fcc.EvaluacionPA;
public class Docente extends UsuarioAutoservicios {
    private final String numeroTrabajador;
    public Docente(String nombre,String paterno,String materno,String curp,String nacimiento,
            String genero,String usuario,String contrasena,String numeroTrabajador) {
        super(nombre,paterno,materno,curp,nacimiento,genero,usuario,contrasena);
        this.numeroTrabajador=numeroTrabajador;
    }
    public String obtenerNumeroTrabajador(){return numeroTrabajador;}
}
