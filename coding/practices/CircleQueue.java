package coding.practices;

public class CircleQueue {
    private int[] circuleQueue;
    private int front, end, max;

    public CircleQueue(int size) {
        max = size;
        circuleQueue = new int[max];
        front = 0;
        end = 0;
    }

    public static void main(String[] args) {
        CircleQueue circleQueue = new CircleQueue(5);
        circleQueue.enqueue(1);
        circleQueue.enqueue(2);
        circleQueue.enqueue(3);
        circleQueue.show();
        circleQueue.enqueue(4);
        circleQueue.dequeue();
        circleQueue.dequeue();
        circleQueue.show();
        //queue.enqueue(12);
    }

    public void show() {
        if(!empty()) {
            System.out.print("Elementos en la cola circular: ");
            for (int i = front; i <= end; i++) {
                System.out.print(circuleQueue[i] + " ");
            }
            System.out.print("\n");
            System.out.println("El frente es: [" + front + "] = " + circuleQueue[front] + "\n");
            System.out.println("El final es: [" + end + "] = " + circuleQueue[end] + "\n");
            System.out.println("El tamaño es: " + max + "\n");
        } else {
            System.out.println("La cola circular está vacía");
        }
    }

    public void enqueue(int value) {
        if (!full()) {
            end++;
            circuleQueue[end] = value;
            if (front == 0) {
                front++;
            }
        } else {
            System.out.println("La cola circular está llena");
        }
    }

    void dequeue() {
        if (!empty()) {
            front++;
        } else {
            System.out.println("La cola circular está vacía");
        }
    }

    public Boolean empty() {
        return ((front == end) && (front == 0));
    }

    public Boolean full() {
        return (end == max);
    }


}
