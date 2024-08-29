import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class punto1 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        // Agregando personas a la lista
        personas.add(new Persona("Carlos", 25, "Masculino"));
        personas.add(new Persona("Ana", 22, "Femenino"));
        personas.add(new Persona("Beatriz", 30, "Femenino"));
        personas.add(new Persona("Juan", 28, "Masculino"));
        //lista de personas
        System.out.println("Lista de personas:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        // Ordenando por edad (default)
        Collections.sort(personas);
        System.out.println(" ");
        System.out.println("Personas ordenadas por edad:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        // Ordenando por nombre
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });

        System.out.println("\nPersonas ordenadas por nombre:");
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}




