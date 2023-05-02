
package com.sinfloo.ejemplo01.entidades;

import javax.persistence.*;

@Entity
@Table(name = "estadio_nombre")
public class Estadio_Nombre {
    
    @Id
    @Column(name = "Estadio_Nombre_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Estadio_Nombre_ID;
    @Column(name = "nombre_estadio")
    private String nombre_estadio;
    @Column(name = "descripcion")
    private String descripcion;

    public int getEstadio_Nombre_ID() {
        return Estadio_Nombre_ID;
    }

    public void setEstadio_Nombre_ID(int Estadio_Nombre_ID) {
        this.Estadio_Nombre_ID = Estadio_Nombre_ID;
    }

    public String getNombre_estadio() {
        return nombre_estadio;
    }

    public void setNombre_estadio(String nombre_estadio) {
        this.nombre_estadio = nombre_estadio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
