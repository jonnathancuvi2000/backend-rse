
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Estadio_Nombre;
import com.sinfloo.ejemplo01.entidades.Indicador;
import java.util.List;

public interface Estadio_Nombre_Service {
    List<Estadio_Nombre>listar();
    Estadio_Nombre listarId(int id);
    Estadio_Nombre add(Estadio_Nombre p);
    Estadio_Nombre edit(Estadio_Nombre p);
    Estadio_Nombre delete(int id);
    
    List<Estadio_Nombre>listarEstadioNombreDescripcion();
}
