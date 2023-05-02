
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Dimension;
import java.util.List;

public interface DimensionService {
    
    Dimension insertarDimension(Dimension p); 
    List<Dimension> listarDimensiones();
    Dimension listarID(int id);
    Dimension editar(Dimension p);
    Dimension eliminar(int id);
}
