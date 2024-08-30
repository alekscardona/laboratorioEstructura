import java.util.LinkedList;
import java.util.Queue;

// Clase Producto
class ColaProducto {
    private String nombre;
    private double valor;

    public ColaProducto(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}

// Clase Main separada de Punto10ColaProducto
public class Punto10     {

    // Función recursiva que filtra productos en base a una condición
    public static Queue<ColaProducto> filtrarProductos(Queue<ColaProducto> productos, double limiteValor) {
        // Caso base: si la cola está vacía, devuelve una nueva cola vacía
        if (productos.isEmpty()) {
            return new LinkedList<>();
        }

        // Hacer una copia de la cola para no modificar la original
        Queue<ColaProducto> copiaProductos = new LinkedList<>(productos);

        // Tomar el primer producto de la cola
        ColaProducto productoActual = copiaProductos.poll();

        // Llamada recursiva para el resto de la cola
        Queue<ColaProducto> resultado = filtrarProductos(copiaProductos, limiteValor);

        // Si el producto cumple con la condición, agregarlo a la cola resultado
        if (productoActual.getValor() < limiteValor) {
            resultado.add(productoActual);
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Crear una cola de productos
        Queue<ColaProducto> productos = new LinkedList<>();
        productos.add(new ColaProducto("Producto1", 15.50));
        productos.add(new ColaProducto("Producto2", 7.99));
        productos.add(new ColaProducto("Producto3", 5.00));
        productos.add(new ColaProducto("Producto4", 12.00));
        productos.add(new ColaProducto("Producto5", 9.99));

        // Filtrar productos cuyo valor sea menor que 10
        Queue<ColaProducto> productosFiltrados = filtrarProductos(productos, 10.0);

        // Imprimir los productos filtrados
        System.out.println("Productos que cumplen la condición (valor < 10):");
        for (ColaProducto producto : productosFiltrados) {
            System.out.println(producto);
        }
    }
}
