
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Tema;
import java.util.List;

public interface TemaService {
    
    Tema insertarTema(Tema p);
    List<Tema> listarTema(); 
    Tema listarID(int id);
    Tema editar(Tema p);
    Tema eliminar(int id);
}
