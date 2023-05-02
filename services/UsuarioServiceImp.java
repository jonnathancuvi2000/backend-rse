package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Usuario;
import com.sinfloo.ejemplo01.repository.UsuarioRepositorio;
import com.sinfloo.ejemplo01.utilerias.BCrypt;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public Usuario insertarUsuario(Usuario p) {

        //para encriptar
        //p.setContrasena(BCrypt.hashpw(p.getContrasena(), BCrypt.gensalt()));
        return repositorio.save(p);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return repositorio.findAll();
    }

    @Override
    public Usuario listarID(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Usuario editar(Usuario p) {
        return repositorio.save(p);
    }

    @Override
    public Usuario eliminar(int id) {
        Usuario p = repositorio.findOne(id);
        if(p!=null){//comprobamos si el objeto existe
            repositorio.delete(p);
        }
        return p;
    }

}
