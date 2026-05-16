package Procesos;

public class Cajera extends Thread {

    private String nombre;
    private Cliente cliente;
    private long tiempoInicial;

    public Cajera(String nombre, Cliente cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    @Override
    public void run() {

        System.out.println("La cajera " + nombre
                + " comienza a atender a "
                + cliente.getNombre());

        int tiempoTotal = 0;

        for (Producto producto : cliente.getProductos()) {

            tiempoTotal += producto.getTiempoProcesamiento();

            System.out.println("Procesando producto: "
                    + producto.getNombre()
                    + " | Precio: $" + producto.getPrecio()
                    + " | Tiempo: "
                    + producto.getTiempoProcesamiento()
                    + " segundos");

            try {
                Thread.sleep(producto.getTiempoProcesamiento() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total compra: $" + cliente.calcularTotal());
        System.out.println("Tiempo total: " + tiempoTotal + " segundos");

        long tiempoFinal = (System.currentTimeMillis() - tiempoInicial) / 1000;

        System.out.println("La cajera " + nombre
                + " terminó en "
                + tiempoFinal + " segundos");
    }
}