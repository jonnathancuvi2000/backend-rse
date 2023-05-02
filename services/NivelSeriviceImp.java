package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Nivel;
import com.sinfloo.ejemplo01.repository.NivelRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NivelSeriviceImp implements NivelSerivice {

    @Autowired
    private NivelRepositorio repositorio;

    @Override
    public Nivel insertarNivel(Nivel p) {
        return repositorio.save(p);
    }

    @Override
    public List<Nivel> listarNivel() {
        return repositorio.findAll();
    }

    @Override
    public Nivel listarID(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Nivel editar(Nivel p) {
        return repositorio.save(p);
    }

    @Override
    public Nivel eliminar(int id) {
        Nivel p = repositorio.findOne(id);
        if (p != null) {//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }

}
