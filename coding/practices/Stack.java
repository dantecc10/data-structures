package coding.practices;

public class Stack {
    //int[] stack = {0, 0, 0, 0, 0, 0};
    //int start = 0, top = 0;
    private int[] stack;
    private int start, top, size;

    public Stack(){
        size = 6;
        stack = new int[size];
        start = 0;
        top = 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Stack full: " + stack.full());
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

    public int show() {
        if (!empty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1; // Meaningful value indicating empty stack
        }
    }
}
