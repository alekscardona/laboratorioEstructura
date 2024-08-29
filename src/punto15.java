import java.util.HashMap;
import java.util.Map;

public class punto15 {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("apple", 1);
        originalMap.put("Banana", 2);
        originalMap.put("cherry", 3);
        originalMap.put("Date", 4);
        // Filtrar el mapa usando la función recursiva
        Map<String, Integer> filteredMap = filterMapByLowercaseKeys(originalMap, new HashMap<>());
        // Imprimir el mapa filtrado
        System.out.println(filteredMap);
    }

    public static Map<String, Integer> filterMapByLowercaseKeys(Map<String, Integer> originalMap, Map<String, Integer> filteredMap) {
        // Caso base: si el mapa original está vacío, retornamos el mapa filtrado
        if (originalMap.isEmpty()) {
            return filteredMap;
        }

        // Obtener una entrada del mapa original
        Map.Entry<String, Integer> entry = originalMap.entrySet().iterator().next();
        String key = entry.getKey();
        Integer value = entry.getValue();

        if (Character.isLowerCase(key.charAt(0))) {
            filteredMap.put(key, value);
        }

        originalMap.remove(key);

        return filterMapByLowercaseKeys(originalMap, filteredMap);
    }
}
