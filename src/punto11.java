import java.util.ArrayList;
import java.util.List;

public class punto11 {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 900.00));
        productos.add(new Producto("Teclado", 30.00));
        productos.add(new Producto("Monitor", 250.00));
        productos.add(new Producto("Mouse", 20.00));
        productos.add(new Producto("Impresora", 150.00));

        // Ordenar la lista de productos usando quicksort
        quicksort(productos, 0, productos.size() - 1);

        // Imprimir la lista de productos ordenada
        System.out.println("Productos ordenados por precio:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    // Función recursiva para ordenar una lista de productos usando quicksort
    public static void quicksort(List<Producto> productos, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(productos, inicio, fin);
            quicksort(productos, inicio, indiceParticion - 1);
            quicksort(productos, indiceParticion + 1, fin);
        }
    }

    // Función para realizar la partición de la lista
    private static int particion(List<Producto> productos, int inicio, int fin) {
        Producto pivote = productos.get(fin);
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (productos.get(j).getPrecio() <= pivote.getPrecio()) {
                i++;
                // Intercambiar productos[i] con productos[j]
                Producto temp = productos.get(i);
                productos.set(i, productos.get(j));
                productos.set(j, temp);
            }
        }
        // Intercambiar productos[i + 1] con productos[fin] (el pivote)
        Producto temp = productos.get(i + 1);
        productos.set(i + 1, productos.get(fin));
        productos.set(fin, temp);
        return i + 1;
    }


}
