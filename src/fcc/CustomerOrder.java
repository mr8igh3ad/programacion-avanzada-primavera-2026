package fcc;

import java.time.LocalDate;

public class CustomerOrder {

    protected int idPedido;
    protected String cliente;
    protected LocalDate fechaPedido;

    public CustomerOrder(
            int idPedido,
            String cliente,
            LocalDate fechaPedido) {

        this.idPedido = idPedido;
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
    }
}


class OnlineOrder extends CustomerOrder {

    private String direccionEntrega;
    private String numeroSeguimiento;
    private String estado;

    public OnlineOrder(
            int idPedido,
            String cliente,
            LocalDate fechaPedido,
            String direccionEntrega,
            String numeroSeguimiento) {

        super(
                idPedido,
                cliente,
                fechaPedido
        );

        this.direccionEntrega =
                direccionEntrega;

        this.numeroSeguimiento =
                numeroSeguimiento;

        estado = "Preparando pedido";
    }

    public int calcularTiempoEntrega() {

        if (direccionEntrega
                .toLowerCase()
                .contains("puebla")) {

            return 2;
        }

        return 5;
    }

    public void actualizarEstado(
            String nuevoEstado) {

        estado = nuevoEstado;
    }

    public void mostrarDatos() {

        System.out.println(
                "Pedido: " + idPedido
        );

        System.out.println(
                "Cliente: " + cliente
        );

        System.out.println(
                "Direccion: "
                + direccionEntrega
        );

        System.out.println(
                "Seguimiento: "
                + numeroSeguimiento
        );

        System.out.println(
                "Estado: " + estado
        );
    }
}