
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Estandar;
import java.util.List;

public interface EstandarService {
    
    Estandar insertarEstandar(Estandar p);
    List<Estandar> listarEstandares();
    Estandar listarID(int id);
    Estandar editar(Estandar p);
    Estandar eliminar(int id);
    
}
