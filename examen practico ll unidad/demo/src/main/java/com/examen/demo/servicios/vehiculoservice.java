package com.examen.demo.servicios;

import java.util.List;

import com.examen.demo.modelos.cliente;
import com.examen.demo.modelos.vehiculo;

public interface vehiculoservice {

    public cliente crearvehiculo(cliente cliente);

    public cliente guardarvehiculo(vehiculo vehiculo);

    public String eliminarvehiculo(String id);

    public List<vehiculo> obtenerTodos();

    public boolean tipovehiculo(char tipovehiculo);
} 



