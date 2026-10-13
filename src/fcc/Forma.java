package fcc;

public abstract class Forma {

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}


class RectanguloForma extends Forma {

    private double ancho;
    private double alto;

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
    
    public RectanguloForma(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}


class CirculoForma extends Forma {

    private double radio;

    public CirculoForma(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}


class TrianguloForma extends Forma {

    private double base;
    private double altura;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return base;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    public TrianguloForma(
            double base,
            double altura,
            double lado2,
            double lado3) {

        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado2 + lado3;
    }
}