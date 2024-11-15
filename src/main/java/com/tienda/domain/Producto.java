/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
//clase de datos
@Data
//relacionados a una entidad: se va a mapear con una tabla de la BD
@Entity
//la tabla a la que se va a relacionar
@Table(name="producto")

/**
 *
 * @author Jess
 */

/*define la clase y se le implementa el serializable: 
es util para almacenar y transmitir info de los objetos
modificar o guardar informacion*/
public class Producto implements Serializable {
    
    //aseguramos que se pueda modificar objetos de la clase sin problemas por compatibilidad de las variables
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id_producto")
    private Long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    private String detalle;
    private double precio;
    private int existencias;
    private Long idCategoria;

    public Producto() {
    }

    public Producto(String producto, boolean activo) {
        this.descripcion = producto;
        this.activo = activo;
    }
}
