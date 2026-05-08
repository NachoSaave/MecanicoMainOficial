package com.example.MecanicoMain.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notificacion", url = "http://localhost:8084")
public interface NotificacionClient {
    void crear(@RequestBody NotificacionRequest notificacion);
}
