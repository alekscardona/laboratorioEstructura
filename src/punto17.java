import java.util.*;

public class punto17 {
    public static void main(String[] args) {
        // Lista de HashMap
        List<HashMap<String, Integer>> hashMapList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("manzana", 15);
        hashMap.put("pera", 20);
        hashMapList.add(hashMap);

        // Lista de LinkedHashMap
        List<LinkedHashMap<String, Integer>> linkedHashMapList = new ArrayList<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("amarillo", 15);
        linkedHashMap.put("verde", 20);
        linkedHashMapList.add(linkedHashMap);

        // Lista de TreeMap
        List<TreeMap<String, Integer>> treeMapList = new ArrayList<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("dos", 15);
        treeMap.put("uno", 25);
        treeMapList.add(treeMap);

        // Imprimir los mapas
        System.out.println("HashMap: " + hashMapList.get(0));
        System.out.println("LinkedHashMap: " + linkedHashMapList.get(0));
        System.out.println("TreeMap: " + treeMapList.get(0));
    }
}
/*
HashMap: No garantiza un orden, muy eficiente para operaciones básicas.
LinkedHashMap: Mantiene el orden de inserción, adecuado cuando el orden es importante.
TreeMap: Mantiene las claves ordenadas, útil cuando se requiere ordenación automática.
*/
