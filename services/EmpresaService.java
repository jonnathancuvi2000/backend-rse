
package com.sinfloo.ejemplo01.services;

import com.sinfloo.ejemplo01.entidades.Empresa;
import java.util.List;

public interface EmpresaService {
    
    Empresa insertarEmpresa(Empresa p);
    List<Empresa> listarEmpresas();
    Empresa listarEmpresaID(int id);
    Empresa editarEmpresa(Empresa p);
    Empresa eliminarEmpresa(int id);
}
