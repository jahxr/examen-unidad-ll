package com.examen.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class vehiculo {
   @Id 
    @Column(name = "idVehiculo")
private int idVehiculo; 
@Column(name = "marca")
private String marca; 
@Column(name = "anio")
private int anio;
@Column(name = "disponible")
private boolean diisponible;
@Column(name = "idTipoVehiculo")
private int idTipoVehiculo;
}
