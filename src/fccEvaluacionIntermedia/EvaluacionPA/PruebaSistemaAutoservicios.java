package fcc.EvaluacionPA;
import java.util.Scanner;
public class PruebaSistemaAutoservicios {
    private static final Scanner entrada = new Scanner(System.in);
    private static final SistemaAutoservicios sistema = new SistemaAutoservicios();
    private static final String AUTOR = "Alfredo Gaspar Matricula 202512146";
    public static void main(String[] args){
        int opcion;
        do {
            encabezado();
            System.out.println("1. Inscribir medio superior y generar poliza");
            System.out.println("2. Inscribir superior y generar poliza");
            System.out.println("3. Inscribir posgrado y generar poliza");
            System.out.println("4. Mostrar inscripciones realizadas");
            System.out.println("5. Salir");
            opcion=entero("Opcion: ",1,5);
            switch(opcion){
                case 1: registrarMedioSuperior(); break;
                case 2: registrarSuperior(); break;
                case 3: registrarPosgrado(); break;
                case 4: listar(); break;
                case 5: System.out.println("FIN DEL SISTEMA DE AUTOSERVICIOS"); break;
            }
        }while(opcion!=5);
    }
    private static void encabezado(){
        System.out.println("\n===============================================================");
        System.out.println(" EVALUACION DEPARTAMENTAL 2 - SISTEMA WEB AUTOSERVICIOS");
        System.out.println(" AUTOR: "+AUTOR);
        System.out.println(" OBJETIVO: INSCRIBIR ESTUDIANTES Y GENERAR POLIZAS POLIMORFICAS");
        System.out.println("===============================================================");
    }
    private static String texto(String mensaje){
        while(true){ System.out.print(mensaje); String valor=entrada.nextLine().trim();
            if(!valor.isEmpty())return valor;
            System.out.println("El dato es obligatorio.");
        }
    }
    private static int entero(String mensaje,int minimo,int maximo){
        while(true){
            try {int valor=Integer.parseInt(texto(mensaje));
                if(valor>=minimo&&valor<=maximo)return valor;
            }catch(NumberFormatException ex){}
            System.out.println("Valor entero fuera de rango.");
        }
    }
    private static double importe(String mensaje){
        while(true){
            try{double v=Double.parseDouble(texto(mensaje).replace(',','.'));
                if(Double.isFinite(v)&&v>=0)return v;
            }catch(NumberFormatException ex){}
            System.out.println("El importe debe ser numerico y no negativo.");
        }
    }
    private static String[] generales(){
        String[] d=new String[7];
        d[0]=texto("Nombre(s): ");d[1]=texto("Apellido paterno: ");
        d[2]=texto("Apellido materno: ");d[3]=texto("CURP: ");
        d[4]=texto("Fecha nacimiento (AAAA-MM-DD): ");
        d[5]=texto("Genero: ");d[6]=texto("Contrasena de autoservicios: ");
        return d;
    }
    private static void registrarMedioSuperior(){
        System.out.println("\n--- CAPTURA: MEDIO SUPERIOR ---");
        String[] d=generales();
        String tutor=texto("Nombre del tutor: ");
        String preparatoria=texto("Preparatoria asignada: ");
        double semestral=importe("Cuota semestral (MXN): ");
        double prep=importe("Cuota de preparatoria (MXN): ");
        Estudiante e=new EstudianteMedioSuperior(d[0],d[1],d[2],d[3],d[4],d[5],
                sistema.generarMatricula(),d[6],tutor,preparatoria,semestral,prep);
        sistema.registrar(e);
    }
    private static void registrarSuperior(){
        System.out.println("\n--- CAPTURA: SUPERIOR ---");
        String[] d=generales();
        String licenciatura=texto("Licenciatura elegida: ");
        String modalidad=texto("Modalidad: ");String plan=texto("Plan: ");
        int creditos=entero("Numero de creditos: ",0,1000);
        double costo=importe("Costo de cada credito (MXN): ");
        Estudiante e=new EstudianteSuperior(d[0],d[1],d[2],d[3],d[4],d[5],
                sistema.generarMatricula(),d[6],licenciatura,modalidad,plan,creditos,costo);
        sistema.registrar(e);
    }
    private static void registrarPosgrado(){
        System.out.println("\n--- CAPTURA: POSGRADO ---");
        String[] d=generales();
        String tipo=texto("Tipo de posgrado (Maestria/Doctorado): ");
        String programa=texto("Programa educativo: ");
        String clave=texto("Clave del programa: ");
        boolean beca=texto("Tiene beca Conacyt? (S/N): ").equalsIgnoreCase("S");
        double semestral=importe("Cuota semestral (MXN): ");
        Estudiante e=new EstudiantePosgrado(d[0],d[1],d[2],d[3],d[4],d[5],
                sistema.generarMatricula(),d[6],tipo,programa,clave,beca,semestral);
        sistema.registrar(e);
    }
    private static void listar(){
        System.out.println("\n--- INSCRIPCIONES ---");
        for(Estudiante e:sistema.consultarEstudiantes()){
            System.out.printf("%s | %s | %s | $%.2f MXN%n",e.obtenerMatricula(),
                    e.obtenerNivel(),e.obtenerNombreCompleto(),e.calcularPoliza());
        }
        if(sistema.consultarEstudiantes().isEmpty())System.out.println("Sin registros.");
    }
}
