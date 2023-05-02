
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Administrador;
import java.util.List;

public interface AdministradorService {
    
    Administrador insertarAdministrador(Administrador p); 
    List<Administrador> listarAdministrador();
    Administrador listarID(int id);
    Administrador editar(Administrador p);
    Administrador eliminar(int id);
    
}
