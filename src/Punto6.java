package TRABAJOS.LABRATORIO;

import java.util.PriorityQueue;

// Clase Tarea con prioridad
class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad; // Menor valor significa mayor prioridad

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        // La prioridad más alta (número más bajo) debería venir primero
        return Integer.compare(this.prioridad, otraTarea.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}

public class Punto6 {
    public static void main(String[] args) {
        // Crear una cola de prioridad para almacenar las tareas
        PriorityQueue<Tarea> colaTareas = new PriorityQueue<>();

        // Agregar tareas a la cola con diferentes prioridades
        colaTareas.add(new Tarea("Pagar facturas", 2));
        colaTareas.add(new Tarea("Completar proyecto de trabajo", 1));
        colaTareas.add(new Tarea("Comprar víveres", 4));
        colaTareas.add(new Tarea("Hacer ejercicio", 3));

        // Procesar las tareas en orden de prioridad
        while (!colaTareas.isEmpty()) {
            Tarea tarea = colaTareas.poll();
            System.out.println("Procesando: " + tarea);
        }
    }
}
