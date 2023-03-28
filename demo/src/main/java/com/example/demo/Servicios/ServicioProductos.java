package com.example.demo.Servicios;

import com.example.demo.Entidades.Productos;

import java.util.ArrayList;

public class ServicioProductos {

    private ArrayList<Productos> lista = new ArrayList<>();

    public ServicioProductos() {
        lista.add(new Productos(1,"Pollo","Carnes",3000,5,0,0,0));
        lista.add(new Productos(2,"Lechuga","Vegetales",1500,6,0,0,0));
        lista.add(new Productos(3,"Huevos","Lacteos",12000,2,0,0,0));
        lista.add(new Productos(4,"Papa","Tuberculos",2500,5,0,0,0));
        lista.add(new Productos(5,"Durazno","Fruta",5000,10,0,0,0));
        lista.add(new Productos(6,"Calabaza","Vegetal",1400,3,0,0,0));
        lista.add(new Productos(7,"Pera","Fruta",1000,11,0,0,0));
        lista.add(new Productos(8,"Zanahoria","Vegetal",2000,4,0,0,0));
        lista.add(new Productos(9,"Carne","Carnes",2100,3,0,0,0));
        lista.add(new Productos(10,"Sabila","Planta",10000,2,0,0,0));
    }

    public ArrayList<Productos> ListarProductos(){
        return lista;
    }

    public String InsertarProductos(Productos producto) {
        lista.add(producto);
        return "Se agrego correctamente";
    }

    public double totalProductos(){
        double total=0;
        double totalCompra=0;
        for (int i=0;i<lista.size();i++){
            total = lista.get(i).getPrecio() * lista.get(i).getCantidad();
            lista.get(i).setTotal(total);
            totalCompra+=total;
        }
        return totalCompra;
    }

    public double totalDescProducto() {
        double desc = 0;
        double f = 0;
        double a = 0;
        for (int i = 0; i < lista.size(); i++) {
            desc = lista.get(i).getPrecio() * 0.15;
            lista.get(i).setTotalDesc(desc);
        }
        return desc;
    }

    public double PrecioFinal() {
        double preciof;
        double f = 0;
        for (int i = 0; i < lista.size(); i++) {
            preciof = lista.get(i).getTotal() - lista.get(i).getTotalDesc();
            lista.get(i).setPreciofinal(preciof);
            f+=preciof;
        }
        return f;
    }


}
