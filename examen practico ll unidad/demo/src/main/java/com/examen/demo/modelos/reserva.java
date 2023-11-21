package com.examen.demo.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class reserva {
   @Id
@Column(name = "idReserva")
private int idReserva;
@Column(name="idCliente")
private int idCliente ;
@Column(name = "idVehiculo")
private int idVehiculo ;
@Column(name = "fecha")
private Date fecha;

@Column(name = "dias")
private int dias;


@Column(name="total")
private double total; 
}
