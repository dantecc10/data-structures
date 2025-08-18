package coding.practices;

public class Stack {
    //int[] stack = {0, 0, 0, 0, 0, 0};
    //int start = 0, top = 0;
    private int[] stack;
    private int start, top, size;
    private String printMessage = "";

    public Stack(){
        // Sea el tamaño de la pila 10
        size = 10;
        stack = new int[size + 1]; // +1 para manejar el índice 0 sin usarlo
        start = 0;
        top = 0;
        
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        // Sean los valores 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
        // Agregamos los primeros 5 valores.
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(16);
        stack.push(25);

        // Muestro el último valor agregado
        System.out.println("El último valor agregado es: " + stack.top());

        // Saco un valor de la pila (el mismo que mostré)
        stack.pop();

        // Muestro el último valor de la pila (ahora debe ser diferente y menor)
        System.out.println("El último valor en la fila es: " + stack.top());

        // Agrego los demás valores
        stack.push(36);
        stack.push(49);
        stack.push(64);
        stack.push(81);
        stack.push(100);

        // La fila no debería estar llena porque saqué antes un valor
        System.out.println((stack.full()) ? ("La pila está llena") : ("La pila no está llena"));

        // Muestro el último valor agregado
        System.out.println("El último valor agregado es: " + stack.top());        
    }

    public boolean full() {
        return (top == stack.length - 1);
    }

    public boolean empty() {
        return (top == 0);
    }

    public void push(int value) {
        if (!full()) {
            top++;
            stack[top] = value; // Corrected assignment
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!empty()) {
            top--;
        } else {
            System.out.println("Stack is empty");
        }
    }

    public int top() { // También conocida como show
        if (!empty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1; // Meaningful value indicating empty stack
        }
    }

    /* Para depuración
    public String print() {
        printMessage = "Stack contents: ";
        for (int i = start; i <= top; i++) {
            printMessage += stack[i] + " ";
        }
        return printMessage;
    }
    */
}
