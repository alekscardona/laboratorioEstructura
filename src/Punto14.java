import java.util.ArrayList;
import java.util.List;

public class Punto14 {

    // Función recursiva para filtrar cadenas que comienzan con una letra mayúscula
    public static List<String> filtrarMayusculas(List<String> lista) {
        // Caso base: si la lista está vacía, retorna una nueva lista vacía
        if (lista.isEmpty()) {
            return new ArrayList<>();
        }

        // Obtener la primera cadena de la lista
        String cadena = lista.get(0);

        // Llamada recursiva para el resto de la lista
        List<String> resultado = filtrarMayusculas(lista.subList(1, lista.size()));

        // Verificar si la cadena comienza con una letra mayúscula
        if (!cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0))) {
            resultado.add(0, cadena); // Agregar al inicio de la lista resultado
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Crear una lista de cadenas de ejemplo
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("mundo");
        lista.add("Java");
        lista.add("es");
        lista.add("Genial");
        lista.add("programar");

        // Filtrar las cadenas que comienzan con una letra mayúscula
        List<String> resultado = filtrarMayusculas(lista);

        // Imprimir la lista resultante
        System.out.println("Cadenas que comienzan con una letra mayúscula: " + resultado);
    }
}
