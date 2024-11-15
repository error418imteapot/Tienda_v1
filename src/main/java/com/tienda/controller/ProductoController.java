package com.tienda.controller;

import com.tienda.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/categoria")
public class ProductoController {
    
    @Autowired
    private ProductoService categoriaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var categorias = categoriaService.getProductos(false);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalProductos", categorias.size());
        return "/categoria/listado";
    }
}