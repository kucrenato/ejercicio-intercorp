package com.job.test.ejercicioIntercorp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cliente implements Serializable {

    @ApiModelProperty(
            name = "nombre",
            value = "nombre del cliente",
            example = "renato",
            dataType = "String"
    )
    private String nombre;

    @ApiModelProperty(
            name = "apellido",
            value = "apellido del cliente",
            example = "kuc",
            dataType = "String"
    )
    private String apellido;

    @ApiModelProperty(
            name = "edad",
            value = "edad del cliente",
            example = "26",
            dataType = "int"
    )
    private int edad;

    @ApiModelProperty(
            name = "fechaNac",
            value = "fecha de nacimiento del cliente",
            example = "1945-05-18",
            dataType = "Date"
    )
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fechaNac;

    @ApiModelProperty(
            name = "fechaMuerte",
            value = "fecha probable de muerte del cliente",
            example = "2007-05-20",
            dataType = "Date"
    )
    private Date fechaMuerte;

}
