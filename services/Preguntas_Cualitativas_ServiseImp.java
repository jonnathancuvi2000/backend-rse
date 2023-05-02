/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Preguntas_Cualitativas;
import com.sinfloo.ejemplo01.repository.Preguntas_Cualitativas_Repositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonnathan
 */
@Service
public class Preguntas_Cualitativas_ServiseImp implements Preguntas_Cualitativas_Service{

    @Autowired
    private Preguntas_Cualitativas_Repositorio repositorio;
    
    @Override
    public Preguntas_Cualitativas insertarPreguntasCualitativas(Preguntas_Cualitativas p) {
        return repositorio.save(p);
    }

    @Override
    public List<Preguntas_Cualitativas> listarPreguntasCualitativas() {
        return repositorio.findAll();
    }

    @Override
    public Preguntas_Cualitativas listarID(int id) {
        return  repositorio.findOne(id);
    }

    @Override
    public Preguntas_Cualitativas editar(Preguntas_Cualitativas p) {
        return repositorio.save(p);
    }

    @Override
    public Preguntas_Cualitativas eliminar(int id) {
        Preguntas_Cualitativas p = repositorio.findOne(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }
    
}
