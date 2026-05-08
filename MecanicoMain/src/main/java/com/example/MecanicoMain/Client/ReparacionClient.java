package com.example.MecanicoMain.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "reparacion", url = "http://localhost:8080")
public interface ReparacionClient {
    void crear(@RequestBody ReparacionRequest reparacion);
}
