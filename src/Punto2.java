package TRABAJOS.LABRATORIO;

import java.util.Objects;
import java.util.TreeSet;

class Producto implements Comparable<Producto> {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return this.codigo.compareTo(otroProducto.codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

class Empresa {
    private TreeSet<Producto> productos;

    public Empresa() {
        this.productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}

public class Punto2 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Agregar productos a la empresa
        empresa.agregarProducto(new Producto("001", "Helado de Fresa", 2.50));
        empresa.agregarProducto(new Producto("002", "Waffle con Helado", 3.75));
        empresa.agregarProducto(new Producto("003", "Fresas con Crema", 4.00));

        // Mostrar todos los productos
        System.out.println("Lista de productos:");
        empresa.mostrarProductos();

        // Buscar un producto por código
        String codigoABuscar = "002";
        Producto productoEncontrado = empresa.buscarProductoPorCodigo(codigoABuscar);

        if (productoEncontrado != null) {
            System.out.println("\nProducto encontrado: " + productoEncontrado);
        } else {
            System.out.println("\nProducto con código " + codigoABuscar + " no encontrado.");
        }
    }
}
