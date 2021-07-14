package com.job.test.ejercicioIntercorp.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class KpiCliente {

    @ApiModelProperty(
            name = "edadProm",
            value = "Edad promedio de todos los clientes",
            example = "30.5",
            dataType = "double"
    )
    private double edadProm;

    @ApiModelProperty(
            name = "desviacionEstandar",
            value = "desviacion estandar",
            example = "3.45",
            dataType = "double"
    )
    private double desviacionEstandar;

}
