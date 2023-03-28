package com.example.demo.Controladores;

import com.example.demo.Entidades.Productos;
import com.example.demo.Servicios.ServicioProductos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorProductos {

    ServicioProductos servicio = new ServicioProductos();
    @GetMapping("/ListaProductos")
    public ArrayList<Productos> listar() {
            return servicio.ListarProductos();
    }

    @PostMapping("/InsertarProducto")
    public String InsertarProducto(@RequestBody Productos producto) {

        return servicio.InsertarProductos(producto);
    }

    @GetMapping("/TotalProductos")
    public String TotalProductos(){
        return "Valor de la compra: " + servicio.totalProductos();
    }

    @GetMapping("/TotalDescProductos")
    public String TotalDescProductos(){
        return "Valor con descuento: " + servicio.totalDescProducto();
    }

    @GetMapping("/PrecioFinal")
    public String PrecioFinal(){
        return "Precio Final: " + servicio.PrecioFinal();
    }

}
