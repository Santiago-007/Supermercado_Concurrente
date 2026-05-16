package Procesos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Productos cliente 1
        Producto p1 = new Producto("Leche", 4000, 2);
        Producto p2 = new Producto("Pan", 3000, 1);
        Producto p3 = new Producto("Huevos", 12000, 3);

        ArrayList<Producto> productosCliente1 = new ArrayList<>();

        productosCliente1.add(p1);
        productosCliente1.add(p2);
        productosCliente1.add(p3);

        Cliente cliente1 = new Cliente("Carlos", productosCliente1);

        // Productos cliente 2
        Producto p4 = new Producto("Arroz", 5000, 2);
        Producto p5 = new Producto("Aceite", 15000, 4);

        ArrayList<Producto> productosCliente2 = new ArrayList<>();

        productosCliente2.add(p4);
        productosCliente2.add(p5);

        Cliente cliente2 = new Cliente("Laura", productosCliente2);

        long tiempoInicial = System.currentTimeMillis();

        Cajera cajera1 = new Cajera("Ana", cliente1, tiempoInicial);
        Cajera cajera2 = new Cajera("Sofia", cliente2, tiempoInicial);

        cajera1.start();
        cajera2.start();
    }
}