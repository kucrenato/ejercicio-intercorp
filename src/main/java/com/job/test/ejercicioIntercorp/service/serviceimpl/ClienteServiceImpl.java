package com.job.test.ejercicioIntercorp.service.serviceimpl;

import com.job.test.ejercicioIntercorp.dto.Cliente;
import com.job.test.ejercicioIntercorp.dto.KpiCliente;
import com.job.test.ejercicioIntercorp.service.ClienteService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public void crearCliente(Cliente cliente) {
        System.out.println("hola hola: " + cliente);
    }

    @Override
    public KpiCliente kpiCliente() {
        return null;
    }

    @Override
    public List<Cliente> listCliente() {
        return null;
    }
}
