
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Estadio_Descripcion;
import com.sinfloo.ejemplo01.repository.Estadio_Descripcion_Repositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Estadio_Descripcion_ServiceImp implements Estadio_Descripcion_Service{
    @Autowired
    private Estadio_Descripcion_Repositorio repositorio;

    @Override
    public List<Estadio_Descripcion> listar() {
        return repositorio.findAll();
    }

    @Override
    public List<Estadio_Descripcion> listarDescrpcionesNombres() {
        return  repositorio.listar_esatdio_descripciones();
    }

    
    
    @Override
    public Estadio_Descripcion listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estadio_Descripcion add(Estadio_Descripcion p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estadio_Descripcion edit(Estadio_Descripcion p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estadio_Descripcion delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
