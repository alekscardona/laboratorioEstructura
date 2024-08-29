package TRABAJOS.LABRATORIO;

import java.util.Stack;

class TipoPila {
    private Stack<Object> stack;

    public TipoPila() {
        this.stack = new Stack<>();
    }

    // Método para verificar el tipo del objeto en la cima
    private boolean tipoCoincide(Object obj) {
        if (stack.isEmpty()) {
            return true; // Si la pila está vacía, cualquier tipo es aceptado
        }
        return stack.peek().getClass().equals(obj.getClass());
    }

    // Método para empujar un elemento a la pila
    public void push(Object obj) {
        if (tipoCoincide(obj)) {
            stack.push(obj);
            System.out.println("Elemento insertado: " + obj);
        } else {
            System.out.println("Error: El tipo del objeto no coincide con el tipo del elemento en la cima de la pila.");
        }
    }

    // Método para sacar el elemento de la pila
    public Object pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        System.out.println("Error: La pila está vacía.");
        return null;
    }

    // Método para ver el elemento en la cima de la pila sin eliminarlo
    public Object peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        System.out.println("Error: La pila está vacía.");
        return null;
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class Punto4 {
    public static void main(String[] args) {
        TipoPila pila = new TipoPila();

        // Inserta elementos en la pila
        pila.push(10); // Inserta un entero
        pila.push(20); // Inserta otro entero
        pila.push("Hola"); // Error, no coincide el tipo (String vs Integer)

        pila.push(30); // Inserta otro entero
        System.out.println("Elemento en la cima: " + pila.peek());

        // Remueve el elemento de la cima
        pila.pop();

        // Ahora intenta insertar un String
        pila.push("Mundo"); // Correcto, la pila ahora está vacía

        // Verifica la cima de la pila
        System.out.println("Elemento en la cima: " + pila.peek());
    }
}
