
package com.sinfloo.ejemplo01.repository;


import com.sinfloo.ejemplo01.entidades.Estadio_Descripcion;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface Estadio_Descripcion_Repositorio extends Repository<Estadio_Descripcion, Integer>{
    List<Estadio_Descripcion>findAll();
    Estadio_Descripcion findOne(int id);
    Estadio_Descripcion save(Estadio_Descripcion p);
    void delete(Estadio_Descripcion p);
    
    
    @Query(value = "SELECT * FROM estadio_descrpcion ",
            nativeQuery = true)
    List<Estadio_Descripcion> listar_esatdio_descripciones();
}
