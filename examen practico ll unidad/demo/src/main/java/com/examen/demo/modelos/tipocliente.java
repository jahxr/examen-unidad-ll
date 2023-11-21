package com.examen.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 
    @Setter
    @Getter
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor

@Table (name = "tipocliente")
public class tipocliente {
    @Id
    @Column(name = "idTipoCliente")
private int idTipoCliente;
@Column(name = "descripcion")
private String descripcion;

@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
private List clientes;
}
