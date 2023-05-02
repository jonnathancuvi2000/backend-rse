
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Estadio_Descripcion;
import com.sinfloo.ejemplo01.entidades.Indicador;
import java.util.List;

public interface Estadio_Descripcion_Service {
    List<Estadio_Descripcion>listar();
    Estadio_Descripcion listarId(int id);
    Estadio_Descripcion add(Estadio_Descripcion p);
    Estadio_Descripcion edit(Estadio_Descripcion p);
    Estadio_Descripcion delete(int id);
    
    
    List<Estadio_Descripcion>listarDescrpcionesNombres();
}
