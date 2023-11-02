import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        minpq.offer(10);
        minpq.offer(100);
        minpq.offer(-1);
        minpq.offer(0);

        while(!minpq.isEmpty()){
            int val = minpq.poll();
            System.out.print(val+" ");
        }
        System.out.println("-----");
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxpq.add(-1);
        maxpq.add(-1000);
        maxpq.add(70000);
        maxpq.add(100);

        while(!maxpq.isEmpty()){
            int val = maxpq.poll();
            System.out.print(val+" ");
        }
    }
}