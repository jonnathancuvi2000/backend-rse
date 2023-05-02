
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Preguntas_Cualitativas_Indicador;
import com.sinfloo.ejemplo01.repository.Preguntas_Cualitativas_IndicadorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Preguntas_Cualitativas_IndicadorServiceImp implements Preguntas_Cualitativas_IndicadorService{
    
    @Autowired
    private Preguntas_Cualitativas_IndicadorRepositorio repositorio;

    @Override
    public Preguntas_Cualitativas_Indicador insertarPregunta_Cualitativa_Indicador(Preguntas_Cualitativas_Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public List<Preguntas_Cualitativas_Indicador> listarPreguntas_Culitativas_Inidador() {
        return repositorio.findAll();
    }


    @Override
    public Preguntas_Cualitativas_Indicador listarID(int id) {
        return  repositorio.findOne(id);
    }

    @Override
    public Preguntas_Cualitativas_Indicador editar(Preguntas_Cualitativas_Indicador p) {
        return repositorio.save(p);
    }

    @Override
    public Preguntas_Cualitativas_Indicador eliminar(int id) {
        Preguntas_Cualitativas_Indicador p = repositorio.findOne(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }

    
}
