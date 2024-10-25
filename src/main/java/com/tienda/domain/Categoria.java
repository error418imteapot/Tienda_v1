package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

//clase de datos
@Data
//relacionados a una entidad: se va a mapear con una tabla de la BD
@Entity
//la tabla a la que se va a relacionar
@Table(name="categoria")

/*define la clase y se le implementa el serializable: 
es util para almacenar y transmitir info de los objetos
modificar o guardar informacion*/
public class Categoria implements Serializable {
    
    //aseguramos que se pueda modificar objetos de la clase sin problemas por compatibilidad de las variables
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
}