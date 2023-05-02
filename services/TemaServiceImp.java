package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Tema;
import com.sinfloo.ejemplo01.repository.TemaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaServiceImp implements TemaService {

    @Autowired
    private TemaRepositorio repositorio;

    @Override
    public Tema insertarTema(Tema p) {
        return repositorio.save(p);
    }

    @Override
    public List<Tema> listarTema() {
        return repositorio.findAll();
    }

    @Override
    public Tema listarID(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Tema editar(Tema p) {
        return repositorio.save(p);
    }

    @Override
    public Tema eliminar(int id) {
        Tema p = repositorio.findOne(id);
        if (p != null) {//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }

}
