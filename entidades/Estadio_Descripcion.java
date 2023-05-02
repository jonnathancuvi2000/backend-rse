
package com.sinfloo.ejemplo01.entidades;

import javax.persistence.*;

@Entity
@Table(name = "estadio_descrpcion")
public class Estadio_Descripcion {
    
    @Id
    @Column(name = "Estadio_Descripcion_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Estadio_Descripcion_ID;
    @Column(name = "descripcion")
    private String descripcion;
    
    //@Column(name = "Estadio_Nombre_ID")
    //private String Estadio_Nombre_ID;
    
    @ManyToOne
    @JoinColumn(name = "Estadio_Nombre_ID")
    private Estadio_Nombre estadio_Nombre;
    
    @ManyToOne
    @JoinColumn(name = "Indicador_ID")
    private Indicador indicador;

    public Indicador getIndicador() {
        return indicador;
    }

    public void setIndicador(Indicador indicador) {
        this.indicador = indicador;
    }
    
    
    

    public Estadio_Nombre getEstadio_Nombre() {
        return estadio_Nombre;
    }

    public void setEstadio_Nombre(Estadio_Nombre estadio_Nombre) {
        this.estadio_Nombre = estadio_Nombre;
    }

    
    
    
    public int getEstadio_Descripcion_ID() {
        return Estadio_Descripcion_ID;
    }

    public void setEstadio_Descripcion_ID(int Estadio_Descripcion_ID) {
        this.Estadio_Descripcion_ID = Estadio_Descripcion_ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
}
