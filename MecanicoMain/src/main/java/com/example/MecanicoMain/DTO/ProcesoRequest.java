package com.example.MecanicoMain.DTO;

import lombok.Data;

@Data
public class ProcesoRequest {

    private String descripcionReparacion;
    private String estado;

    private double montoPago;

    private double totalFactura;

    private String descripcionHistorial;

    private String mensajeNotificacion;
}
