package com.example.MecanicoMain.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pago", url = "http://localhost:8081")
public interface PagoClient {
    void crear(@RequestBody PagoRequest pago);
}
