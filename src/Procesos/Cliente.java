package Procesos;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private ArrayList<Producto> productos;

    public Cliente(String nombre, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double calcularTotal() {

        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }
}
