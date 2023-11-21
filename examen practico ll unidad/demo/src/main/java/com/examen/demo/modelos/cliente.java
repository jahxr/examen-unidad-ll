package com.examen.demo.modelos;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class cliente {
@Id
@Column(name = "codigocliente")
private int codigocliente;

private String nombre;
private String apellido;

@Column(name = "fechaingreso")
@JsonFormat(pattern = "yyyy-MM-dd")
private Date fechaingreso;
@Column(name="idTipoCliente")
private int idTipoCliente;
}
