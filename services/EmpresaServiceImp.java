
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Empresa;
import com.sinfloo.ejemplo01.repository.EmpresaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImp implements EmpresaService{
    
    @Autowired
    private EmpresaRepositorio repositorio;

    @Override
    public Empresa insertarEmpresa(Empresa p) {
        return repositorio.save(p);
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return repositorio.findAll();
    }

    @Override
    public Empresa listarEmpresaID(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Empresa editarEmpresa(Empresa p) {
        return repositorio.save(p);
    }

    @Override
    public Empresa eliminarEmpresa(int id) {
        Empresa p = repositorio.findOne(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
    
}
