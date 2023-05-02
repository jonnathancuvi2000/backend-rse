package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Indicador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sinfloo.ejemplo01.repository.IndicadorRepositorio;

@Service
public class IndicadorServiceImp implements IndicadorService {

    @Autowired
    private IndicadorRepositorio repositorio;

    @Override
    public List<Indicador> listarIndicador() {
        return repositorio.findAll();
    }

    @Override
    public Indicador ingresarIndicador(Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public Indicador listarID(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Indicador editar(Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public Indicador eliminar(int id) {
        Indicador p = repositorio.findOne(id);
        if (p != null) {//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }

}
