package com.job.test.ejercicioIntercorp.controller;

import com.job.test.ejercicioIntercorp.dto.Cliente;
import com.job.test.ejercicioIntercorp.dto.KpiCliente;
import com.job.test.ejercicioIntercorp.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    private ClienteService service;

    @ApiOperation(
            value = "Registra un cliente",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            httpMethod = "POST"
    )
    @ApiResponses({
            @ApiResponse(code = 201, message = "Se registro el cliente"),
            @ApiResponse(code = 400, message = "Hay un error en los campos de la peticion"),
            @ApiResponse(code = 500, message = "No se pudo registrar el cliente")
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/creacliente", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void crearCliente(@RequestBody Cliente cliente) {
        service.crearCliente(cliente);
    }

    @ApiOperation(
            value = "Obtiene kpi de los clientes",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            httpMethod = "GET"
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "Devuelve el promedio de edad y desviación estandar de todos los clientes", response = KpiCliente.class),
            @ApiResponse(code = 500, message = "No se pudo obteper el kpi de los clientes")
    })
    @GetMapping(value = "/kpideclientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public KpiCliente kpiDeCliente() {
        return service.kpiCliente();
    }

    @ApiOperation(
            value = "Obtiene la lista de todos los clientes",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            httpMethod = "GET"
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "Devuelve la lista de todos los clientes registrados", response = Cliente.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "No se pudo obtener la lista de los clientes registrados")
    })
    @GetMapping(value = "/listclientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> listarClientes() {
        return service.listCliente();
    }


}
