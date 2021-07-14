package com.job.test.ejercicioIntercorp.service;

import com.job.test.ejercicioIntercorp.dto.Cliente;
import com.job.test.ejercicioIntercorp.dto.KpiCliente;
import java.util.List;

public interface ClienteService {

    void crearCliente(Cliente cliente);

    KpiCliente kpiCliente();

    List<Cliente> listCliente();

}
