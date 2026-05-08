package com.example.MecanicoMain.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "factura", url = "http://localhost:8082")
public interface FacturaClient {
    void crear(@RequestBody FacturaRequest factura);
}
