package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Retroalimentacion_Puntaje_Genaral;
import com.sinfloo.ejemplo01.repository.Retroalimentacion_Puntaje_GeneralRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Retroalimentacion_Puntaje_GeneralServiceImp implements Retroalimentacion_Puntaje_GeneralService {

    @Autowired
    private Retroalimentacion_Puntaje_GeneralRepositorio repositorio;

    @Override
    public Retroalimentacion_Puntaje_Genaral insertarRetroalimentacion_Puntaje_General(Retroalimentacion_Puntaje_Genaral p) {
        return repositorio.save(p);
    }

    @Override
    public List<Retroalimentacion_Puntaje_Genaral> listarRetroalimentacion_Puntaje_General() {
        return repositorio.findAll();
    }

    @Override
    public Retroalimentacion_Puntaje_Genaral listarID(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Retroalimentacion_Puntaje_Genaral editar(Retroalimentacion_Puntaje_Genaral p) {
        return repositorio.save(p);
    }

    @Override
    public Retroalimentacion_Puntaje_Genaral eliminar(int id) {
        Retroalimentacion_Puntaje_Genaral p = repositorio.findOne(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }

}
