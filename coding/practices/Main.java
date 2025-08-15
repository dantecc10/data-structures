package coding.practices;

public class Main {
    public static void main(String[] args) {
        int[] stack = new int[6];
        int top = -1;

        // Push elements onto the stack
        for (int i = 1; i <= 6; i++) {
            if (top < stack.length - 1) {
                stack[++top] = i;
            }
        }

        // Pop elements from the stack
        while (top >= 0) {
            System.out.println("Popped: " + stack[top--]);
        }
    }
}
