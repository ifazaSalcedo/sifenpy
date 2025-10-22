package com.py.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.py.service.SifenService;
import com.py.sifenpy.client.ruc.RResEnviConsRUC;

@RestController
@RequestMapping("/api/sifen")
public class SifenController {

    private final SifenService sifenService;

    public SifenController(SifenService sifenService) {
        this.sifenService = sifenService;
    }

    @GetMapping("/consulta-ruc/{ruc}")
    public ResponseEntity<RResEnviConsRUC> consultarRuc(@PathVariable String ruc) {
        RResEnviConsRUC response = sifenService.consultarRuc(ruc);
        return ResponseEntity.ok(response);
    }
}