package com.job.test.ejercicioIntercorp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cliente {

    private String nombre;
    private String apellido;
    private String edad;
    private String fechaNac;
    private String fechaMuerte;

}
