package TRABAJOS.LABRATORIO;

import java.util.HashMap;
import java.util.Map;

public class Punto8 {

    // Función recursiva que filtra las entradas con claves pares
    public static Map<Integer, String> filtrarPares(Map<Integer, String> mapa) {
        // Caso base: si el mapa está vacío, retorna un nuevo mapa vacío
        if (mapa.isEmpty()) {
            return new HashMap<>();
        }

        // Obtener una clave del mapa
        Integer clave = mapa.keySet().iterator().next();
        String valor = mapa.get(clave);

        // Remover la clave actual para evitar modificar el mapa original
        mapa.remove(clave);

        // Llamada recursiva para el resto del mapa
        Map<Integer, String> resultado = filtrarPares(mapa);

        // Si la clave es par, agregarla al resultado
        if (clave % 2 == 0) {
            resultado.put(clave, valor);
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Crear un mapa de ejemplo
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");
        mapa.put(5, "Cinco");

        // Filtrar las entradas con claves pares
        Map<Integer, String> mapaPares = filtrarPares(mapa);

        // Imprimir el mapa resultante
        System.out.println("Mapa original: " + mapa);
        System.out.println("Mapa con claves pares: " + mapaPares);
    }
}
