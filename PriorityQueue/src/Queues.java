import java.util.ArrayDeque;

public class Queues {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(100);
        q.addLast(90);
        q.addLast(77);

        int element = q.removeFirst();
        System.out.println(element);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(199);
        stack.addFirst(200);
        stack.addFirst(201);
        for(Integer ele: stack){
            System.out.println(ele);
        }
        element = stack.removeFirst();
        System.out.println(element);
    }
}
