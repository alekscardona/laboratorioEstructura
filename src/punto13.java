import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class punto13 {
    public static Set<Integer> filtrarPares(Set<Integer> numeros) {
        // Caso base: Si el conjunto está vacío, devuelve un nuevo conjunto vacío
        if (numeros.isEmpty()) {
            return new HashSet<>();
        }

        // Crear un iterador para recorrer el conjunto
        Iterator<Integer> iterador = numeros.iterator();
        Integer numero = iterador.next();
        iterador.remove();  // Eliminar el elemento actual del conjunto original

        // Llamada recursiva para filtrar el resto del conjunto
        Set<Integer> paresFiltrados = filtrarPares(numeros);

        // Si el número actual es par, lo añadimos al nuevo conjunto
        if (numero % 2 == 0) {
            paresFiltrados.add(numero);
        }

        return paresFiltrados;
    }

    public static void main(String[] args) {
        // Crear un conjunto de números enteros
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        // Filtrar los números pares del conjunto
        Set<Integer> numerosPares = filtrarPares(numeros);

        // Imprimir el conjunto de números pares
        System.out.println("Números pares:");
        for (Integer numero : numerosPares) {
            System.out.println(numero);
        }
    }
}

