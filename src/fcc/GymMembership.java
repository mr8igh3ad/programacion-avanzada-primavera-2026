package fcc;

public class GymMembership {

    protected String nombreMiembro;
    protected String tipoMembresia;
    protected int duracionMeses;

    public GymMembership(
            String nombreMiembro,
            String tipoMembresia,
            int duracionMeses) {

        this.nombreMiembro =
                nombreMiembro;

        this.tipoMembresia =
                tipoMembresia;

        this.duracionMeses =
                duracionMeses;
    }

    public double calcularCuota() {

        double cuotaMensual = 500;

        return cuotaMensual
                * duracionMeses;
    }

    public boolean tieneOfertaEspecial() {

        return duracionMeses >= 12;
    }
}


class PremiumMembership
        extends GymMembership {

    private boolean entrenadorPersonal;
    private boolean accesoSpa;

    public PremiumMembership(
            String nombreMiembro,
            int duracionMeses,
            boolean entrenadorPersonal,
            boolean accesoSpa) {

        super(
                nombreMiembro,
                "Premium",
                duracionMeses
        );

        this.entrenadorPersonal =
                entrenadorPersonal;

        this.accesoSpa =
                accesoSpa;
    }

    @Override
    public double calcularCuota() {

        double cuotaMensual = 900;

        return cuotaMensual
                * duracionMeses;
    }

    public void mostrarBeneficios() {

        System.out.println(
                "Entrenador personal: "
                + entrenadorPersonal
        );

        System.out.println(
                "Acceso al spa: "
                + accesoSpa
        );
    }
}