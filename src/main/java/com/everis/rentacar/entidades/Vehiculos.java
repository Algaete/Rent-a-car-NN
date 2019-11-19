package com.everis.rentacar.entidades;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Document(collection="Vehiculo")
public class Vehiculos implements Serializable {
    @Id
    @NotNull

}
