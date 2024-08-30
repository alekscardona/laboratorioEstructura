import java.util.Stack;
import java.util.function.Predicate;

public class Punto16 {


    // Función recursiva para filtrar elementos de una pila según una condición
    public static <T> Stack<T> filtrarPila(Stack<T> pila, Predicate<T> condicion) {
        // Caso base: si la pila está vacía, devuelve una nueva pila vacía
        if (pila.isEmpty()) {
            return new Stack<>();
        }

        // Sacar el elemento en la cima de la pila
        T elementoActual = pila.pop();

        // Llamada recursiva para el resto de la pila
        Stack<T> resultado = filtrarPila(pila, condicion);

        // Si el elemento cumple con la condición, agregarlo a la pila resultado
        if (condicion.test(elementoActual)) {
            resultado.push(elementoActual);
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Crear una pila de enteros
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(5);
        pila.push(15);
        pila.push(7);
        pila.push(20);

        // Definir la condición: mantener solo los elementos mayores que 10
        Predicate<Integer> condicion = valor -> valor > 10;

        // Filtrar la pila según la condición
        Stack<Integer> pilaFiltrada = filtrarPila(pila, condicion);

        // Imprimir la pila filtrada
        System.out.println("Pila que cumple la condición (valor > 10): " + pilaFiltrada);
    }
}
