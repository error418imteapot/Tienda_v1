package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    // Se obtiene un listado de categorias en un List
    public List<Producto> getProductos(boolean activos);
    
    //Se obtiene un Producto, a partir del id de un producto
    public Producto getProfucto (Producto producto);
    
    //Se inserta una nueva producto si el id del producto esta vacio
    //Se actualiza un producto si el id del producto NO esta vacio
    public void save (Producto producto);
    
    //Se elimina por id
    public void delete(Producto producto);
 
}