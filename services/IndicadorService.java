
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Indicador;
import java.util.List;

public interface IndicadorService {
    List<Indicador> listarIndicador();
    Indicador ingresarIndicador(Indicador p);
    Indicador listarID(int id);
    Indicador editar(Indicador p);
    Indicador eliminar(int id);
}
