package com.examen.demo.servicios;

import java.util.List;

import com.examen.demo.modelos.cliente;

public interface ClienteService {
    public cliente crearcliente(cliente cliente);

    public cliente guardarcliente(cliente cliente);

    public String eliminarcliente(String id);

    public List<cliente> obtenerTodos();

    public boolean tipocliente(char tipocliente);

    
    
}
