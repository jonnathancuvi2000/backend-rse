
package com.sinfloo.ejemplo01.repository;

import com.sinfloo.ejemplo01.entidades.Estadio_Nombre;
import com.sinfloo.ejemplo01.entidades.Indicador;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface Estadio_Nombre_Repositorio extends Repository<Estadio_Nombre, Integer>{
    List<Estadio_Nombre>findAll();
    Estadio_Nombre findOne(int id);
    Estadio_Nombre save(Estadio_Nombre p);
    void delete(Estadio_Nombre p);
    @Query(value = "SELECT * FROM estadio_nombre ",
            nativeQuery = true)
    List<Estadio_Nombre> listar_esatdio_nombres_descripciones();
}
