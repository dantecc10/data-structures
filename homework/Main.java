package homework;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Player> pila = new Stack<>();
        Queue<Player> cola = new LinkedList<>();
        pila.add(new Player("Harry", "Kane", "FC Bayern München", "9"));
        pila.add(new Player("Michael", "Olise", "FC Bayern München", "17"));
        pila.add(new Player("Luis", "Díaz", "FC Bayern München", "14"));

        cola.add(new Player("Erling", "Haaland", "Manchester City", "9"));
        cola.add(new Player("Omar", "Marmoush", "Manchester City", "7"));
        cola.add(new Player("Phil", "Foden", "Manchester City", "47"));

        while (!pila.isEmpty()) {
            Player cachar = pila.pop();
            System.out.println("Se sacó a: " + cachar.name + " " + cachar.last_name + " con el dorsal " + cachar.number + " del " + cachar.team);
        }

        while (!cola.isEmpty()) {
            Player cachar = cola.poll();
            System.out.println("Se sacó a: " + cachar.name + " " + cachar.last_name + " con el dorsal " + cachar.number + " del " + cachar.team);
        }
    }
}
