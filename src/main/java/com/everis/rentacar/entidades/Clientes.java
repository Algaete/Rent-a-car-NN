package com.everis.rentacar.entidades;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Collection;

@Data
@Document(collection="Clientes")
public class Clientes implements Serializable {
    @Id
    @NotNull
    private String Id;

    private String nombre;
    private String apellidos;
    private String rut;
    private String sexo;
    private String edad;
    private String permiso;
    private String fecha_incorporacion;
    private String sueldo_base;
    private String bono_servicio;

}
