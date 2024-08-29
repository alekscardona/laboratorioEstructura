import java.util.Stack;

public class punto9 {
    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(2);
        originalStack.push(8);
        originalStack.push(3);
        originalStack.push(10);
        originalStack.push(5);
        Stack<Integer> filteredStack = filterStack(originalStack, new Stack<>());

        // Imprimir la pila filtrada
        System.out.println("Pila original: " + originalStack);
        System.out.println("Pila filtrada (valores > 5): " + filteredStack);
    }

    public static Stack<Integer> filterStack(Stack<Integer> originalStack, Stack<Integer> filteredStack) {
        if (originalStack.isEmpty()) {
            return filteredStack;
        }
        // Obtener el elemento superior de la pila original
        Integer element = originalStack.pop();
        if (element > 5) {
            filteredStack.push(element);
        }
        Stack<Integer> resultStack = filterStack(originalStack, filteredStack);
        originalStack.push(element);

        return resultStack;
    }
}

