import java.util.ArrayList;
import java.util.List;

public class punto7  {
    public static void main(String[] args) {
        // Crear una lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 17, "Masculino"));
        personas.add(new Persona("Ana", 22, "Femenino"));
        personas.add(new Persona("Beatriz", 16, "Femenino"));
        personas.add(new Persona("Juan", 20, "Masculino"));

        List<Persona> mayoresDeEdad = filtrarMayoresDeEdad(personas, 0);
        System.out.println("Personas mayores de edad:");
        for (Persona p : mayoresDeEdad) {
            System.out.println(p);
        }
    }


    // Función recursiva para filtrar personas mayores de edad
    public static List<Persona> filtrarMayoresDeEdad(List<Persona> personas, int indice) {
        // Caso base: Si el índice alcanza el tamaño de la lista, devuelve una lista vacía
        if (indice >= personas.size()) {
            return new ArrayList<>();
        }

        // Lista resultante de la llamada recursiva
        List<Persona> resultado = filtrarMayoresDeEdad(personas, indice + 1);

        // Si la persona en el índice actual es mayor de edad, la añadimos a la lista resultado
        if (personas.get(indice).getEdad() >= 18) {
            resultado.add(personas.get(indice));
        }

        return resultado;
    }


}



