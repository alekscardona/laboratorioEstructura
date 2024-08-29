import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class punto5 {

        public static void main(String[] args) {
            // Crear un HashSet que no permite duplicados
            Set<String> conjunto = new HashSet<>();

            // Agregar elementos al conjunto
            conjunto.add("Elemento 1");
            conjunto.add("Elemento 2");
            conjunto.add("Elemento 3");
            conjunto.add("Elemento 1");
            conjunto.add("Elemento 2");

            // Imprimir los elementos usando un iterador
            Iterator<String> iterador = conjunto.iterator();

            System.out.println("Contenido del conjunto:");
            while (iterador.hasNext()) {
                System.out.println(iterador.next());
            }
        }
    }



