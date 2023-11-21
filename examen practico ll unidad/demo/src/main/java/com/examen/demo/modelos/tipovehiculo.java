package com.examen.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class tipovehiculo {
   @Id
    @Column(name = "idTipoVehiculo")
private int idTipoVehiculo;
@Column(name = "descripcion")
private String descripcion;
@Column(name = "precioXhora")
private double precioXhora;
}
