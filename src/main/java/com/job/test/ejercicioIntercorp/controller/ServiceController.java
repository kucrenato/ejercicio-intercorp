package com.job.test.ejercicioIntercorp.controller;

import com.job.test.ejercicioIntercorp.dto.Cliente;
import com.job.test.ejercicioIntercorp.dto.KpiCliente;
import com.job.test.ejercicioIntercorp.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private ClienteService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/creacliente")
    public void crearCliente(@RequestBody Cliente cliente) {
        service.crearCliente(cliente);
    }

    @GetMapping("/kpideclientes")
    public KpiCliente kpiDeCliente() {
        return service.kpiCliente();
    }

    @GetMapping("/listclientes")
    public List<Cliente> listarClientes() {
        return service.listCliente();
    }


}
