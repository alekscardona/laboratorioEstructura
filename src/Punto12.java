package TRABAJOS.LABRATORIO;
import java.util.ArrayList;
import java.util.List;

// Clase Nodo del Árbol Binario de Búsqueda
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

// Clase Árbol Binario de Búsqueda
class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    // Método para insertar un valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        }

        return raiz;
    }

    // Método para obtener la lista en orden ascendente
    public List<Integer> obtenerElementosEnOrden() {
        List<Integer> lista = new ArrayList<>();
        recorridoInOrden(raiz, lista);
        return lista;
    }

    // Función recursiva que realiza el recorrido inorden
    private void recorridoInOrden(Nodo nodo, List<Integer> lista) {
        if (nodo == null) {
            return;
        }

        // Recorrer el subárbol izquierdo
        recorridoInOrden(nodo.izquierdo, lista);

        // Agregar el valor del nodo actual a la lista
        lista.add(nodo.valor);

        // Recorrer el subárbol derecho
        recorridoInOrden(nodo.derecho, lista);
    }
}

// Clase principal
public class Punto12 {
    public static void main(String[] args) {
        // Crear un árbol binario de búsqueda
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        // Insertar valores en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        // Obtener la lista de elementos en orden ascendente
        List<Integer> elementosEnOrden = arbol.obtenerElementosEnOrden();

        // Imprimir la lista de elementos en orden ascendente
        System.out.println("Elementos en orden ascendente: " + elementosEnOrden);
    }
}
