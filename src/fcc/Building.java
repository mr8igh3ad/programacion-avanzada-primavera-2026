package fcc;

public class Building {

    protected String direccion;
    protected int numeroPisos;
    protected double areaTotal;

    public Building(
            String direccion,
            int numeroPisos,
            double areaTotal) {

        this.direccion = direccion;
        this.numeroPisos = numeroPisos;
        this.areaTotal = areaTotal;
    }
}


class ResidentialBuilding extends Building {

    private int numeroApartamentos;
    private double rentaPorApartamento;

    public ResidentialBuilding(
            String direccion,
            int numeroPisos,
            double areaTotal,
            int numeroApartamentos,
            double rentaPorApartamento) {

        super(
                direccion,
                numeroPisos,
                areaTotal
        );

        this.numeroApartamentos =
                numeroApartamentos;

        this.rentaPorApartamento =
                rentaPorApartamento;
    }

    public double calcularRentaTotal() {

        return numeroApartamentos
                * rentaPorApartamento;
    }
}


class CommercialBuilding extends Building {

    private int numeroOficinas;
    private double rentaPorOficina;

    public CommercialBuilding(
            String direccion,
            int numeroPisos,
            double areaTotal,
            int numeroOficinas,
            double rentaPorOficina) {

        super(
                direccion,
                numeroPisos,
                areaTotal
        );

        this.numeroOficinas =
                numeroOficinas;

        this.rentaPorOficina =
                rentaPorOficina;
    }

    public double calcularRentaTotal() {

        return numeroOficinas
                * rentaPorOficina;
    }
}