package com.example.MecanicoMain.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MecanicoMain.DTO.ProcesoRequest;
import com.example.MecanicoMain.Service.MecanicoService;

@RestController
@RequestMapping("/mecanicos")
public class MecanicoController {
    @Autowired
    private MecanicoService serv;

    @PostMapping("/proceso")
    public void ejecutar(@RequestBody ProcesoRequest request) {
        serv.procesoCompletado(request);
    }
}
