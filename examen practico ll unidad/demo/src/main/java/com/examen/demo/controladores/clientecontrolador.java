package com.examen.demo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen.demo.modelos.cliente;
import com.examen.demo.modelos.vehiculo;
import com.examen.demo.servicios.implservicios.clienteimplservice;


@RestController
@RequestMapping("/api/cliente")
public class clientecontrolador {
     @Autowired
    private clienteimplservice clienteServiceImpl;
    private Object clienteimplservice;

     @PostMapping("/crear")
    public cliente createcliente(@RequestBody cliente cliente){
        return this.clienteServiceImpl.crear(cliente);
    }

    @PostMapping("/guardar")
    public cliente guardarCliente(@RequestBody cliente nvocliente){
        return ((clientecontrolador) this.clienteimplservice).guardarCliente(nvocliente);
    }

    @GetMapping("/todos")
    public List<cliente> obtenerTodos(){
        return ((com.examen.demo.servicios.implservicios.clienteimplservice) this.clienteimplservice).obtenerTodos();
    }
    

}

