
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Estadio_Nombre;
import com.sinfloo.ejemplo01.entidades.Indicador;
import com.sinfloo.ejemplo01.repository.Estadio_Nombre_Repositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Estadio_Nombre_ServiceImp implements Estadio_Nombre_Service{
    @Autowired
    private Estadio_Nombre_Repositorio repositorio;

    @Override
    public List<Estadio_Nombre> listar() {
        return  repositorio.findAll();
    }
    
    @Override
    public List<Estadio_Nombre> listarEstadioNombreDescripcion() {
        return repositorio.listar_esatdio_nombres_descripciones();
    }

    @Override
    public Estadio_Nombre listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estadio_Nombre add(Estadio_Nombre p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estadio_Nombre edit(Estadio_Nombre p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estadio_Nombre delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}
