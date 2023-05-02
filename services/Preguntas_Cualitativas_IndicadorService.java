/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Preguntas_Cualitativas_Indicador;
import java.util.List;

public interface Preguntas_Cualitativas_IndicadorService {
    
    Preguntas_Cualitativas_Indicador insertarPregunta_Cualitativa_Indicador(Preguntas_Cualitativas_Indicador p); 
    List<Preguntas_Cualitativas_Indicador> listarPreguntas_Culitativas_Inidador();
    Preguntas_Cualitativas_Indicador listarID(int id);
    Preguntas_Cualitativas_Indicador editar(Preguntas_Cualitativas_Indicador p);
    Preguntas_Cualitativas_Indicador eliminar(int id);
}
