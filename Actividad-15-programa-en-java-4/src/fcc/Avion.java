package fcc;

import java.time.LocalTime;

public class Avion {

    private String numeroVuelo;
    private String destino;
    private LocalTime horaSalida;
    private boolean retrasado;
    private int minutosRetraso;

    public Avion(
            String numeroVuelo,
            String destino,
            LocalTime horaSalida) {

        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;

        retrasado = false;
        minutosRetraso = 0;
    }

    public void retrasarVuelo(int minutos) {

        retrasado = true;
        minutosRetraso = minutos;
    }

    public void verificarEstado() {

        System.out.println(
                "Vuelo: " + numeroVuelo
        );

        System.out.println(
                "Destino: " + destino
        );

        System.out.println(
                "Hora salida: " + horaSalida
        );

        if (retrasado) {

            System.out.println(
                    "Retrasado "
                    + minutosRetraso
                    + " minutos."
            );

        } else {

            System.out.println(
                    "Vuelo a tiempo."
            );
        }
    }
}