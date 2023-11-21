package com.examen.demo.servicios.implservicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen.demo.modelos.cliente;
import com.examen.demo.repositorios.clienterepositorio;
import com.examen.demo.servicios.ClienteService;

public class clienteimplservice implements ClienteService{

    @Autowired
    private clienterepositorio clienteRepository;
    private Object clienterepositorio;

    @Override
    public cliente crearcliente(cliente cliente) {
        return cliente;
        // TODO Auto-generated method stub
    
    }

    @Override
    public cliente guardarcliente(cliente cliente) {
        return cliente;
        // TODO Auto-generated method stub
        
    }
    

    @Override
    public String eliminarcliente(String cliente) {
        return cliente;
        // TODO Auto-generated method stub
        
        
    }
    @Override
    public List<cliente> obtenerTodos() {
        return null;
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean tipocliente(char tipocliente) {
        return false;
        // TODO Auto-generated method stub
       
    
} 
}
    

