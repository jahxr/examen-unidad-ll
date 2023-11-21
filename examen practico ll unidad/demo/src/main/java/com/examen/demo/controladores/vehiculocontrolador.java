package com.examen.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.demo.modelos.tipovehiculo;
import com.examen.demo.modelos.vehiculo;
import com.examen.demo.servicios.implservicios.vehiculoimplservice;

 @RestController
@RequestMapping("/api/vehiculo")
public class vehiculocontrolador {
     @Autowired
    private vehiculoimplservice vehiculoimplservice;
    
    
     @PostMapping("/crear")
    public vehiculo createvehiculo(@RequestBody vehiculo vehiculo){
        return this.vehiculoimplservice.crear(vehiculo);
        
}
 @PostMapping("/crear7tipovehiculo")
    public tipovehiculo createtipovehiculo(@RequestBody tipovehiculo tipovehiculo){
        return this.tipovehiculoimplservice.crear(tipovehiculo);
        
}
    }
