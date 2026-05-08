package com.example.MecanicoMain.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Notation;

import com.example.MecanicoMain.Client.FacturaClient;
import com.example.MecanicoMain.Client.HistorialClient;
import com.example.MecanicoMain.Client.NotificacionClient;
import com.example.MecanicoMain.Client.PagoClient;
import com.example.MecanicoMain.Client.ReparacionClient;
import com.example.MecanicoMain.DTO.ProcesoRequest;
import com.example.MecanicoMain.Repository.MecanicoRepository;

@Service
public class MecanicoService {
    @Autowired
    private PagoClient pago;

    @Autowired
    private FacturaClient factura;

    // @Autowired
    // private Repuesto repuesto;
    
    @Autowired
    private NotificacionClient notificacion;

    @Autowired
    private MecanicoRepository repo;
 
    @Autowired
    private ReparacionClient reparacionClient;
 
    @Autowired
    private PagoClient pagoClient;
 
    @Autowired
    private FacturaClient facturaClient;
 
    @Autowired
    private HistorialClient historialClient;
 
    @Autowired
    private NotificacionClient notificacionClient;
 
    public void procesoCompletado(ProcesoRequest request) {
 
        // Reparacion
        ReparacionRequest repa = new ReparacionRequest();
        repa.setDescripcion(request.getDescripcionReparacion());
        repa.setEstado(request.getEstadoReparacion());
        repa.setMotoId(request.getMotoId());
        reparacionClient.crear(repa);
 
        // Pago
        PagoRequest pa = new PagoRequest();
        pa.setMonto(request.getMontoPago());
        pa.setFecha(request.getFechaPago());
        pagoClient.crear(pa);
 
        // Factura
        FacturaRequest fac = new FacturaRequest();
        fac.setTotal(request.getTotalFactura());
        fac.setFecha(request.getFechaFactura());
        facturaClient.crear(fac);
 
        // Historial
        HistorialRequest hist = new HistorialRequest();
        hist.setDescripcion(request.getDescripcionHistorial());
        hist.setFecha(request.getFechaHistorial());
        historialClient.crear(hist);
 
        // Notificacion
        NotificacionRequest n = new NotificacionRequest();
        n.setMensaje(request.getMensajeNotificacion());
        notificacionClient.crear(n);
    }
}
