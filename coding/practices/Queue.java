package coding.practices;

public class Queue {
    private int[] queue;
    private int start, end, size;
    private String printMessage = "";

    public Queue() {
        // Sea el tamaño de la cola 10
        size = 10;
        queue = new int[size + 1]; // +1 para manejar el índice 0 sin usarlo
        start = 0;
        end = 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        // Sean los valores 1, 2, 3, 4, 5
        // Agregamos los primeros 5 valores.
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Muestro el primer valor agregado
        System.out.println("El primer valor agregado es: " + queue.getFront());

        // Saco un valor de la cola (el mismo que mostré)
        queue.dequeue();

        // Muestro el primer valor de la cola (ahora debe ser diferente y mayor)
        System.out.println("El primer valor en la cola es: " + queue.getFront());

        // Agrego los demás valores
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);

        // La cola no debería estar llena porque saqué antes un valor
        System.out.println((queue.full()) ? ("La cola está llena") : ("La cola no está llena"));

        // Muestro el último valor agregado
        System.out.println("El último valor agregado es: " + queue.getRear());
    }

    public Boolean full() {
        return (end == size);
    }

    public Boolean empty() {
        return ((start == end) && (start == 0));
    }

    public void enqueue(int value) { // (Insertar)
        if (empty()) {
            start++;
        }
        end++;
        queue[end] = value;
    }

    public void dequeue() { // (Eliminar)
        if (!empty()) {
            start++;
        } else {
            System.out.println("La cola está vacía");
        }
    }

    public int getFront() { // (Obtener el primer elemento)
        if (!empty()) {
            return queue[start];
        } else {
            System.out.println("La cola está vacía");
            return -1; // Valor de error
        }
    }

    public int getRear() { // (Obtener el último elemento)
        if (!empty()) {
            return queue[end];
        } else {
            System.out.println("La cola está vacía");
            return -1; // Valor de error
        }
    }

    /*
    public String print() {
        printMessage = "Queue contentes: ";
        for (int i = start + 1; i <= end; i++) {
            printMessage += queue[i] + " ";
        }
        return printMessage;
    }
    */
}
