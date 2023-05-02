
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Dimension;
import com.sinfloo.ejemplo01.repository.DimensionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DimensionServiceImp implements DimensionService{

    @Autowired
    private DimensionRepositorio repositorio;
    
    @Override
    public Dimension insertarDimension(Dimension p) {
        return repositorio.save(p);
    }

    @Override
    public List<Dimension> listarDimensiones() {
        return repositorio.findAll();
    }

    @Override
    public Dimension listarID(int id) {
        return  repositorio.findOne(id);
    }

    @Override
    public Dimension editar(Dimension p) {
        return repositorio.save(p);
    }

    @Override
    public Dimension eliminar(int id) {
        Dimension p = repositorio.findOne(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }
    
}
