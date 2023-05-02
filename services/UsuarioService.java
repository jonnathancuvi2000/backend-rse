
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Usuario;
import java.util.List;

public interface UsuarioService {
    
    Usuario insertarUsuario(Usuario p);
    List<Usuario> listarUsuarios();
    Usuario listarID(int id);
    Usuario editar(Usuario p);
    Usuario eliminar(int id);
    
}
