package com.job.test.ejercicioIntercorp.service.serviceimpl;

import com.job.test.ejercicioIntercorp.dto.Cliente;
import com.job.test.ejercicioIntercorp.dto.KpiCliente;
import com.job.test.ejercicioIntercorp.service.ClienteService;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClienteServiceImpl implements ClienteService {

    List<Cliente> clientesList = new ArrayList<>();

    public static final int ESPERANZA_DE_VIDA = 72;

    @Override
    public void crearCliente(Cliente cliente) {
        LocalDate date = cliente.getFechaNac().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        date = date.plusYears(ESPERANZA_DE_VIDA);
        cliente.setFechaMuerte(Date.valueOf(date));
        clientesList.add(cliente);
    }

    @Override
    public KpiCliente kpiCliente() {
        int cantidadClientes = clientesList.size();
        float total = clientesList.stream().mapToInt(cliente -> cliente.getEdad()).sum();
        float promedio = total / cantidadClientes;
        double rango = clientesList.stream().mapToDouble((cliente -> Math.pow(cliente.getEdad() - promedio, 2))).sum();
        double varianza = rango / cantidadClientes;
        double desviacionEstandar = Math.sqrt(varianza);
        return new KpiCliente(promedio, desviacionEstandar);
    }

    @Override
    public List<Cliente> listCliente() {
        return clientesList;
    }
}
