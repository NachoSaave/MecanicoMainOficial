package com.example.MecanicoMain.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "historial", url = "http://localhost:8083")
public interface HistorialClient {
void crear(@RequestBody HistorialRequest factura);
}
