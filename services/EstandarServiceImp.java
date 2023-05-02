
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Estandar;
import com.sinfloo.ejemplo01.repository.EstandarRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstandarServiceImp implements EstandarService{

    @Autowired
    private EstandarRepositorio repositorio;
    
    @Override
    public Estandar insertarEstandar(Estandar p) {
        return repositorio.save(p);
    }

    @Override
    public List<Estandar> listarEstandares() {
        return repositorio.findAll();
    }

    @Override
    public Estandar listarID(int id) {
       return repositorio.findOne(id);
    }

    @Override
    public Estandar editar(Estandar p) {
        return repositorio.save(p);
    }

    @Override
    public Estandar eliminar(int id) {
        Estandar p = repositorio.findOne(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }
    
}
