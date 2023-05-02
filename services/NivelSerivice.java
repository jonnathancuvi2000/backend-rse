
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Nivel;
import java.util.List;

public interface NivelSerivice {
    
    Nivel insertarNivel(Nivel p);
    List<Nivel> listarNivel();
    Nivel listarID(int id);
    Nivel editar(Nivel p);
    Nivel eliminar(int id);
}
